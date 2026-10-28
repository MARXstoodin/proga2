import ru.ifmo.se.pokemon.*;

final class Tentacruel extends Pokemon{
	public Tentacruel(String var1, int var2){
		super(var1, var2);
		Type[] t = {Type.WATER, Type.POISON};
		this.setType(t);
		this.setStats(80, 70, 65, 80, 120, 100);
		this.addMove(new Overheat());
		this.addMove(new Fake_Out());
		this.addMove(new Screech());
	}
}