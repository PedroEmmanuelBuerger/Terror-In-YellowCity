package rpg.Events;

import rpg.Utils.SlowConsole;
import rpg.Character.Classes.Attributes;

public class RareItemEvent implements NonCombatEvent {
    private SlowConsole slowConsole = new SlowConsole();

    @Override
    public void executeEvent(Attributes personagem) {
        slowConsole.imprimirDevagar("Você encontrou um item raro! Ganhou +5 de ataque.");
        personagem.setAttack(personagem.getAttack() + 5);
    }
}
