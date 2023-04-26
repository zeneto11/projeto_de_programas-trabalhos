package correios;

public class Trem implements Transporte {
	public String tipoTransporte = "ferroviario";

    public String mostrarPedido() {
		return "O pedido está a caminho por vias rodoviárias.";
	}

	public String entregue() {
		return "O pedido foi entregue por vias rodoviárias.";
	}
    
}
