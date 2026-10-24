import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
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

final class Thunder extends SpecialMove{
	public Thunder(){
		super(Type.ELECTRIC, 110, 70);
	}
	public String describe() {
        return "Thunder";
	}
}

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

final class Razor_Leaf extends PhysicalMove{
	public Razor_Leaf(){
		super(Type.GRASS, 55, 95);
	}
	public String describe() {
        return "Razor Leaf";
	}
}

final class Overheat extends PhysicalMove{
	public Overheat(){
		super(Type.FIRE, 130, 90);
	}
	public String describe() {
        return "Overheat";
	}
}

final class Fake_Out extends PhysicalMove{
	public Fake_Out(){
		super(Type.NORMAL, 40, 100);
	}
	public String describe() {
        return "Fake Out";
	}
}

final class Screech extends PhysicalMove{
	public Screech(){
		super(Type.NORMAL, 0, 85);
	}
	public String describe() {
        return "Screech";
	}
}

final class Ominous_Wind extends SpecialMove{
	public Ominous_Wind(){
		super(Type.GHOST, 60, 100);
	}
	public String describe() {
        return "Ominous Wind";
	}
}

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

final class Rock_Throw extends PhysicalMove{
	public Rock_Throw(){
		super(Type.ROCK, 50, 90);
	}
	public String describe() {
        return "Rock Throw";
	}
}

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

final class Tentacruel extends Pokemon{
	public Tentacruel(String var1, int var2){
		super(var1, var2);
		Type[] t = {Type.WATER, Type.POISON};
		this.setType(t);
		this.setStats(80, 70, 65, 80, 120, 100);
		this.addMove(new Overheat());
		this.addMove(new Fake_Out());
		this.addMove(new Screech());
	}
}

final class Oddish extends Pokemon{
	public Oddish(String var1, int var2){
		super(var1, var2);
		Type[] t = {Type.GRASS, Type.POISON};
		this.setType(t);
		this.setStats(45, 50, 55, 75, 65, 30);
		this.addMove(new Overheat());
		this.addMove(new Fake_Out());
		this.addMove(new Screech());
		this.addMove(new Ominous_Wind());
	}
}

final class Dusclops extends Pokemon{
	public Dusclops(String var1, int var2){
		super(var1, var2);
		this.setType(Type.GHOST);
		this.setStats(40, 70, 130, 60, 130, 25);
		this.addMove(new Rest());
		this.addMove(new Overheat());
	}
}

final class Tropius extends Pokemon{
	public Tropius(String var1, int var2){
		super(var1, var2);
		Type[] t = {Type.GRASS, Type.FLYING};
		this.setType(t);
		this.setStats(99, 68, 83, 72, 87, 51);
		this.addMove(new Rest());
		this.addMove(new Overheat());
		this.addMove(new Rock_Throw());
	}
}

final class Chimecho extends Pokemon{
	public Chimecho(String var1, int var2){
		super(var1, var2);
		Type[] t = {Type.PSYCHIC, Type.GROUND};
		this.setType(t);
		this.setStats(75, 50, 80, 95, 90, 65);
		this.addMove(new Rest());
		this.addMove(new Overheat());
		this.addMove(new Rock_Throw());
		this.addMove(new Cosmic_Power());
	}
}

public class Main_Class{
	public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p11 = new Wormadam("Vich", 1);
        Pokemon p12 = new Tentacruel("Gangrena", 1);
        Pokemon p13 = new Oddish("Rak", 1);
        Pokemon p21 = new Dusclops("Salmanelez", 1);
        Pokemon p22 = new Tropius("Gemoroy", 1);
        Pokemon p33 = new Chimecho("Gubchataya encifalopatya", 1);
        b.addAlly(p11);
        b.addFoe(p12);
		b.addAlly(p13);
        b.addFoe(p21);
		b.addAlly(p22);
        b.addFoe(p33);
        b.go(); 
    }
}