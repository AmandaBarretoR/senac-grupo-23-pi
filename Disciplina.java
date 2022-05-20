package SGE;

public class Disciplina {
	public String nome;
	public int id;
	public String departamento;
	public int[] preRequisito;
	public String ementa;
	public String nivel;
	public double professor;
	
	public Disciplina(String nome, String departamento) {
		nome = this.nome;
		departamento = this.departamento;
	}
	
	// Método para criação de nova disciplina (Geração de Id)
	public int cadastrarNovaDisciplina(String nome) {
		
		this.nome = nome;
		
		int min = 0;
	    int max = 1000;
		
	    int id = (int)Math.floor(Math.random()*(max-min+1)+min);
	    
	    return id;
	}	
	
	// Método para alteração de ementa de disciplina
	
		// Modificador get para selecionar o id da disciplina
		public int getId() {
			return id;
		}
	
		public void alterarEmentaDisciplina(int id, String ementa) {
			this.ementa = ementa;
		}
		
	// Método para alteração de pré-requisito à disciplina
		public int[] getPreRequisito() {
			return preRequisito;
		}
	
		public void alterarPreRequisito(int id, int[] preRequisito) {
			this.preRequisito = preRequisito;
		}
	
	// Modificador get para selecionar o nível da disciplina
		public String getNivel() {
			return nivel;
		}
	
}
