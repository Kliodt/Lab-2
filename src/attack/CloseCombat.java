package attack;

import ru.ifmo.se.pokemon.*;

public class CloseCombat extends PhysicalMove {
    public CloseCombat(){
        super(Type.FIGHTING, 120, 100);
    }

    @Override
    protected String describe(){
        return "Использует Close Combat";
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, -1);
        p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }
}
