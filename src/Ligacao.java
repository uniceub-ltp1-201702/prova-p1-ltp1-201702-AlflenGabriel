import java.time.LocalDateTime;

public class Ligacao {
	
	private int codigo;
	private String numTelDestino;
	private LocalDateTime dataIni;
	private LocalDateTime dataFim;
	private String cidadeDest;
	private String UFDest;
	public Cliente cliente;

	
	public Ligacao(int codigo, String numTelDestino, LocalDateTime dataIni, LocalDateTime dataFim, String cidadeDest,
			String uFDest, Cliente cliente) {

		this.codigo = codigo;
		this.numTelDestino = numTelDestino;
		this.dataIni = dataIni;
		this.dataFim = dataFim;
		this.cidadeDest = cidadeDest;
		UFDest = uFDest;
		this.cliente = cliente;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNumTelDestino() {
		return numTelDestino;
	}


	public void setNumTelDestino(String numTelDestino) {
		this.numTelDestino = numTelDestino;
	}


	public LocalDateTime getDataIni() {
		return dataIni;
	}


	public void setDataIni(LocalDateTime dataIni) {
		this.dataIni = dataIni;
	}


	public LocalDateTime getDataFim() {
		return dataFim;
	}


	public void setDataFim(LocalDateTime dataFim) {
		this.dataFim = dataFim;
	}


	public String getCidadeDest() {
		return cidadeDest;
	}


	public void setCidadeDest(String cidadeDest) {
		this.cidadeDest = cidadeDest;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public String getUFDest() {
		return UFDest;
	}


	public void setUFDest(String uFDest) {
		UFDest = uFDest;
	}
	


}
