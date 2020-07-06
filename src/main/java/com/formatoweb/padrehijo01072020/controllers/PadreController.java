package com.formatoweb.padrehijo01072020.controllers;

import com.formatoweb.padrehijo01072020.entity.Padres;
import com.formatoweb.padrehijo01072020.services.PadreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class PadreController {
    @Autowired
    private PadreService padreService;
    @GetMapping("/padre")
    public List<Padres> getPadre(){
        return padreService.getPadres();
    }

    @PostMapping("/padre")
    public Padres guardarPadre(@RequestBody Padres padres){
        return padreService.savePadres(padres);
    }

    @GetMapping("/padre/{id}")
    public Padres padreById(@PathVariable Long id){
        return padreService.getPadreById(id);
    }

    @PutMapping("/padre/{id}")
    public Padres padreUpdate(@RequestBody Padres padresNuevo, @PathVariable Long id){
        Padres padresViejo = padreService.getPadreById(id);
        padresViejo.setNombrePadre(padresNuevo.getNombrePadre());
        padresViejo.setApellidoPadre(padresNuevo.getApellidoPadre());
        padresViejo.setEdadPadre(padresNuevo.getEdadPadre());
        return padreService.savePadres(padresViejo);
    }

    @DeleteMapping("/padre/{id}")
    public void deletePadres(@PathVariable Long id){
        padreService.deletePadre(id);
    }
}
