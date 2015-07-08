package simulador;

public class ProgSimulador {

	public static void main(String[] args) {
		Simulador simu = new Simulador();
		
		simu.setCliente("Worfigoon José de Araújo");
		simu.setValor_Veiculo(40000.0);
		simu.setValor_Entrada(10000.0);
		simu.setNum_Prestacao(48);
		simu.setRenda_Mensal(5000.0);
		simu.setTaxa_Juros(.05);
		
		
		System.out.println("Nome do cliente: " + simu.getCliente());
		System.out.println("Valor do veículo: R$ " + simu.getValor_Veiculo());
		System.out.println("Valor da entrada: R$ " + simu.getValor_Entrada());
		System.out.println("Numero de prestação: " + simu.getNum_Prestacao());
		System.out.println("Renda mensal: R$ " +  simu.getRenda_Mensal());
		System.out.println("Taxa de juros: " + simu.getTaxa_Juros());
		System.out.println("\n\n" + "Valor a ser financiador: R$ " + simu.valorAfinanciar());
		System.out.println("\n\n" + simu.valor_Prestacao());
	    
	}

	

}
