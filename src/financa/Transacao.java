package financa;

public abstract class Transacao {

	protected String descricao;
    protected double valor;

    public Transacao(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
    public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
    public String getDescricao() {
        return descricao;
    }
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValor() {
        return valor;
    }
	public abstract void executar();
}