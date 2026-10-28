import ru.ifmo.se.pokemon.*;

final class Wormadam extends Pokemon{
	public Wormadam(String var1, int var2){
		super(var1, var2);
		Type[] t = {Type.BUG, Type.GRASS};
		this.setType(t);
		this.setStats(60, 59, 85, 79, 105, 36);
		this.addMove(new Double_Team());
		this.addMove(new Thunder());
		this.addMove(new Swagger());
		this.addMove(new Razor_Leaf());
	}
}