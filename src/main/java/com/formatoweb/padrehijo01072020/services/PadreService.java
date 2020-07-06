package com.formatoweb.padrehijo01072020.services;

import com.formatoweb.padrehijo01072020.entity.Padres;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PadreService {
    List<Padres> getPadres();
    Padres savePadres(Padres padres);
    Padres getPadreById(Long id);
    void deletePadre(Long id);
}
