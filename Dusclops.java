import ru.ifmo.se.pokemon.*;

final class Dusclops extends Pokemon{
	public Dusclops(String var1, int var2){
		super(var1, var2);
		this.setType(Type.GHOST);
		this.setStats(40, 70, 130, 60, 130, 25);
		this.addMove(new Rest());
		this.addMove(new Overheat());
	}
}