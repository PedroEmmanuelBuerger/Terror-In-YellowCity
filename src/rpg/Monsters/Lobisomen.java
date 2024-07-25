package rpg.Monsters;

import rpg.Utils.SlowConsole;
import rpg.Classes.Attributes;

public class Lobisomen extends Attributes {
    SlowConsole slowConsole = new SlowConsole();

    public Lobisomen(String name, int healthbar, int attack, int specialAttack, String battleCry) {
        super(name, healthbar, attack, specialAttack, battleCry);
        this.setExp(25);
    }

    @Override
    public void attack(Attributes target) {
        int damage = this.getAttack();
        slowConsole.imprimirDevagar(this.getName() + " avança e morde " + target.getName() + " ,causando " + damage + " de dano!");
        target.takeDamage(damage);
    }

    @Override
    public void attackWithSpecial(Attributes target) {
        int damage = this.getSpecial();
        slowConsole.imprimirDevagar(this.getName() + " tenta infectar " + target.getName() + " , causando " + damage + " de dano!");
        target.takeDamage(damage);
    }
}
