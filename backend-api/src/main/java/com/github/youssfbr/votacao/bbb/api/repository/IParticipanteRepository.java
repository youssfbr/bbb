package com.github.youssfbr.votacao.bbb.api.repository;

import com.github.youssfbr.votacao.bbb.api.model.ParticipanteModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IParticipanteRepository extends MongoRepository<ParticipanteModel, String> {
}
