package lanchonete.atendimento;

public class Atendente {
	public void servindoMesa() {
		pegarLancheCozinha();
		System.out.println("SERVINDO MESA");
	}
	private void pegarLancheCozinha() {
		System.out.println("PEGANDO O LANCHE NA COZINHA");
	}
	public void receberPagametno() {
		System.out.println("RECEBENDO O PAGAMENTO");
	}
	void trocarGas() {
		System.out.println("ATENDENTE TROCANDO O GAS");
	}

}
