package org.iesfm.aerolinea.services;

import org.iesfm.aerolinea.pojos.Pasajero;
import org.iesfm.aerolinea.pojos.Vuelo;
import org.iesfm.aerolinea.repository.PasajeroRepository;
import org.iesfm.aerolinea.repository.VueloRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VueloService {

    private VueloRepository vueloRepository;
    private PasajeroRepository pasajeroRepository;

    public VueloService(VueloRepository vueloRepository, PasajeroRepository pasajeroRepository) {
        this.vueloRepository = vueloRepository;
        this.pasajeroRepository = pasajeroRepository;
    }

    //Crear un vuelo.
    public void addVuelo (Vuelo vuelo) {
        vueloRepository.insert(vuelo);
    }

    //Listar los vuelos.
    public List<Vuelo> vuelos () {
        return vueloRepository.findAll();
    }

    //Añadir pasajero a un vuelo. Cuando se añade un pasajero a un vuelo se le envía un email con los datos del vuelo:
    public boolean addPasajero (Pasajero pasajero) {
        if (pasajeroRepository.existsById(pasajero.getPasajeroId())) {
            return false;
        } else {
            return true;
        }
    }
}