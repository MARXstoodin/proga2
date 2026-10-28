import ru.ifmo.se.pokemon.*;

final class Cosmic_Power extends StatusMove{
	public Cosmic_Power(){
		super(Type.PSYCHIC, 0, 0);
	}
	public String describe() {
        return "Cosmic Power";
	}
	protected void sapplySelfEffects(Pokemon p){
		p.setMod(Stat.DEFENSE, 1);
		p.setMod(Stat.SPECIAL_DEFENSE, 1);
	}
}