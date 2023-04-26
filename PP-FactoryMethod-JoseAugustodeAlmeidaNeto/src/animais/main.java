package animais;

public class main {
    public static void main(String args[]) {
		AnimalFactory factory = new AnimalFactory();
		String nome = "rodi";
		Integer tipoAnimal = 2;
		factory.getAnimal(nome, tipoAnimal);
	}
}
        

