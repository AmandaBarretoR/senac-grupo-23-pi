package SGE;

import java.util.Date;

public class Aluno {
	
	public String nome;
	public int matricula;
	private double cpf;
	private String tituloEleitor;
	private Date dataNascimento;
	public String curso;
	public String departamento;
	private String status;
	private String [] historicoEscolar;
	public String campus;
	
	// Métodos construtores
	public Aluno(String nome, double cpf, String tituloEleitor, Date dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.tituloEleitor = tituloEleitor;
		this.dataNascimento = dataNascimento;
	}
	
	public Aluno(int matricula) {
		matricula = this.matricula;
	}
	
	// Método para geração de matrícula
	public int gerarNovaMatricula(String nome, double cpf) {
		this.nome = nome;
		this.cpf = cpf;
		
		int min = 0;
	    int max = 1000000000;
		
	    int matricula = (int)Math.floor(Math.random()*(max-min+1)+min);
	    
	    return matricula;
	}
	
	// Modificadores get e set para alterar status do aluno
	public String getStatus() {
		return status;
	}

	public void alterarStatusAluno(String status) {
		this.status = status;
	}
	
	// Modificadores get e set para matrícula
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	// Método para solicitação de matrícula (Geração de protocolo)
		public int solicitarMatricula(int matricula, Disciplina objDisciplina) {
			int min = 0;
		    int max = 100000;
			
		    int protocolo = (int)Math.floor(Math.random()*(max-min+1)+min);
		    
		    return protocolo;
		}
	
	// Método para requerimento de segunda chamada (Geração de protocolo)
		public int requererSegundaChamada(int matricula, Disciplina objDisciplina) {
			int min = 0;
		    int max = 100000;
			
		    int protocolo = (int)Math.floor(Math.random()*(max-min+1)+min);
		    
		    return protocolo;
		}
		
	// Método para pegar o histórico escolar do aluno
	public String [] getHistoricoEscolar(int matricula) {
		return historicoEscolar;
	}
	
	// Modificadores get e set para data de nascimento
	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
