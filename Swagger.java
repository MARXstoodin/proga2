import ru.ifmo.se.pokemon.*;

final class Swagger extends StatusMove{
	public Swagger(){
		super(Type.NORMAL, 0, 85);
	}
	public String describe() {
        return "Swagger";
	}
	protected void applyOppEffects(Pokemon p){
		Effect.confuse(p);
		p.setMod(Stat.ATTACK, 2);
	}
}