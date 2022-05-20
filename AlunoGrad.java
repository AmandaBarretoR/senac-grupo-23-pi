package SGE;

public class AlunoGrad extends Aluno {
	public String[] diploma;
	
	public AlunoGrad(int matricula) {
		super(matricula);
	}
	
	// Método para pegar o diploma do aluno
	public String[] getDiploma() {
		return diploma;
	}
	
}
