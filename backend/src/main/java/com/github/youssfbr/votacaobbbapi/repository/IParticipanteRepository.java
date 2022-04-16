package com.github.youssfbr.votacaobbbapi.repository;

import com.github.youssfbr.votacaobbbapi.model.ParticipanteModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IParticipanteRepository extends MongoRepository<ParticipanteModel, String> {
}
