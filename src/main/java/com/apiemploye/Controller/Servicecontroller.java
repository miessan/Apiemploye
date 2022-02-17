package com.apiemploye.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apiemploye.model.Employe;
import com.apiemploye.service.Employeservice;

@RestController
public class Servicecontroller {
	@Autowired
	Employeservice employeservice;
	@PostMapping("/ajouter")
	ResponseEntity<Employe>ajouteremployer(@RequestBody Employe employe){
		return new ResponseEntity<Employe>(employeservice.ajouter(employe), HttpStatus.CREATED);
		
	}
	@GetMapping("/listedesemploye")
	List<Employe>listedesemploye(){
		return employeservice.Listedesemploye();
		
	}
	
	@GetMapping("recherche/{id}")
	ResponseEntity<Employe>rechercheremploye(@PathVariable ("id") Long id){
		
		return new ResponseEntity<Employe>(employeservice.rechercher(id), HttpStatus.OK);
	}
	@PostMapping("Modifier/{id}")
	ResponseEntity<Employe>modifieremploye(@RequestBody Employe employe,@PathVariable("id") Long id){
		return new ResponseEntity<Employe>(employeservice.modifieremployer(employe, id), HttpStatus.OK);	
	}
	
	@DeleteMapping("/suprimer/{id}")
	ResponseEntity<String> Suprimer(@PathVariable ("id") Long id){
		employeservice.supprimer(id);
		return new ResponseEntity<String>("bravo vous avez suprimer l'employer numero "+id, HttpStatus.OK);

		
	}
	

	
}
