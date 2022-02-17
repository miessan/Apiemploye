package com.apiemploye.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.apiemploye.model.Employe;

public interface Employeservice {
Employe ajouter(Employe employe);
List<Employe>Listedesemploye();
 Employe rechercher(Long id);

 Employe modifieremployer(Employe employe,Long id);
 void supprimer(Long id);
 


}
