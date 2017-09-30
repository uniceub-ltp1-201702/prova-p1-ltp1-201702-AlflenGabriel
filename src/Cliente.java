import java.time.LocalDate;

public class Cliente {
	
	private String name;
	private String CPF;
	private LocalDate dataNascimento;
	private String telefone;
	private String cidade;
	private String UF;

	
	public Cliente(String name, String cPF, LocalDate dataNascimento, String telefone, String cidade, String uF) {

		this.name = name;
		CPF = cPF;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.cidade = cidade;
		UF = uF;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public LocalDate getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getUF() {
		return UF;
	}


	public void setUF(String uF) {
		UF = uF;
	}
	
	
}
