package GameFPS.Guns;

public class Shotgun extends Gun{

    public Shotgun(String name) {
        this.name = name;
        this.AmmoMag = 12;
        this.AmmoTotal = 36;
        this.MaxMag = 12;
        this.Shoot = 3;
    }

    public void shoot() {
        if (this.AmmoMag < this.Shoot) {
            reload();
        } else {
            this.AmmoMag = this.AmmoMag - this.Shoot;
            System.out.println("2 disparos de projéteis múltiplos foram realizados.");
        }

    }

}