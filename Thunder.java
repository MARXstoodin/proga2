import ru.ifmo.se.pokemon.*;

final class Thunder extends SpecialMove{
	public Thunder(){
		super(Type.ELECTRIC, 110, 70);
	}
	public String describe() {
        return "Thunder";
	}
}