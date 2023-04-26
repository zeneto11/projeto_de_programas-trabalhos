package correios;

public class TransportesFactory {
    public Transporte getTransporte(String tipoTransporte) {
		if (tipoTransporte.equals("ferroviario"))
			return new Trem();

		if (tipoTransporte.equals("rodoviario"))
			return new Caminhao();
		
		if (tipoTransporte.equals("aereo"))
			return new Aviao();

	}

}