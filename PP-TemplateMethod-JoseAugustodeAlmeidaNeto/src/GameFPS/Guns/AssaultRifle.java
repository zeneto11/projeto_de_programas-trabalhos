package GameFPS.Guns;

public class AssaultRifle extends Gun{

    public AssaultRifle(String name) {
        this.name = name;
        this.AmmoMag = 30;
        this.AmmoTotal = 120;
        this.MaxMag = 30;
        this.Shoot = 10;
    }

    public void shoot() {
        if (this.AmmoMag < this.Shoot) {
            reload();
        } else {
            this.AmmoMag = this.AmmoMag - this.Shoot;
            System.out.println("10 tiros de rifle de assalto foram atirados.");
        }    
             
    }

}
    

