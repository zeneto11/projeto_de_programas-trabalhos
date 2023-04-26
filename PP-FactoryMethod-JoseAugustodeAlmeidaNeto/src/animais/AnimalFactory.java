package animais;

public class AnimalFactory {
    public Animal getAnimal(String nome, Integer tipoAnimal) {
        if (tipoAnimal == 1) {
			return new Gato(nome);
		}

        if (tipoAnimal == 2) {
			return new Cachorro(nome);
		}
        return null;
    }
}