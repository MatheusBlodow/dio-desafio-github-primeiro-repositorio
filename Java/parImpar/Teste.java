package teste;

public class Teste {
	
	public static void main(String [] args) {
		rodar();
	}
	
	public static void rodar() {
		//reverso();
		//divisivel();
		parImpar();
	}
	
	
	
	public void reverso() {
		String teste = "Boa noite";
		
		System.out.println(new StringBuilder(teste).reverse() +"\n");
	}
	
	public static void divisivel() {

        for(int i=0; i<10;i++){
            if(i==0) {
            	System.out.println("o número " +i+ " é multiplo de todos os numeros naturais");
            }else if(i%5==0){
                System.out.println("o número "+i+" é multiplo de 3");
            } else if (i%3==0){
                System.out.println("o número "+i+" é multiplo de 5");
            }else{
                System.out.println(i);
            }
        }
	}
	
	public static void parImpar() {
	    int numero = 10;
		
		for (int i=0;i<=numero;i++){
	            if(i%2==0){
	                System.out.println("par: "+i); 
	            }else{
	            	System.out.println("impar: "+i);
	            }
	        }
	}
}
