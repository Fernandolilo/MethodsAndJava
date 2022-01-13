package media.entities;

public class Aluno {

	public String name;
	public Double media1;
	public Double media2;
	public Double media3;
	public Double media4;

	public double Media() {
		return (media1 + media2 + media3 + media4) / 4;
	}

	public Double Aprovado() {
		
		double media = this.Media();
	
		
		if(media < 60) {
			System.out.printf(" infelizmente você foi reprovado: " , String.format("%.2f", Media()));		
		
		}else {
		
			System.out.printf(" Aluno aprovado parabens a sua media foi: ", String.format("%.2f", Media()));
		}
		return media;
	
	
	}

	public String toString() {
		return "Nome: " + name + ", Media 1 bimestre: " + String.format("%.2f", media1) + ", Media 2 bimestre: "
				+ String.format("%.2f", media2) + ", Media 3 bimestre: " + String.format("%.2f", media3)
				+ ", Media 4 bimestre: " + String.format("%.2f", media4) + "  Media final: "
				+ String.format("%.2f", Media()) ;

	}

}
