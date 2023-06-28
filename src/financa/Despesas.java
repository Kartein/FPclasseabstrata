package financa;

public class Despesas extends Transacao {

	private String despesas;

	public Despesas(String descricao, double valor, String despesas) {
		super(descricao, valor);
		this.despesas = despesas;
	}
	public String getDespesas() {
		return despesas;
	}
	public void setDespesas(String despesas) {
		this.despesas = despesas;
	}
	@Override
	public void executar() {
		System.out.println("Despesa: " + descricao + " - R$" + valor);
	}
}