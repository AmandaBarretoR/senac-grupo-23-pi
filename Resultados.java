package SGE;

public class Resultados {
	public int matricula;
	public int disciplina;
	public double MF;
	public int frequencia;
	
	public Resultados(int matricula, int disciplina, double MF) {
		this.matricula = matricula;
		this.disciplina = disciplina;
		this.MF = MF;
	}
	
	public Resultados(int matricula, int disciplina, int frequencia) {
		this.matricula = matricula;
		this.disciplina = disciplina;
		this.frequencia = frequencia;
	}
}
