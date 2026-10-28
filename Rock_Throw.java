import ru.ifmo.se.pokemon.*;

final class Rock_Throw extends PhysicalMove{
	public Rock_Throw(){
		super(Type.ROCK, 50, 90);
	}
	public String describe() {
        return "Rock Throw";
	}
}