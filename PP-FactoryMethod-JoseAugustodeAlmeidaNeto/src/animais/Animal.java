package animais;

public abstract class Animal {
    public String nome;
    public Integer tipoAnimal;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTipoAnimal() {
        return this.tipoAnimal;
    }

    public void setTipoAnimal(Integer tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
}
