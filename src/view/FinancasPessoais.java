package view;

import financa.Receita;
import financa.Despesas;
import financa.Transacao;

public class FinancasPessoais {

	public static void main(String[] args) {
		
		Receita conta = new Receita("Conta Principal", 0, 0);

		Transacao receita1 = new Receita("Salário", 2500.0, 0);
		Transacao despesa1 = new Despesas("Aluguel", 950.0, null);
		Transacao despesa2 = new Despesas("Supermercado", 600.0, null);

		conta.adicionarTransacao(receita1);
		conta.adicionarTransacao(despesa1);
		conta.adicionarTransacao(despesa2);

		conta.exibirExtrato();
	}
}