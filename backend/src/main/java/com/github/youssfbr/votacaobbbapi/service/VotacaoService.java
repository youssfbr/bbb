package com.github.youssfbr.votacaobbbapi.service;

import com.github.youssfbr.votacaobbbapi.model.ParticipanteModel;

import lombok.RequiredArgsConstructor;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class VotacaoService {

    private static final String TOPICO_VOTACAO = "votacao";

    private final KafkaTemplate<Object, Object> template;

    public void adicionarEvento(ParticipanteModel participante) {
        template.send(TOPICO_VOTACAO, participante);

    }

}
