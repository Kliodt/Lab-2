package pokemons;

import attack.DarkPulse;

public class Steelix extends Onix{
    public Steelix (String name, int level){
        super(name, level);
        setStats(75, 85, 200, 55, 65, 30);
        addMove(new DarkPulse());

    }
}
