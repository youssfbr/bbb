package com.github.youssfbr.votacaobbbapi.controller;

import com.github.youssfbr.votacaobbbapi.model.ParametroModel;
import com.github.youssfbr.votacaobbbapi.repository.IParametroRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api/parametros")
@RequiredArgsConstructor
public class ParametroController {

    private final IParametroRepository repository;

    @PostMapping("/salvar")
    public ParametroModel salvar(@RequestBody ParametroModel parametro) {
        return repository.save(parametro);
    }

    @GetMapping("/consultar")
    public ResponseEntity<ParametroModel> consultar(@RequestParam String chave) {
        Optional<ParametroModel> optParametro = repository.findById(chave);
        if (optParametro.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(optParametro.get());
    }
}
