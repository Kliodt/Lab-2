import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon p1 = new Bellsprout("Старый", 1);
        Pokemon p2 = new Onix("Жирный", 1);
        Pokemon p3 = new Steelix("Злой", 1);
        Pokemon p4 = new Terrakion("Косой", 1);
        Pokemon p5 = new Victreebel("Хромой", 1);
        Pokemon p6 = new Weepinbell("Глухой", 1);

        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
    }
}
