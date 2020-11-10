package personnages;

public class Unites {

	private int pv;
	protected String name;
	protected int physicalBaseDamage;
	private int magicalBaseDamage;
	protected int range;
	protected int actionPoint, actionPointMax;
	protected int movePoint, movePointMax;
	private int pvMax;

	
	public Unites(int pv, String name, int physicalBaseDamage, int magicalBaseDamage, int range, int actionPoint, int movePoint) {
		super();
		this.pv = pv;
		this.name = name;
		this.physicalBaseDamage = physicalBaseDamage;
		this.setMagicalBaseDamage(magicalBaseDamage);
		this.range = range;
		this.actionPoint = actionPoint;
		this.actionPointMax = actionPoint;
		this.movePoint = movePoint;
		this.movePointMax = movePoint;		
		this.setPvMax(pv);
	}

	public void setActionPointToMax() {
		this.actionPoint = actionPointMax;
	}

	public int getActionPoint() {
		return actionPoint;
	}

	public int getMovePoint() {
		return movePoint;
	}

	public void setActionPoint(int actionPoint) {
		this.actionPoint = actionPoint;
	}

	public void setMovePoint(int movePoint) {
		this.movePoint = movePoint;
	}

	public void setMovePointToMax() {
		this.movePoint = movePointMax;
	}


	public int getMagicalBaseDamage() {
		return magicalBaseDamage;
	}

	public void setMagicalBaseDamage(int magicalBaseDamage) {
		this.magicalBaseDamage = magicalBaseDamage;
	}

	public String getName() {
		return name;
	}

	public int getPv() {
		return pv;
	}

	public boolean setPv(int pv) {
		
		this.pv -= pv;
		if (this.pv > this.pvMax) {
			this.pv = this.pvMax;
		}
		if(this.pv <= 0) {
			
			return true;
		}
		else {
		
			return false;
		}
		
	}

	public int getPvMax() {
		return pvMax;
	}

	public void setPvMax(int pvMax) {
		this.pvMax = pvMax;
	}
	
	
	
}