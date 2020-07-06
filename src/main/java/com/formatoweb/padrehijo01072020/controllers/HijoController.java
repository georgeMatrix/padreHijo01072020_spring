package com.formatoweb.padrehijo01072020.controllers;

import com.formatoweb.padrehijo01072020.converters.HijoConverter;
import com.formatoweb.padrehijo01072020.entity.Hijos;
import com.formatoweb.padrehijo01072020.entity.Padres;
import com.formatoweb.padrehijo01072020.models.HijoModel;
import com.formatoweb.padrehijo01072020.services.HijoService;
import com.formatoweb.padrehijo01072020.services.PadreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class HijoController {
    @Autowired
    private HijoService hijoService;

    @Autowired
    private HijoConverter hijoConverter;

    @Autowired
    private PadreService padreService;

    @GetMapping("/hijo")
    public List<HijoModel> getHijos(){
        return hijoConverter.EntityToModel(hijoService.getHijos());
    }

    @PostMapping("/hijo")
    public Hijos guardarHijo(@RequestBody HijoModel hijoModel){
        return hijoService.saveHijos(hijoConverter.ModelToEntity(hijoModel));
    }

    @GetMapping("/hijo/{id}")
    public HijoModel getHijoById(@PathVariable Long id){
        return hijoConverter.EntityToModel(hijoService.getHijosById(id));
    }

    @PutMapping("hijo/{id}")
    public Hijos actualizarHijos(@RequestBody HijoModel hijoModel, @PathVariable Long id){
        HijoModel hijosViejosModel = hijoConverter.EntityToModel(hijoService.getHijosById(id));
        hijosViejosModel.setNombreHijo(hijoModel.getNombreHijo());
        hijosViejosModel.setApellidoHijo(hijoModel.getApellidoHijo());
        hijosViejosModel.setEdadHijo(hijoModel.getEdadHijo());
        Padres padres = padreService.getPadreById(hijoModel.getIdPadre());
        hijosViejosModel.setPadres(padres);
        hijosViejosModel.setIdPadre(padres.getId());
        return hijoService.saveHijos(hijoConverter.ModelToEntity(hijosViejosModel));
    }

    @DeleteMapping("hijo/{id}")
    public void EliminarHijo(@PathVariable Long id){
        hijoService.deleteHijos(id);
    }
}
