package com.swbattle.services;

import java.util.Random;

import org.springframework.stereotype.Service;
import com.swbattle.models.Hero;
import com.swbattle.models.Monstre;

@Service
public class PartieService {
	
	public Hero[] creerHero(Hero[] tabHero){
		System.out.println("Je suis bien dans mon service ! ");
		for (int i = 0; i < tabHero.length; i++) {
			switch (tabHero[i].getClasse()) {
			case "guerrier":
				tabHero[i].setHpMax(800);
				tabHero[i].setHp(800);
				tabHero[i].setDef(200);
				tabHero[i].setAtk(100);
				tabHero[i].setUrlIcone("./assets/images/icon_classe/guerrier.jpg");
				System.out.println("J'ai créer un guerrer !");
				break;
			
			case "soigneur":
				tabHero[i].setHpMax(600);
				tabHero[i].setHp(600);
				tabHero[i].setDef(50);
				tabHero[i].setAtk(50);
				tabHero[i].setUrlIcone("./assets/images/icon_classe/priest.jpg");
				System.out.println("J'ai créer un soigneur !");
				break;
			
			case "assassin":
				tabHero[i].setHpMax(600);
				tabHero[i].setHp(600);
				tabHero[i].setDef(50);
				tabHero[i].setAtk(300);
				tabHero[i].setUrlIcone("./assets/images/icon_classe/assassin.jpg");
				System.out.println("J'ai créer un assassin !");
				break;
			
			case "archer":
				tabHero[i].setHpMax(700);
				tabHero[i].setHp(700);
				tabHero[i].setDef(50);
				tabHero[i].setAtk(200);
				tabHero[i].setUrlIcone("./assets/images/icon_classe/archer.jpg");
				break;
				
			default:
				break;
			}
		}
		return tabHero; 
	}
	
	
	public Monstre[] creerMonstre(Monstre[] tabMonstre) {
		
		for (int i = 0; i < tabMonstre.length; i++) {
			Random objGenerator = new Random();
			int randMonstre = objGenerator.nextInt(100);
			if(randMonstre < 23) {
				//J'invoque le monstre 1
				tabMonstre[i] = new Monstre(); 
				tabMonstre[i].setNom(genererNomMonstreM());
				tabMonstre[i].setArme("Masse");
				tabMonstre[i].setHpMax(700);
				tabMonstre[i].setHp(700);
				tabMonstre[i].setDef(80);
				tabMonstre[i].setAtk(100);
				tabMonstre[i].setUrlIcone("./assets/images/icon_monstre/monstre1.jpg");
			}else if ((randMonstre >= 23) && (randMonstre < 46)) {
				//J'invoque le monstre 2
				tabMonstre[i] = new Monstre(); 
				tabMonstre[i].setNom(genererNomMonstreM());
				tabMonstre[i].setArme("Masse");
				tabMonstre[i].setHpMax(800);
				tabMonstre[i].setHp(800);
				tabMonstre[i].setDef(100);
				tabMonstre[i].setAtk(150);
				tabMonstre[i].setUrlIcone("./assets/images/icon_monstre/monstre2.jpg");
			}else if ((randMonstre >= 46) && (randMonstre < 69)) {
				//J'invoque le monstre 3
				tabMonstre[i] = new Monstre(); 
				tabMonstre[i].setNom(genererNomMonstreM());
				tabMonstre[i].setArme("Epee");
				tabMonstre[i].setHpMax(800);
				tabMonstre[i].setHp(800);
				tabMonstre[i].setDef(70);
				tabMonstre[i].setAtk(150);
				tabMonstre[i].setUrlIcone("./assets/images/icon_monstre/monstre3.jpg");
			}else if ((randMonstre >= 69) && (randMonstre < 93)) {
				//J'invoque le monstre 4
				tabMonstre[i] = new Monstre(); 
				tabMonstre[i].setNom(genererNomMonstreF());
				tabMonstre[i].setArme("Dague");
				tabMonstre[i].setHpMax(500);
				tabMonstre[i].setHp(500);
				tabMonstre[i].setDef(50);
				tabMonstre[i].setAtk(200);
				tabMonstre[i].setUrlIcone("./assets/images/icon_monstre/monstre4.jpg");
			}else {
				//J'invoque un Boss
				tabMonstre[i] = new Monstre(); 
				tabMonstre[i].setNom(genererNomMonstreM());
				tabMonstre[i].setArme("Masse");
				tabMonstre[i].setHpMax(1000);
				tabMonstre[i].setHp(1000);
				tabMonstre[i].setDef(200);
				tabMonstre[i].setAtk(300);
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

}
