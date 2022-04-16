package com.github.youssfbr.votacao.bbb.api.repository;

import com.github.youssfbr.votacao.bbb.api.model.ParametroModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IParametroRepository extends MongoRepository<ParametroModel, String> {
}
