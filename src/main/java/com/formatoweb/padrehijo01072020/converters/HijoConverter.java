package com.formatoweb.padrehijo01072020.converters;

import com.formatoweb.padrehijo01072020.entity.Hijos;
import com.formatoweb.padrehijo01072020.entity.Padres;
import com.formatoweb.padrehijo01072020.models.HijoModel;
import com.formatoweb.padrehijo01072020.services.HijoService;
import com.formatoweb.padrehijo01072020.services.PadreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HijoConverter {

    public Hijos ModelToEntity(HijoModel hijoModel){
        Hijos hijo = new Hijos();
        hijo.setId(hijoModel.getId());
        hijo.setNombreHijo(hijoModel.getNombreHijo());
        hijo.setApellidoHijo(hijoModel.getApellidoHijo());
        hijo.setEdadHijo(hijoModel.getEdadHijo());
        //falta el idpadre
        hijo.setPadres(hijoModel.getPadres());
        return hijo;
    }

    public HijoModel EntityToModel(Hijos hijos){
        HijoModel hijoModel = new HijoModel();
        hijoModel.setId(hijos.getId());
        hijoModel.setNombreHijo(hijos.getNombreHijo());
        hijoModel.setApellidoHijo(hijos.getApellidoHijo());
        hijoModel.setEdadHijo(hijos.getEdadHijo());
        hijoModel.setIdPadre(hijos.getPadres().getId());
        hijoModel.setPadres(hijos.getPadres());
        return hijoModel;
    }

    public List<HijoModel> EntityToModel(List<Hijos> hijosList){
        List<HijoModel> hijoModel = new ArrayList<>();
        for (Hijos h: hijosList
             ) {
            hijoModel.add(EntityToModel(h));
        }
        return hijoModel;
    }
}
