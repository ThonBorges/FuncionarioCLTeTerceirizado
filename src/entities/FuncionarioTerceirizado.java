package entities;

public class FuncionarioTerceirizado extends Funcionario {

	private Double despesaAdicional;
	
	public FuncionarioTerceirizado() {
		super();
	}

	public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHoras, Double despesaAdicional) {
		super(nome, horas, valorPorHoras);
		this.despesaAdicional = despesaAdicional;
	}
	
	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}

	@Override
	public double pagamento() {
		return super.pagamento() + despesaAdicional * 1.1;
	}
}
