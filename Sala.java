package SGE;

public class Sala {
	public String predio;
	public int capacidade;
	public int numeroSala;
	public double[] horariosDisponiveis;
	public int disciplina;
	public double horario;
	
	// Método para criação de turma
	public void criarTurma(String predio, int capacidade, int numeroSala, int disciplina, double horario) {
		this.predio = predio;
		this.capacidade = capacidade;
		this.numeroSala = numeroSala;
		this.disciplina = disciplina;
		this.horario = horario;
	}
	
	// Método para pegar o nível da disciplina
	public String getNivelDisciplina(Disciplina objDisciplina) {
	    return objDisciplina.getNivel();
	}
	
	// Método para pegar o Id da disciplina
	public int getDisciplinaId(Disciplina objDisciplina) {
	    return objDisciplina.getId();
	}
}
