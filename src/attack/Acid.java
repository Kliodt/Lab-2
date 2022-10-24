package attack;

import ru.ifmo.se.pokemon.*;

public class Acid extends SpecialMove {
    public Acid() {
        super(Type.POISON, 40, 100);
    }

    @Override
    protected String describe(){
        return "Использует Acid";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() < 0.1){
            p.setMod(Stat.DEFENSE, -1);
        }
    }



}
