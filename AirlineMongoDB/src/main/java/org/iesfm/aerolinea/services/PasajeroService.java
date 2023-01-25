package org.iesfm.aerolinea.services;

import org.iesfm.aerolinea.pojos.Maleta;
import org.iesfm.aerolinea.pojos.Pasajero;
import org.iesfm.aerolinea.pojos.Vuelo;
import org.iesfm.aerolinea.repository.PasajeroRepository;
import org.iesfm.aerolinea.repository.VueloRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasajeroService {

    private PasajeroRepository pasajeroRepository;

    public PasajeroService(PasajeroRepository pasajeroRepository) {
        this.pasajeroRepository = pasajeroRepository;
    }

    //Listar los pasajeros.
    public List<Pasajero> list() {
        return pasajeroRepository.findAll();
    }

    //Listar pasajeros de un vuelo.
    public List<Pasajero> pasajeros (int numeroVuelo) {
        return pasajeroRepository.findPasajeroByVuelo(numeroVuelo);
    }

    //Añadir maleta a un pasajero de un vuelo
    public Pasajero getPasajero(int numeroVuelo, String nif) {
        return pasajeroRepository.findByNumeroVueloAndNif(numeroVuelo, nif);
    }

    public void addMaleta(String nif, int numeroVuelo, Maleta maleta) {
        Pasajero pasajero = getPasajero(numeroVuelo, nif);
        pasajero.getMaletas().add(maleta);
        pasajeroRepository.save(pasajero);
    }
}