package com.github.youssfbr.votacao.bbb.api.controller;

import com.github.youssfbr.votacao.bbb.api.service.VotacaoService;
import com.github.youssfbr.votacao.bbb.api.model.ParticipanteModel;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/votacao")
@RequiredArgsConstructor
public class VotacaoController {

    private final VotacaoService votacaoService;

    @PostMapping
    public String votar(@RequestBody ParticipanteModel participante) {
        votacaoService.adicionarEvento(participante);
        return "Voto computado.";
    }

}
