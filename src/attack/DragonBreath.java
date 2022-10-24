package attack;

import ru.ifmo.se.pokemon.*;

public class DragonBreath extends SpecialMove {
    public DragonBreath (){
        super(Type.DRAGON, 60, 100);
    }

    @Override
    protected String describe(){
        return "Использует Dragon Breath";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() < 0.3){
            Effect.paralyze(p);
        }
    }


}
