package org.iesfm.aerolinea.repository;

import org.iesfm.aerolinea.pojos.Pasajero;
import org.iesfm.aerolinea.pojos.PasajeroId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PasajeroRepository extends MongoRepository<Pasajero, PasajeroId> {

    Pasajero findByNumeroVueloAndNif (int numeroVuelo, String nif);

    List<Pasajero> findPasajeroByVuelo (int numeroVuelo);
}