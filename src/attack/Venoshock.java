package attack;

import ru.ifmo.se.pokemon.*;

public class Venoshock extends SpecialMove {
    public Venoshock(){
        super(Type.POISON, 65, 100);
    }

    @Override
    protected String describe(){
        return "Использует Venoshock";
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        if (p.getCondition() == Status.POISON){
            super.applyOppDamage(p, damage * 2);
        }
        else {
            super.applyOppDamage(p, damage);
        }
    }
}
