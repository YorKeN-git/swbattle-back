package com.swbattle.services;

import java.util.Random;

import org.springframework.stereotype.Service;
import com.swbattle.models.Hero;
import com.swbattle.models.Monstre;
import com.swbattle.models.Partie;

@Service
public class PartieService {
	
	public Hero[] creerHero(Hero[] tabHero){
		//Bonus statistique Arme 
		double bonusMasse = 0.15; //15% de dégat crit en plus 
		int bonusEpee = 200; //200 d'atk en plus 
		int bonusDague = 30; //30% de TxCrit en plus 
		int bonusArc = 300; //300 d'atk en plus 
		int bonusBaton = 300; //300 point de vie en plus => soin du prêtre = 10% de ses HpMax
		
		for (int i = 0; i < tabHero.length; i++) {
			String arme = tabHero[i].getArme(); 
			System.out.println(arme);
			switch (tabHero[i].getClasse()) {
			case "guerrier":
				tabHero[i].setHpMax(800);
				tabHero[i].setHp(800);
				tabHero[i].setDef(200);
				if( arme.equals("Epee")) {
					//Arme = Epee 
					System.out.println("J'ai créer une epee");
					tabHero[i].setAtk(1600 + bonusEpee);
					tabHero[i].setTxCrit(45);
					tabHero[i].setDegatCrit(1.2);
					tabHero[i].setUrlIcone("./assets/images/icon_classe/guerrier.jpg");
				}else {
					//Arme = masse 
					System.out.println("J'ai créer une masse");
					tabHero[i].setAtk(1600);
					tabHero[i].setTxCrit(45);
					tabHero[i].setDegatCrit(1.2 + bonusMasse);
					tabHero[i].setUrlIcone("./assets/images/icon_classe/guerrier.jpg");
				}
				break;
			
			case "soigneur":
				if(arme.equals("Baton")) {
					tabHero[i].setHpMax(600 + bonusBaton);
					tabHero[i].setHp(600 + bonusBaton);
					tabHero[i].setDef(50);
					tabHero[i].setAtk(1000);
					tabHero[i].setTxCrit(40);
					tabHero[i].setDegatCrit(1.1);
					tabHero[i].setUrlIcone("./assets/images/icon_classe/priest.jpg");
				}else if(arme.equals("Epee")) {
					tabHero[i].setHpMax(600);
					tabHero[i].setHp(600);
					tabHero[i].setDef(50);
					tabHero[i].setAtk(1000 + bonusEpee);
					tabHero[i].setTxCrit(40);
					tabHero[i].setDegatCrit(1.1);
					tabHero[i].setUrlIcone("./assets/images/icon_classe/priest.jpg");
				}else {
					//masse 
					tabHero[i].setHpMax(600);
					tabHero[i].setHp(600);
					tabHero[i].setDef(50);
					tabHero[i].setAtk(1000);
					tabHero[i].setTxCrit(40);
					tabHero[i].setDegatCrit(1.1 + bonusMasse);
					tabHero[i].setUrlIcone("./assets/images/icon_classe/priest.jpg");
				}
				
				break;
			
			case "assassin":
				if(arme.equals("Epee")) {
					tabHero[i].setHpMax(600);
					tabHero[i].setHp(600);
					tabHero[i].setDef(50);
					tabHero[i].setAtk(2000 + bonusEpee);
					tabHero[i].setTxCrit(45);
					tabHero[i].setDegatCrit(1.4);
					tabHero[i].setUrlIcone("./assets/images/icon_classe/assassin.jpg");
				}else {
					//Dague 
					tabHero[i].setHpMax(600);
					tabHero[i].setHp(600);
					tabHero[i].setDef(50);
					tabHero[i].setAtk(2000);
					tabHero[i].setTxCrit(45 + bonusDague);
					tabHero[i].setDegatCrit(1.4);
					tabHero[i].setUrlIcone("./assets/images/icon_classe/assassin.jpg");
				}
				break;
			
			case "archer":
				tabHero[i].setHpMax(700);
				tabHero[i].setHp(700);
				tabHero[i].setDef(50);
				tabHero[i].setAtk(1900 + bonusArc);
				tabHero[i].setTxCrit(45);
				tabHero[i].setDegatCrit(1.3);
				tabHero[i].setUrlIcone("./assets/images/icon_classe/archer.jpg");
				break;
				
			default:
				break;
			}
		}
		return tabHero; 
	}
	
	
	public Monstre[] creerMonstre(Monstre[] tabMonstre) {
		//Bonus statistique Arme 
		double bonusMasse = 0.15; //15% de dégat crit en plus 
		int bonusEpee = 200; //200 d'atk en plus 
		int bonusDague = 30; //30% de TxCrit en plus 
		
		for (int i = 0; i < tabMonstre.length; i++) {
			Random objGenerator = new Random();
			int randMonstre = objGenerator.nextInt(100);
			if(randMonstre < 23) {
				//J'invoque le monstre 1
				tabMonstre[i] = new Monstre(); 
				tabMonstre[i].setNom(genererNomMonstreM());
				tabMonstre[i].setArme("Masse"); //Add 15% de DegCrit 
				tabMonstre[i].setHpMax(700);
				tabMonstre[i].setHp(700);
				tabMonstre[i].setDef(80);
				tabMonstre[i].setAtk(2000);
				tabMonstre[i].setTxCrit(45);
				tabMonstre[i].setDegatCrit(1.2 + bonusMasse);
				tabMonstre[i].setUrlIcone("./assets/images/icon_monstre/monstre1.jpg");
			}else if ((randMonstre >= 23) && (randMonstre < 46)) {
				//J'invoque le monstre 2
				tabMonstre[i] = new Monstre(); 
				tabMonstre[i].setNom(genererNomMonstreM());
				tabMonstre[i].setArme("Masse");
				tabMonstre[i].setHpMax(800);
				tabMonstre[i].setHp(800);
				tabMonstre[i].setDef(100);
				tabMonstre[i].setAtk(2000);
				tabMonstre[i].setTxCrit(45);
				tabMonstre[i].setDegatCrit(1.2 + bonusMasse);
				tabMonstre[i].setUrlIcone("./assets/images/icon_monstre/monstre2.jpg");
			}else if ((randMonstre >= 46) && (randMonstre < 69)) {
				//J'invoque le monstre 3
				tabMonstre[i] = new Monstre(); 
				tabMonstre[i].setNom(genererNomMonstreM());
				tabMonstre[i].setArme("Epee"); //Add 200 d'atk
				tabMonstre[i].setHpMax(800);
				tabMonstre[i].setHp(800);
				tabMonstre[i].setDef(70);
				tabMonstre[i].setAtk(2000 + bonusEpee);
				tabMonstre[i].setTxCrit(45);
				tabMonstre[i].setDegatCrit(1.2);
				tabMonstre[i].setUrlIcone("./assets/images/icon_monstre/monstre3.jpg");
			}else if ((randMonstre >= 69) && (randMonstre < 93)) {
				//J'invoque le monstre 4
				tabMonstre[i] = new Monstre(); 
				tabMonstre[i].setNom(genererNomMonstreF());
				tabMonstre[i].setArme("Dague");
				tabMonstre[i].setHpMax(500);
				tabMonstre[i].setHp(500);
				tabMonstre[i].setDef(50);
				tabMonstre[i].setAtk(2000);
				tabMonstre[i].setTxCrit(45 + bonusDague);
				tabMonstre[i].setDegatCrit(1.2);
				tabMonstre[i].setUrlIcone("./assets/images/icon_monstre/monstre4.jpg");
			}else {
				//J'invoque un Boss
				tabMonstre[i] = new Monstre(); 
				tabMonstre[i].setNom(genererNomMonstreM());
				tabMonstre[i].setArme("Masse");
				tabMonstre[i].setHpMax(1000);
				tabMonstre[i].setHp(1000);
				tabMonstre[i].setDef(200);
				tabMonstre[i].setAtk(3000);
				tabMonstre[i].setTxCrit(45);
				tabMonstre[i].setDegatCrit(1.5 + bonusMasse);
				tabMonstre[i].setUrlIcone("./assets/images/icon_boss/boss.jpg");
			}
		}
		
		return tabMonstre;
	}
	
