import ru.ifmo.se.pokemon.*;

final class Screech extends PhysicalMove{
	public Screech(){
		super(Type.NORMAL, 0, 85);
	}
	public String describe() {
        return "Screech";
	}
}