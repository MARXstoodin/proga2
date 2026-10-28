import ru.ifmo.se.pokemon.*;

final class Rest extends StatusMove{
	public Rest(){
		super(Type.PSYCHIC, 0, 0);
	}
	public String describe() {
        return "Rest";
	}
	protected void sapplySelfEffects(Pokemon p){
		Effect.sleep(p);
		p.restore();
	}
}