	public String genererNomMonstreM() {
		String[] listNomM= {"Glusor Atumag", "Urbua Aguim", "Lugdog Badbamph", "Shuzothmuk Ugdgan", "Dumagdush Ugdubag" //5
		                        ,"Umuo Khasrump", "Grogonak Buzgrat", "Uruzgob Rugod", "Yargol Moghgan", "Magumok Marakul"  //10
		                        ,"Khashnag Ugrugash", "Bumur Grambuk", "Urbbagorn Uftug", "Dumok Brokham", "Gadburz Gambag", //15
		                       "Garo Buzgorn", "Bagron Durgg", "Olfgnak Ruspok", "Mukr Gorzdu", "Umuh Agamrag", //20
		                       "Othmagdush Loghrba", "Malknarz Snagh", "Duraamul Gharhakh", "Magugakh Lagda", "Urbamph Mogarkub", //25
		                       "Yasolg Durggdub", "Shelamul Muzgorn", "Balgrol Agubul", "Ogolob Mularbag", "Oluagorn Ulfirag", //30
		                       "Olpao Bhagamph", "Nasrol Shatamph", "Brubagorn Mogdrg", "Dumish Borblam", "Ghorrkul Magrkul", //35
		                       "Bogrog Snazuf", "Mahon Nolosh", "Durul Orkgak", "Olumrbash Shaknikh", "Kofmorz Gulfuk", //40
		                       "Maknbumol Murulfim", "Garzrzob Lurkbog", "Shurman Dulhnar", "Shoo Urgbuk", "Maknzol Ogdmba", //45
		                       "Ugduothmuk Azobek", "Dumug Marabak", "Urzorn Borgakh", "Lugfutto Bugarzuf", "Groonk Glorrish"}; //50
		Random objGenerator = new Random();
		int randNomM = objGenerator.nextInt(listNomM.length);
		return listNomM[randNomM];
	}
	
