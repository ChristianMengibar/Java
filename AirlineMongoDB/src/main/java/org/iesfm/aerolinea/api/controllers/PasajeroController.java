package org.iesfm.aerolinea.api.controllers;

import org.iesfm.aerolinea.pojos.Maleta;
import org.iesfm.aerolinea.pojos.Pasajero;
import org.iesfm.aerolinea.services.PasajeroService;
import org.iesfm.aerolinea.services.VueloService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PasajeroController {

    private PasajeroService pasajeroService;
    private VueloService vueloService;

    public PasajeroController(PasajeroService pasajeroService, VueloService vueloService) {
        this.pasajeroService = pasajeroService;
        this.vueloService = vueloService;
    }

    //Listar maletas de un pasajero en un vuelo.
    @RequestMapping(method = RequestMethod.GET, path = "/vuelos/{numeroVuelo}/pasajeros/{nif}/maletas")
    public List<Maleta> maletasList(@PathVariable("nif") String nif,
                                    @PathVariable("numeroVuelo") int numeroVuelo) {

        Pasajero pasajero = pasajeroService.getPasajero(numeroVuelo, nif);

        return pasajero.getMaletas();
    }

    //Añadir maleta.
    @RequestMapping(method = RequestMethod.PUT, path = "/vuelos/{numeroVuelo}/pasajeros/{nif}/maletas")
    public void maletas(@PathVariable("nif") String nif,
                        @RequestBody Maleta maleta,
                        @PathVariable("numeroVuelo") int numeroVuelo) {

        pasajeroService.addMaleta(nif, numeroVuelo, maleta);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/vuelo/{numeroVuelo}/pasajeros/{nif}")
    public void pasajeros(@PathVariable("nif") String nif,
                          @RequestBody Pasajero pasajero,
                          @PathVariable("numeroVuelo") int numeroVuelo) {

        vueloService.addPasajero(pasajero);

    }
}