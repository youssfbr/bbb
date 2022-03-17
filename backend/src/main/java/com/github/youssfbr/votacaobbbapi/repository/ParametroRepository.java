package com.github.youssfbr.votacaobbbapi.repository;

import com.github.youssfbr.votacaobbbapi.model.ParametroModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParametroRepository extends MongoRepository<ParametroModel, String> {
}
