package pokemons;

import attack.Acid;

public class Weepinbell extends Bellsprout {
    public Weepinbell (String name, int level) {
        super(name, level);
        setStats(65, 90, 50, 85, 45, 55);
        addMove(new Acid());



    }
}
