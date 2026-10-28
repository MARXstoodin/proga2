import ru.ifmo.se.pokemon.*;

final class Tropius extends Pokemon{
	public Tropius(String var1, int var2){
		super(var1, var2);
		Type[] t = {Type.GRASS, Type.FLYING};
		this.setType(t);
		this.setStats(99, 68, 83, 72, 87, 51);
		this.addMove(new Rest());
		this.addMove(new Overheat());
		this.addMove(new Rock_Throw());
	}
}