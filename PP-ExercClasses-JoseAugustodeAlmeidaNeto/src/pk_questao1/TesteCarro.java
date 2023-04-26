package pk_questao1;

public class TesteCarro {
	public static void main(String[] args) {
        Carro OnixAzul = new Carro("123456", 180.0, 2300.0, 1.0, "azul", 4);
        System.out.println("Numero chassi: " +OnixAzul.getNumChassi());
        System.out.println("Velocidade Maxima: " +OnixAzul.getVelocidadeMaxima());
        System.out.println("Quilometragem: " +OnixAzul.getQuilometragem());
        System.out.println("Potencia: " +OnixAzul.getPotencia());
        System.out.println("Potencia: " +OnixAzul.getCor());
        OnixAzul.setLigar();
        OnixAzul.setDesligar();
        OnixAzul.setAcelerar();
        OnixAzul.setFrear();
        OnixAzul.setGirarVolante();
        OnixAzul.setReduzirMarcha();
 
        Carro JeepPreto = new Carro("654321", 207.0, 8000.0, 2.0, "preto", 4);
        System.out.println("Numero chassi: " +JeepPreto.getNumChassi());
        System.out.println("Velocidade Maxima: " +JeepPreto.getVelocidadeMaxima());
        System.out.println("Quilometragem: " +JeepPreto.getQuilometragem());
        System.out.println("Potencia: " +JeepPreto.getPotencia());
        System.out.println("Potencia: " +JeepPreto.getCor());
        JeepPreto.setLigar();
        JeepPreto.setDesligar();
        JeepPreto.setAcelerar();
        JeepPreto.setFrear();
        JeepPreto.setGirarVolante();
        JeepPreto.setReduzirMarcha();
 
    }
}
