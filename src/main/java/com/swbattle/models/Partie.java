package com.swbattle.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document
@Data
public class Partie {

	@Id
	private String id;
	private String nomPartie;
	private Hero[] tabHero;
	private Monstre[] tabMonstre;
	private int numeroManche;
	private int rand;
	
}
