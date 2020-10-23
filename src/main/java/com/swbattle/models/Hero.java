package com.swbattle.models;

public class Hero {
	
	String classe;
	String nom;
	int def;
	int hp;
	int hpMax;
	int atk;
	int txCrit;
	double degatCrit;
	String arme;
	String urlIcone; 
	 

	public Hero() {
		super();
	}

	
	public int getTxCrit() {
		return txCrit;
	}


	public void setTxCrit(int txCrit) {
		this.txCrit = txCrit;
	}


	public double getDegatCrit() {
		return degatCrit;
	}


	public void setDegatCrit(double degatCrit) {
		this.degatCrit = degatCrit;
	}


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
