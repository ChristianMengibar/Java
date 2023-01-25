package org.iesfm.aerolinea.api.controllers;

import org.iesfm.aerolinea.pojos.Vuelo;
import org.iesfm.aerolinea.services.VueloService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VueloController {

    private VueloService vueloService;

    @RequestMapping(method = RequestMethod.POST, path = "/vuelos")
    public void addVuelo(@RequestBody Vuelo vuelo) {
        vueloService.addVuelo(vuelo);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/vuelos")
    public List<Vuelo> vuelos() {
        return vueloService.vuelos();
    }
}