package pokemons;

import ru.ifmo.se.pokemon.*;
import attack.*;

public class Terrakion extends Pokemon {
    public Terrakion (String name, int level){
        super(name, level);
        setType(Type.ROCK, Type.FIGHTING);
        setStats(91, 129, 90, 72, 90, 108);
        setMove(new XScissor(), new RockPolish(), new AerialAce(), new CloseCombat());

    }
}
