package com.github.youssfbr.votacaobbbapi.controller;

import com.github.youssfbr.votacaobbbapi.model.ParticipanteModel;
import com.github.youssfbr.votacaobbbapi.repository.IParticipanteRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api/participantes")
@RequiredArgsConstructor
public class ParticipanteController {

    private final IParticipanteRepository repository;

    @PostMapping("/salvar")
    public ParticipanteModel salvar(@RequestBody ParticipanteModel participante) {
        return repository.save(participante);
    }

    @GetMapping("/consultar")
    public ResponseEntity<ParticipanteModel> consultar(@RequestParam String id) {
        Optional<ParticipanteModel> optParticipante = repository.findById(id);
        if (optParticipante.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(optParticipante.get());
    }
}
