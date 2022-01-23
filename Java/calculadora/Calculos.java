package calculadora;

public class Calculos {
	
	private Calculadora calculo = new Calculadora();
	
	void rodar() {
		somar();
		subtrair();
		multiplicar();
		dividir();
	}
	
	void valores(double valor1, double valor2){
		calculo.setValor1(valor1);
		calculo.setValor2(valor2);
	}
	
	private void somar(){
		valores(5, 8);
		double resultado = calculo.getValor1()+calculo.getValor2();
		
		System.out.println(resultado);
	}
	
	private void subtrair() {
		valores(10, 6);
		double resultado = calculo.getValor1()-calculo.getValor2();
		
		System.out.println(resultado);
	}
	
	private void multiplicar() {
		valores(5, 5);
		double resultado = calculo.getValor1()*calculo.getValor2();
		
		System.out.println(resultado);
	}
	
	private void dividir() {
		valores(4, 2);
		double resultado = calculo.getValor1()/calculo.getValor2();
		
		System.out.println(resultado);
	}
}