	public String genererNomMonstreF() {
		//Listes des nom Féminin
		String[] listNomF = {"Mogoga Ghothel","Ghobr Mashish","Bumphnakh Baroat","Volrzug Marabak","Graomalah Lumbrz",  //5
		                        "Atudurz Borbrbush","Gaszob Gatuz","Batugar Ghart","Durzh Gholzag","Narur Maldush",  //10
		                        "Uloakh Bonga","Umofim Snakh","Umoggash Coblbog","Shelr Bogaham","Ugakmpha Buronikh",  //15
		                        "Gulfat Dugrg","Ushgak Atulug","Borfish Glukimph","Morba Agarzog","Borim Bagoshnar",  //20
		                        "Basha Ulfak","Gulfurash Ghohug","Grazgash Skanhol","Sherz Bagotur","Lambha Rimprol",  //25
		                        "Voltbug Gramag","Ghobn Brokdum","Lambamph Bumgham","Ulothnakh Orkuarn","Baghnakh Nolbek",  //30
		                        "Urzotharz Mulaul","Shusha Aglgamph","Narrza Bagurak","Baturak Glukrak","Mora Usharku",  //35
		                        "Mogalur Burou","Bashm Masoth","Gratdurash Loghgakh","Uglarz Durhug","Khaftharz Galump"};  //40
		
		Random objGenerator = new Random();
		int randNomF = objGenerator.nextInt(listNomF.length);
		return listNomF[randNomF]; 
	}
	
	public Partie attaquerMonstres(Partie partie) {
		//Recuperd tabMonstre et TabHero 
		Hero[] tabHero = new Hero[partie.getTabHero().length];
		Monstre[] tabMonstre = new Monstre[partie.getTabMonstre().length];
		tabHero = partie.getTabHero();
		tabMonstre = partie.getTabMonstre();
		boolean isCoupCritique; 
		boolean isChanceSoigner;
		//les héros attaque aléatoirement les monstres
		for (int i = 0; i < partie.getTabHero().length; i++) {
			//choisit au hasard un monstre de la liste 
			Random objGenerateur = new Random();
			int randIndexMonstre = objGenerateur.nextInt(partie.getTabMonstre().length); 
			//Si c'est au tour du soigneur de joué 
			if(tabHero[i].getClasse().equals("soigneur")) {
				isChanceSoigner = chanceSoigner();
			}else {
				isCoupCritique = coupCritique(tabHero[i]);
				if(isCoupCritique) {
					//Coup critique formule : dégat = (ATK / DEF) * DegatCrit 
					int hpMonstre = tabMonstre[randIndexMonstre].getHp();
					int atkHero = tabHero[i].getAtk(); 
					int defMonstre = tabMonstre[randIndexMonstre].getDef();
					double degatCrit = tabMonstre[randIndexMonstre].getDegatCrit();
					int degat = (int)(atkHero / defMonstre);
					degat = (int)(degat * degatCrit);
					tabMonstre[randIndexMonstre].setHp(hpMonstre - degat); 
				}else {
					//Pas de coup critique : formule dégat = ATK / DEF 
					int hpMonstre = tabMonstre[randIndexMonstre].getHp();
					int atkHero = tabHero[i].getAtk(); 
					int defMonstre = tabMonstre[randIndexMonstre].getDef();
					double degatFait = atkHero / defMonstre ; 
					int degatConvert = (int)degatFait;
					tabMonstre[randIndexMonstre].setHp(hpMonstre - degatConvert); 
				}
			}
			
		}
		partie.setTabHero(tabHero);
		partie.setTabMonstre(tabMonstre);
		return partie;
	}
	
	public Boolean coupCritique(Hero hero) {
		System.out.println("J'ai reçu ce héro :" + hero);
		//Cette méthode va permettre de savoir si le hero va taper avec un coup critique 
		boolean isCoupCritique; 
		Random objGenerateur = new Random();
		int chanceCoupCritique = objGenerateur.nextInt(100);
		int txCritHero = hero.getTxCrit();
		if( chanceCoupCritique <= txCritHero ) {
			//Le hero va faire un coup critique 
			isCoupCritique = true;
		}else {
			// tape normalement 
			isCoupCritique = false;
		}
		return isCoupCritique;
	}
	
	public Boolean chanceSoigner() {
		boolean isChanceSoigner;
		Random objGenerateur = new Random();
		int chanceSoigner = objGenerateur.nextInt(100);
		if(chanceSoigner < 25) {
			isChanceSoigner = true;
		}else {
			isChanceSoigner = false;
		}
		return isChanceSoigner;
	}

}
