package GameFPS.Guns;

public class Bazooka extends Gun{

    public Bazooka(String name) {
        this.name = name;
        this.AmmoMag = 1;
        this.AmmoTotal = 3;
        this.MaxMag = 1;
        this.Shoot = 1;
    }

    public void shoot() {
        if (this.AmmoMag < this.Shoot) {
            reload();
        } else {
            this.AmmoMag = this.AmmoMag - this.Shoot;
            System.out.println("BOOOOOOOOOOOOOOOOOOOOM!");
        }

    }

}