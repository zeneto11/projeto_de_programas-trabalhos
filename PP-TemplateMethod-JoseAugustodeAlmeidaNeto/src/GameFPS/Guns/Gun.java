package GameFPS.Guns;

public abstract class Gun {
    protected String name;
    protected int AmmoMag;
    protected int AmmoTotal;
    protected int MaxMag;
    protected int Shoot;

    public Gun(String name, int AmmoMag, int AmmoTotal, int MaxMag, int Shoot) {
        this.name = name;
        this.AmmoMag = AmmoMag;
        this.AmmoTotal = AmmoTotal;
        this.MaxMag = MaxMag;
        this.Shoot = Shoot;
    }

    Gun() {}

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmmoMag() {
        return this.AmmoMag;
    }

    public void setAmmoMag(int AmmoMag) {
        this.AmmoMag = AmmoMag;
    }

    public int getAmmoTotal() {
        return this.AmmoTotal;
    }

    public void setAmmoTotal(int AmmoTotal) {
        this.AmmoTotal = AmmoTotal;
    }

    public int getMaxMag() {
        return this.MaxMag;
    }

    public void setMaxMag(int MaxMag) {
        this.MaxMag = MaxMag;
    }

    public int getShoot() {
        return this.Shoot;
    }

    public void setShoot(int Shoot) {
        this.Shoot = Shoot;
    }
    
    public void attack() {
        System.out.println("------------------------------------");
        printInfo();
        shoot();
        shoot();
        shoot();
        reload();
        printInfo();
        System.out.println("------------------------------------");
    }

    public void printInfo() {
        System.out.println("Arma "  + this.getName());
		System.out.println("Munição: "+ this.AmmoMag + "/" + this.AmmoTotal);
    }

    public abstract void shoot();
    
    public void reload() {
        if (this.AmmoTotal >= this.AmmoMag) {
            this.AmmoTotal = this.AmmoTotal - this.MaxMag;
            this.AmmoMag = this.MaxMag;
            System.out.println("A arma " + this.getName() + " teve seu pente de munição recarregado e restam " + this.AmmoTotal + " balas na mochila.");
        } else {
            System.out.println("Sem munição.");
        }
    }
    
}