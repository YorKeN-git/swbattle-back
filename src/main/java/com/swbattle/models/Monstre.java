package com.swbattle.models;

public class Monstre {
	String nom;
	String arme;
	int hpMax;
	int hp;
	int def;
	int atk;
	double txCrit;
	double degatCrit;
	String urlIcone;
	
	public Monstre() {
		super();
	}

	
	public double getTxCrit() {
		return txCrit;
	}

	public void setTxCrit(double txCrit) {
		this.txCrit = txCrit;
	}

	public double getDegatCrit() {
		return degatCrit;
	}

	public void setDegatCrit(double degatCrit) {
		this.degatCrit = degatCrit;
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getArme() {
		return arme;
	}

	public void setArme(String arme) {
		this.arme = arme;
	}

	public int getHpMax() {
		return hpMax;
	}

	public void setHpMax(int hpMax) {
		this.hpMax = hpMax;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public String getUrlIcone() {
		return urlIcone;
	}

	public void setUrlIcone(String urlIcone) {
		this.urlIcone = urlIcone;
	} 
	
	

}
