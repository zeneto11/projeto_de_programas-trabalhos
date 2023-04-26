package correios;

public class Caminhao implements Transporte {
	public String tipoTransporte = "rodoviario";

	public String mostrarPedido() {
		return "O pedido está a caminho por vias ferroviárias.";
	}

	public String entregue() {
		return "O pedido foi entregue por vias ferroviárias.";
	}
    
}
