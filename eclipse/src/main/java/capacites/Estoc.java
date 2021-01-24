package capacites;

import personnages.Unites;
import ui.GameLog;

public class Estoc extends Capacites{
	
	private int finalDamages;

	public Estoc() {
		super(DamageElement.EARTH, 1, "physical", 0, 10, 3, "Coup d'Estoc");
	}

	public int cast(Unites caster, Unites cible) {
		
		super.cast(caster);
		finalDamages = damage * caster.getPhysicalBaseDamage();
		GameLog.setGameLog("D�gats : " + finalDamages);
		if(cible.setPv(finalDamages)) {

			super.death(caster, cible);
		}
		return finalDamages;
	}
	
	public int getFinalDamages() {
		return finalDamages;
	}

}