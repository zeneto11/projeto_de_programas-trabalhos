public class Divisao {
    private double a;
    private double b;

    public Divisao(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void mostarResultado() {
        double total = a/b;
        System.out.println("O resultado dessa divisão é: " + total);
    }

    public void ArithmeticException() {
        
    }
    
}

    