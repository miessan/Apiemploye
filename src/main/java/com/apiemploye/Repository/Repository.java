package com.apiemploye.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiemploye.model.Employe;

public interface Repository extends JpaRepository<Employe, Long>{

}
