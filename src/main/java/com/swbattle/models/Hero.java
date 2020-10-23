package com.swbattle.models;

public class Hero {
	
	String classe;
	String nom;
	int def;
	int hp;
	int hpMax;
	int atk;
	String arme;
	String urlIcone; 
	 

	public String getUrlIcone() {
		return urlIcone;
	}


	public void setUrlIcone(String urlIcone) {
		this.urlIcone = urlIcone;
	}


	public int getAtk() {
		return atk;
	}


	public void setAtk(int atk) {
		this.atk = atk;
	}


	public int getHpMax() {
		return hpMax;
	}


	public void setHpMax(int hpMax) {
		this.hpMax = hpMax;
	}

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Hero() {
		super();
	}


	public String getClasse() {
		return classe;
	}


	public void setClasse(String classe) {
		this.classe = classe;
	}


	public int getDef() {
		return def;
	}


	public void setDef(int def) {
		this.def = def;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public String getArme() {
		return arme;
	}


	public void setArme(String arme) {
		this.arme = arme;
	}
	
	
}
