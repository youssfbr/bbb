package com.github.youssfbr.votacaobbbapi.controller;

import com.github.youssfbr.votacaobbbapi.model.ParametroModel;
import com.github.youssfbr.votacaobbbapi.repository.ParametroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/parametros")
@RequiredArgsConstructor
public class ParametroController {

    private final ParametroRepository repository;

    @PostMapping("/salvar")
    public ResponseEntity<ParametroModel> salvar(@RequestBody ParametroModel parametro) {
        ParametroModel entidade = repository.save(parametro);
        return ResponseEntity.ok(entidade);
    }

    @GetMapping
    public ResponseEntity<ParametroModel> consulta(@RequestParam String chave) {
        Optional<ParametroModel> optParametro = repository.findById(chave);
        if (optParametro.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(optParametro.get());
    }
}
