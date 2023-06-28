package financa;

import java.util.ArrayList;
import java.util.List;

public class Receita extends Transacao{

    private double saldo;
    private List<Transacao> transacoes;

    public Receita(String descricao, double valor, double saldo) {
    	super(descricao, valor);
        this.saldo = saldo;
        this.transacoes = new ArrayList<>();
        System.out.println("Extrato da conta:");
    }
    public void adicionarTransacao(Transacao transacao) {   
        transacoes.add(transacao);
        transacao.executar();
        saldo += transacao.getValor();
    }
    public void exibirExtrato() {
        ;
        System.out.println("\nO extrato apresenta tudo que\n" + "entrou e saiu da conta.\n");
        System.out.println("Comprovante da conta:");
        for (Transacao transacao : transacoes) {
            System.out.println(transacao.getDescricao() + " - R$" + transacao.getValor());
        }
        saldo = 0;
        System.out.println("Saldo atual: R$" + saldo + "\n");
        System.out.println("O saldo representa a quantia final\n" + 
                           "de dinheiro restante na conta depois\n" + 
        		           "de ter finalizado todas as transações.");
    }
	@Override
	public void executar() {
		System.out.println("Receita: " + getDescricao() + " - R$" + getValor());
	}	
}