package controller;

import java.util.ArrayList;
import bancoJava.model.Conta;

public class ContaController implements repository.ContaRepository {
	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 1;

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaColletion(numero);

		if (conta != null)
			conta.visualizar();
		else
			System.out.println("A Conta número " + numero + " não foi encontrada!");
	}

	@Override
	public void listarTodas() {
		for (var conta : listaContas)
			conta.visualizar();
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("A Conta foi criada!");
	}

	@Override
	public void atualizar(Conta conta) {
		var buscaConta = buscarNaColletion(conta.getNumero());

		if (buscaConta != null) {
			listaContas.set(listaContas.indexOf(buscaConta), conta);
			System.out.println("A Conta número " + conta.getNumero() + " foi atualizada!");
		} else
			System.out.println("A Conta número " + conta.getNumero() + " não foi encontrada!");
	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaColletion(numero);

		if (conta != null) {
			if (listaContas.remove(conta) == true)
				System.out.println("A Conta número " + numero + " foi excluída!");
		} else
			System.out.println("A Conta número " + numero + " não foi encontrada!");
	}

	@Override
	public void sacar(int numero, float valor) {
		var conta = buscarNaColletion(numero);

		if (conta != null) {
			if (conta.sacar(valor) == true)
				System.out.println("O saque foi efetuado com sucesso!");
		} else
			System.out.println("A Conta número " + numero + " não foi encontrada!");
	}

	@Override
	public void depositar(int numero, float valor) {
		var conta = buscarNaColletion(numero);

		if (conta != null) {
			conta.depositar(valor);
			System.out.println("O depósito foi efetuado com sucesso!");
		} else
			System.out.println("A Conta número " + numero + " não foi encontrada!");
	}

	@Override
	public void transferir(int numero, int numeroDestino, float valor) {
		var contaOrigem = buscarNaColletion(numero);
		var contaDestino = buscarNaColletion(numeroDestino);

		if (contaOrigem != null && contaDestino != null) {
			if (contaOrigem.sacar(valor) == true) {
				contaDestino.depositar(valor);
				System.out.println("A transferência foi efetuada com sucesso!");
			}
		} else
			System.out.println("A Conta de Origem e/ou Destino não foram encontradas!");
	}

	// Implementar métodos auxiliares

	public int gerarNumero() {
		return numero++;
	}

	public Conta buscarNaColletion(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero)
				return conta;
		}

		return null;
	}

	public int retornaTipo(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero)
				return conta.getTipo();
		}

		return 0;
	}
}