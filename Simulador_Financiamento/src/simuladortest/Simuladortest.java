package simuladortest;

import static org.junit.Assert.*;

import org.junit.Test;

import simulador.Simulador;

public class Simuladortest {

	

	@Test
	public void nomeCliente() {
		
		Simulador simu = new Simulador();
		
		simu.setCliente("");
		String esperado = "";
		String atual = simu.getCliente();
		
		assertEquals(esperado, atual);
		
	}

	@Test
	public void setValor_VeiculoMenorqueZero() {
		
		Simulador simu = new Simulador();
		
		simu.setValor_Veiculo(-9);
		double esperado = 0.0;
		double atual = simu.getValor_Veiculo();
		
		assertEquals(esperado, atual, 0.0);
		}
	
	
	@Test
	public void setValor_EntradaMenorqueZero() {
		
		Simulador simu = new Simulador();
		
		simu.setValor_Entrada(-9);
		double esperado = 0.0;
		double atual = simu.getValor_Entrada();
		
		assertEquals(esperado, atual, 0.0);
		}
	
	
	@Test
	public void setNum_PrestacaoMenorqueZero() {
	
	Simulador simu = new Simulador();
	
	simu.setNum_Prestacao(-9);
	double esperado = 0.0;
	double atual = simu.getNum_Prestacao();
	
	assertEquals(esperado, atual, 0.0);
	}
	
	
	@Test
	public void valor_Prestacao() {
	
	Simulador simu = new Simulador();
	simu.setValor_Veiculo(40000);
	simu.setValor_Entrada(10000);
	simu.setNum_Prestacao(48);
	simu.setRenda_Mensal(-2000);
	simu.setTaxa_Juros(5);
	
	double esperado = 1659.5529174602382;
	double atual = simu.valor_Prestacao();
	
	assertEquals(esperado, atual, 0.0);
	}
}

