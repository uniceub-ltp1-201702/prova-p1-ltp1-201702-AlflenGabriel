
// NOME: Gabriel da Silva Alflen RA: 21550575

public class Principal {

	public static void main(String[] args) {
		
		BDSimulado bd = new BDSimulado();
		
		System.out.println(bd.getInfoCliente("Evandro da Silva"));
		
		System.out.println(bd.ligacoesPorCliente("João dos Montes"));
		
		   int ligacoesPorUF = bd.ligacoesPorUF("RJ");
		   System.out.println("Ligações efetuadas: " + ligacoesPorUF);
		   
		System.out.println("Ligações com UF de origem diferente com UF de destino: " + bd.ligacoesUFDiferente());

		System.out.println("Conta Cliente: " + bd.contaCliente("Otaviano Neves"));
	}

}
