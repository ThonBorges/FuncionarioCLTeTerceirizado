package entities;

public class Funcionario {

	private String nome;
	protected Integer horas;
	protected Double valorPorHoras;
	
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, Integer horas, Double valorPorHoras) {
		this.nome = nome;
		this.horas = horas;
		this.valorPorHoras = valorPorHoras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorPorHoras() {
		return valorPorHoras;
	}

	public void setValorPorHoras(Double valorPorHoras) {
		this.valorPorHoras = valorPorHoras;
	}
	
	public double pagamento() {
		return valorPorHoras * horas;
	}

	@Override
	public String toString() {
		return "Funcionario: \n" +
				"Nome = " + 
				nome + 
				", horas = " + 
				horas + 
				", Horas trabalhadas = " + 
				valorPorHoras + ".";
	}
	
}
