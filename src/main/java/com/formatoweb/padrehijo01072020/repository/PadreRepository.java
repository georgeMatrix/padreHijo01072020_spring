package com.formatoweb.padrehijo01072020.repository;

import com.formatoweb.padrehijo01072020.entity.Padres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface PadreRepository extends JpaRepository<Padres, Serializable> {
}
