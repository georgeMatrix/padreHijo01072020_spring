package com.formatoweb.padrehijo01072020.services.impl;

import com.formatoweb.padrehijo01072020.entity.Hijos;
import com.formatoweb.padrehijo01072020.repository.HijoRepository;
import com.formatoweb.padrehijo01072020.services.HijoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HijoServiceImpl implements HijoService {
    @Autowired
    private HijoRepository hijoRepository;
    @Override
    public List<Hijos> getHijos() {
        return hijoRepository.findAll();
    }

    @Override
    public Hijos saveHijos(Hijos hijos) {
        return hijoRepository.save(hijos);
    }

    @Override
    public Hijos getHijosById(Long id) {
        return hijoRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteHijos(Long id) {
        hijoRepository.deleteById(id);
    }
}
