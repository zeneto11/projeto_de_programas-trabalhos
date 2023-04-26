package correios;

public class Aviao implements Transporte {
	public String tipoTransporte = "aereo";

    public String mostrarPedido() {
		return "O pedido está a caminho por vias aéreas.";
	}

	public String entregue() {
		return "O pedido foi entregue por vias aéreas.";
	}
    
}
