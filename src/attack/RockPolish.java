package attack;

import ru.ifmo.se.pokemon.*;

public class RockPolish extends StatusMove {
    public RockPolish(){
        super(Type.ROCK, 0, 0);
    }

    @Override
    protected String describe(){
        return "Использует Rock Polish";
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPEED, 2);
    }

}
