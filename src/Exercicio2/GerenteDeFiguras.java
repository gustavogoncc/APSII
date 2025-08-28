package Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {
	private List<FiguraGeometrica> figuras;
	
	public GerenteDeFiguras() {
		figuras = new ArrayList<>();
	}
	// Adicionando uma figura na lista: 
	public void adicionarFigura(FiguraGeometrica f) {
		figuras.add(f);
		
	}
	// Imprimindo os nomes de todas as figuras cadastradas:
	public void imprimeFiguras() {
		for(FiguraGeometrica f: figuras) {
			System.out.println(f.getNomeFigura());
		}
	}
	// Retorna a área total de todas as figuras cadastradas:
	public double calculaAreaTotalFiguras() {
		double soma = 0;
		for(FiguraGeometrica f : figuras) {
			
			soma += f.calculaArea();
		}
		return soma;	
	}
	
	// Retorna a maior área entre as figuras cadastradas: 
	public double getMaiorAreaDeFigura() {
		double maior = 0;
		for(FiguraGeometrica f : figuras) {
			if(f.calculaArea() > maior) {
				maior = f.calculaArea();
			}
		}
		return maior;
		
	}
	// Retorna a lista de figuras (se for preciso usar fora da classe):
	public List<FiguraGeometrica> getFiguras(){
		return figuras;
	}

}
