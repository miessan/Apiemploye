package com.apiemploye.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.apiemploye.Repository.Repository;
import com.apiemploye.exeption.Loadexption;
import com.apiemploye.model.Employe;
import com.apiemploye.service.Employeservice;
@Service
public  class Serviceimpl implements Employeservice {
@Autowired
Repository repository;
	@Override
	public Employe ajouter(Employe employe) {
		// TODO Auto-generated method stub
		return repository.save(employe);
	}
	@Override
	public List<Employe> Listedesemploye() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	@Override
	public Employe rechercher(Long id) {
		
	Optional<Employe> employe= repository.findById(id);
	
	return employe.orElseThrow(()->new Loadexption("desole l'identifiant "+id+"n'a pas ete trouve"));
	

	}
	@Override
	
	public Employe modifieremployer(Employe employe, Long id) {
		// TODO Auto-generated method stub
		Employe employeexiste= repository.findById(id).orElseThrow(()->new Loadexption("desole l'identifiant "+id+"n'a pas ete trouve"));
employeexiste.setNom(employe.getNom());
employeexiste.setPrenom(employe.getPrenom());
repository.save(employeexiste);
return employeexiste;

		
		
	}
	@Override
	public void supprimer(Long id) {
		// TODO Auto-generated method stub
		Employe employeexiste= repository.findById(id).orElseThrow(()->new Loadexption("desole l'identifiant "+id+"n'a pas ete trouve"));
repository.delete(employeexiste);
		
		
	}
	

	
}
