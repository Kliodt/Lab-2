package attack;

import ru.ifmo.se.pokemon.*;

public class DarkPulse extends SpecialMove {
    public DarkPulse(){
        super(Type.DARK, 80, 100);
    }

    @Override
    protected String describe(){
        return "Использует Dark Pulse";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() < 0.2){
            Effect.flinch(p);
        }
    }


}
