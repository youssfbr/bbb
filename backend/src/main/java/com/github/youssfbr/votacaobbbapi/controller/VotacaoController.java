package com.github.youssfbr.votacaobbbapi.controller;

import com.github.youssfbr.votacaobbbapi.model.ParticipanteModel;
import com.github.youssfbr.votacaobbbapi.service.VotacaoService;

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
