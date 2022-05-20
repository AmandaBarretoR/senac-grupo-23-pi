package SGE;

public class AlunoPosGrad extends Aluno {
	public String[] diploma;
	public String[] graduacaoAnterior;
	
	public AlunoPosGrad(int matricula) {
		super(matricula);
	}
	
	// Método para pegar o diploma do aluno
	public String[] getDiploma() {
		return diploma;
	}
	
	// Método para pegar o graduação anterior do aluno
	public String[] getGraduacaoAnterior() {
		return diploma;
	}

}
