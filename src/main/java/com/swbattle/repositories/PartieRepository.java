package com.swbattle.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.swbattle.models.Partie;

public interface PartieRepository extends MongoRepository<Partie, String>{

}
