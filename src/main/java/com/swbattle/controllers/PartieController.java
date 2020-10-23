package com.swbattle.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.swbattle.models.Hero;
import com.swbattle.models.Monstre;
import com.swbattle.models.Partie;
import com.swbattle.repositories.PartieRepository;
import com.swbattle.services.PartieService;

@CrossOrigin
@RestController
@RequestMapping("partie")
public class PartieController {

	@Autowired
	private PartieRepository repository;
	@Autowired
	private PartieService service;
	
	
	@PostMapping("/creer")
	public Partie save(@RequestBody Partie entity) {
		//Recuperd la taille du tableau hero 
		int tailleTabHero = 0;
		tailleTabHero = entity.getTabHero().length;
		//Créer notre tableau hero 
		Hero[] tabHero = new Hero[tailleTabHero];
		//Créer notre tableau monstre 
		Monstre[] tabMonstre = new Monstre[tailleTabHero];
		//Recuperd les heros dans notre request body
		tabHero = entity.getTabHero();
		//Définir les stats du héro 
		tabHero = this.service.creerHero(tabHero);
		//Ajoute les modifications à notre request body 
		entity.setTabHero(tabHero);
		//Créer les monstres
		tabMonstre = this.service.creerMonstre(tabMonstre);
		//Ajoute nos monstre à notre request Body 
		entity.setTabMonstre(tabMonstre);
		//Sauvegarde la partie dans notre BDD MongoDB
		return this.repository.save(entity);
	}
	
	@PostMapping("/attaquerMonstres")
	public Partie attaquerMonstre(@RequestBody Partie entity) {
		//Met à jour le numéro de la manche 
		entity.setNumeroManche(entity.getNumeroManche() +1);
		//les Heros attaques les montres 
		entity = this.service.attaquerMonstres(entity);
		//Sauvegarde la partie dans notre BDD MongoDB
		return this.repository.save(entity);
	}
	
}
