package com.restfulApi.mongo.repositories;

import com.restfulApi.mongo.model.Buku;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BukuRepository extends MongoRepository<Buku, String>{
    Buku findBy_id(ObjectId _id);
}
