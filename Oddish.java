import ru.ifmo.se.pokemon.*;

final class Oddish extends Pokemon{
	public Oddish(String var1, int var2){
		super(var1, var2);
		Type[] t = {Type.GRASS, Type.POISON};
		this.setType(t);
		this.setStats(45, 50, 55, 75, 65, 30);
		this.addMove(new Overheat());
		this.addMove(new Fake_Out());
		this.addMove(new Screech());
		this.addMove(new Ominous_Wind());
	}
}