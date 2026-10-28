import ru.ifmo.se.pokemon.*;

final class Double_Team extends StatusMove{
	public Double_Team(){
		super(Type.NORMAL, 0, 0);
	}
	public String describe() {
        return "Double Team";
	}
	protected void sapplySelfEffects(Pokemon p){
		p.setMod(Stat.EVASION, 1);
	}
}