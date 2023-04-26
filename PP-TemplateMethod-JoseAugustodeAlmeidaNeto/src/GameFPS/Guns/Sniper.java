package GameFPS.Guns;

public class Sniper extends Gun{

    public Sniper(String name) {
        this.name = name;
        this.AmmoMag = 4;
        this.AmmoTotal = 15;
        this.MaxMag = 4;
        this.Shoot = 1;
    }

    public void shoot() {
        if (this.AmmoMag < this.Shoot) {
            reload();
        } else {
            this.AmmoMag = this.AmmoMag - this.Shoot;
            System.out.println("1 tiro de precisão foi atirado.");
        }

    }

}
