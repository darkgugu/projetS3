package capacites;

import personnages.Unites;

public class Soin2 extends Capacites{
	
	private int finalHeal;
	
	public Soin2() {
		super(DamageElement.LIGHT, 10, "magical", 20, 0, 8, "Double Soin");
		
	}
	
	public int cast(Unites caster, Unites cible) {

		finalHeal = -1 * heal;
		cible.setPv(finalHeal);
		caster.setPv(finalHeal);
		super.cast(caster);
		return finalHeal;
	}

	public int getFinalHeal() {
		return finalHeal;
	}

}
