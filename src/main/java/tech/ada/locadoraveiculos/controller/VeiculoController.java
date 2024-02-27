package tech.ada.locadoraveiculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tech.ada.locadoraveiculos.model.Veiculo;
import tech.ada.locadoraveiculos.service.VeiculoService;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @PostMapping("/criar")
    public ResponseEntity<String> criarVeiculo(@RequestBody Veiculo veiculo) {
        veiculoService.criarVeiculo(veiculo);
        return ResponseEntity.ok(String.format("Veiculo com placa %s, criado com sucesso!", veiculo.getPlaca()));
    }

    @GetMapping("/todos")
    public ResponseEntity<List<Veiculo>> todos() {
        List<Veiculo> veiculos = veiculoService.listarTodos();
        return ResponseEntity.ok(veiculos);
    }

    @GetMapping("/por-id/{id}")
    public ResponseEntity<Veiculo> buscarPorId(@PathVariable("id") Long id) {
        Veiculo veiculo = veiculoService.buscarVeiculoPorId(id);
        if (veiculo != null) {
            return ResponseEntity.ok(veiculo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/alterar")
    public ResponseEntity<Veiculo> alterar(@RequestBody Veiculo veiculo) {
        Veiculo veiculoAtualizado = veiculoService.alterarVeiculo(veiculo);
        if (veiculoAtualizado != null) {
            return ResponseEntity.ok(veiculoAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/por-placa/{placa}")
    public ResponseEntity<Veiculo> buscarPorPlaca(@PathVariable("placa") String placa) {
        Veiculo veiculo = veiculoService.buscarVeiculoPorPlaca(placa);
        if (veiculo != null) {
            return ResponseEntity.ok(veiculo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/remover-por-id/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        veiculoService.deletarVeiculo(id);
        return ResponseEntity.ok(String.format("Veiculo com id %d, removido com sucesso!", id));
    }
}
