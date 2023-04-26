package GameFPS;

import GameFPS.Guns.Gun;
import GameFPS.Guns.AssaultRifle;
import GameFPS.Guns.Bazooka;
import GameFPS.Guns.Shotgun;
import GameFPS.Guns.Sniper;

public class teste {
    public static void main(String[] args) {
        testeGun(new AssaultRifle("AK-47"));
        testeGun(new Shotgun("SPAS-12"));
        testeGun(new Sniper("Barret"));
        testeGun(new Bazooka("RPG"));
    }

    private static void testeGun(Gun gun) {
        System.out.println("TESTE COM " + gun);
        gun.attack();
    }
    
}
