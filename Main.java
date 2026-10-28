import ru.ifmo.se.pokemon.*;

public class Main{
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