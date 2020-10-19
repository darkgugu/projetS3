package jeu;

import capacites.BouleDeFeu;
import capacites.Soin;
import personnages.IAControlled.Gobelin;
import personnages.playerControlled.Healer;
import personnages.playerControlled.Magician;

public class Jeu {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Healer healer = new Healer();
		Magician magician = new Magician();
		Gobelin gobelin = new Gobelin();
		
		BouleDeFeu bdf = new BouleDeFeu();
		Soin soin = new Soin();
		
		//healer.setSkills(bdf, soin);
		
		System.out.println("Gobelin HP : " + gobelin.getPv() + "/" + gobelin.getPvMax());
		
		new BouleDeFeu().cast(magician, gobelin);
		new BouleDeFeu().cast(magician, gobelin);

		//soin.cast(healer, magician);

		System.out.println("Gobelin HP : " + gobelin.getPv() + "/" + gobelin.getPvMax());
		
		//System.out.println(healer);
		
	}

}
