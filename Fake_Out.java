import ru.ifmo.se.pokemon.*;

final class Fake_Out extends PhysicalMove{
	public Fake_Out(){
		super(Type.NORMAL, 40, 100);
	}
	public String describe() {
        return "Fake Out";
	}
}