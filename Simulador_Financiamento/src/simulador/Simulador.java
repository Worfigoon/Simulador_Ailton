package simulador;

import java.lang.Math;
public class Simulador {
	
	private String cliente;
	private double valor_Prestacao = 0.0;
	private double valor_Veiculo = 0.0;
	private double valor_Entrada = 0.0;
	private double valor_Afinanciar;
	private int num_Prestacao = 0;
	private double taxa_Juros;
	private double renda_Mensal = 0.0;
	
	
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		
		if(cliente != null){
		this.cliente = cliente;
		}else{
			System.out.println("Opção nome cliente invalida!!!");
		}
	}
	
	public double getValor_Veiculo() {
		return valor_Veiculo;
	}
	public void setValor_Veiculo(double valor_Veiculo) {
		
		if(valor_Veiculo > 0){
			this.valor_Veiculo = valor_Veiculo;
		}else{
			System.out.println("Opção valor veículo invalido!!!");
		}
		
	}
	public double getValor_Entrada() {
		return valor_Entrada;
	}
	public void setValor_Entrada(double valor_Entrada) {
		
		if(valor_Entrada > 0 ){
		this.valor_Entrada = valor_Entrada;
		}else{
			System.out.println("Opção valor entrada invalido!!!");
		}
	}
	public int getNum_Prestacao() {
		return num_Prestacao;
	}
	public void setNum_Prestacao(int num_Prestacao) {
		
		if(num_Prestacao > 0){
			this.num_Prestacao = num_Prestacao;
		}else{
			System.out.println("Opção número de prestações invalida!!!");
		}
	}
	public double getTaxa_Juros() {
		return taxa_Juros;
	}
	public void setTaxa_Juros(double taxa_Juros) {
		
		if(taxa_Juros >= 0 && taxa_Juros <= 1){
			this.taxa_Juros = taxa_Juros;
		}else{
			System.out.println("Opção taxa de juros invalida!!!");
		}
		
	}
	public double getRenda_Mensal() {
		return renda_Mensal;
	}
	public void setRenda_Mensal(double renda_Mensal) {
		
		if(renda_Mensal > 0){
			this.renda_Mensal = renda_Mensal;
		}
		
	}
	
	public double valorAfinanciar(){
		this.valor_Afinanciar = this.valor_Veiculo - this.valor_Entrada;
		return valor_Afinanciar;
			
	}
		
	public double valor_Prestacao(){
		
		//Expressão para calculo da prestação
		this.valor_Prestacao = this.valor_Afinanciar * (this.taxa_Juros / (1 -  ( 1 / Math.pow(1 + this.taxa_Juros, this.num_Prestacao))));
		
		double valor_LimitePrestacao = this.renda_Mensal * .40;
		
		if( valor_LimitePrestacao > valor_Prestacao){
			
			double valor_TotalFinacimento  = valor_Prestacao;
			
			valor_TotalFinacimento = valor_TotalFinacimento * num_Prestacao;
			
				
			
			System.out.println("\n\n" + "O veículo pode ser financiado!!!");
			System.out.println("Limite prestação: R$ " + valor_LimitePrestacao);
			System.out.println("Valor da prestação: R$ " + valor_Prestacao);
		}else{
			System.out.println("Valor da prestação acima do limite permitido!!!");
			System.out.println("Limite prestação: R$ " + valor_LimitePrestacao);
			System.out.println("Valor da prestação: R$ " + valor_Prestacao);
		}
		return 0;	
	}
}
