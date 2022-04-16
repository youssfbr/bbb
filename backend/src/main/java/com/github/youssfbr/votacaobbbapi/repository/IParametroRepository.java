package com.github.youssfbr.votacaobbbapi.repository;

import com.github.youssfbr.votacaobbbapi.model.ParametroModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IParametroRepository extends MongoRepository<ParametroModel, String> {
}
