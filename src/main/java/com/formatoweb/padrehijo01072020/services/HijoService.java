package com.formatoweb.padrehijo01072020.services;

import com.formatoweb.padrehijo01072020.entity.Hijos;

import java.util.List;

public interface HijoService {
    List<Hijos> getHijos();
    Hijos saveHijos(Hijos hijos);
    Hijos getHijosById(Long id);
    void deleteHijos(Long id);
}
