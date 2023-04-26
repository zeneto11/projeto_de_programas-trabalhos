package animais;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        this.nome = nome;
        System.out.println("Cachorro: "+ this.nome);
    }
}
