import ru.ifmo.se.pokemon.*;

final class Chimecho extends Pokemon{
	public Chimecho(String var1, int var2){
		super(var1, var2);
		Type[] t = {Type.PSYCHIC, Type.GROUND};
		this.setType(t);
		this.setStats(75, 50, 80, 95, 90, 65);
		this.addMove(new Rest());
		this.addMove(new Overheat());
		this.addMove(new Rock_Throw());
		this.addMove(new Cosmic_Power());
	}
}