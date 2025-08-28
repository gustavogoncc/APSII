package Exercicio2;

public class ProgramaDasFiguras {
	public static void main(String[]args) {
		GerenteDeFiguras gerente = new GerenteDeFiguras();
		
		// Adicionando os triângulos
		gerente.adicionarFigura(new Triangulo(2.0,3.0));
		gerente.adicionarFigura(new Triangulo(4.0, 5.0));
		
		// Adicionando os Losangos 
		gerente.adicionarFigura(new Losango(6.0, 8.0));
		gerente.adicionarFigura(new Losango(5.0, 4.0));
		
		// Imprimindo todas as figuras cadastradas
		System.out.println("Figuras cadastradas.");
		gerente.imprimeFiguras();
		
		// Calculando a área total
		System.out.println("Área total das figuras: "+gerente.calculaAreaTotalFiguras());
		
		// Maior área entre as figuras
		System.out.println("Maior área entre as figuras: "+ gerente.getMaiorAreaDeFigura());
	}

}
