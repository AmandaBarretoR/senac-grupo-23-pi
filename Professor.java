package SGE;
import java.util.Date;

public class Professor implements CalculoMF{
	public String nome;
	public int matricula;
	public String departamento;
	private double cpf;
	private Date dataNascimento;
	
	// Método para calcular a média final do aluno na disciplina
	public double calcularMF(double N1, double N2) {
		double MF = N1 * 0.4 + N2 * 0.6;
		return MF;
	}
	
	// Método para setar a média final do aluno na disciplina
	public void setMF(Aluno objAluno, Disciplina objDisciplina, double MF) {
		new Resultados(objAluno.getMatricula(), objDisciplina.getId(), MF);
	}
	
	// Método para setar a frequência do aluno na disciplina
	public void setFrequencia(Aluno objAluno, Disciplina objDisciplina, int frequencia) {
		new Resultados(objAluno.getMatricula(), objDisciplina.getId(), frequencia);
	}
	
	// Modificadores get e set para cpf
	public double getCpf() {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	
	// Modificadores get e set para data de nascimento
	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
