import ru.ifmo.se.pokemon.*;

final class Overheat extends PhysicalMove{
	public Overheat(){
		super(Type.FIRE, 130, 90);
	}
	public String describe() {
        return "Overheat";
	}
}