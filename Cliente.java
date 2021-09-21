package Jurosc;

public class Cliente {
	private String nomePessoa;
	private String cpfPessoa;
	
	public void setnomePessoa(String nPessoa) {
		this.nomePessoa = nPessoa;
	}

	public String getnomePessoa() {
		return this.nomePessoa;
	}
	public void setcpfPessoa(String cpf) {
		this.cpfPessoa = cpf;
	}

	public String getcpfPessoa() {
		return this.cpfPessoa;
	}
}
