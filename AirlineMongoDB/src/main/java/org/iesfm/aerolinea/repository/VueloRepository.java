package org.iesfm.aerolinea.repository;

import org.iesfm.aerolinea.pojos.Vuelo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VueloRepository extends MongoRepository<Vuelo, Integer> {

}