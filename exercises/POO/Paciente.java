package poo;

import java.util.Scanner;

public class Paciente {
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private String matricula;

	public Paciente(String nome, String cpf, String endereco, String telefone, String matricula) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void marcarConsulta() {
		int op;
		String dia, mes, ano, hora, nomeMedico;
		Scanner read = new Scanner(System.in);

		System.out.println("*******************************************");
		System.out.println("Olá, você quer marcar uma consulta?\n1-Sim\n2-Não");
		op = read.nextInt();

		switch (op) {
		case 1:
			System.out.println("*******************************************");
			System.out.println("Ok, informe o dia que gostaria de marcar...");
			dia = read.nextLine();
			System.out.println("Informe o mês que gostaria de marcar...");
			mes = read.nextLine();
			System.out.println("Informe o ano que gostaria de marcar...");
			ano = read.nextLine();
			System.out.println("Informe a hora que gostaria de marcar...");
			hora = read.nextLine();
			System.out.println("Informe o nome do Dr(a). que gostaria de marcar...");
			nomeMedico = read.nextLine();

			System.out.println("\nA sua consulta foi marcada na data " + dia + "/" + mes + "/" + ano + " no horário "
					+ hora + " com o Dr(a). " + nomeMedico);
			break;
		case 2:
			System.out.println("*******************************************");
			System.out.println("\nMuito obrigado pela visita em nossa clínica, volte sempre...");
			break;
		default:
			System.out.println("\nOpção Inválida...");
		}

	}

	public void desmarcarConsulta() {
		int op;
		String dia, mes, ano, hora, nomeMedico;
		Scanner read = new Scanner(System.in);

		System.out.println("*******************************************");
		System.out.println("Olá, você quer desmarcar sua consulta?\n1-Sim\n2-Não");
		op = read.nextInt();

		switch (op) {
		case 1:
			System.out.println("*******************************************");
			System.out.printf("Ok, informe o dia da sua consulta...");
			dia = read.nextLine();
			System.out.println("Informe o mês...");
			mes = read.nextLine();
			System.out.println("Informe o ano...");
			ano = read.nextLine();
			System.out.println("Informe a hora...");
			hora = read.nextLine();
			System.out.println("Informe o nome do médico(a)...");
			nomeMedico = read.nextLine();

			System.out.println("\nA sua consulta na data" + dia + "/" + mes + "/" + ano + " no horário " + hora
					+ " com o Dr(a). " + nomeMedico + " foi desmarcada com sucesso...");
			break;
		case 2:
			System.out.println("*******************************************");
			System.out.println("\nOk sua consulta continua marcada, ligue se quiser desmarcar...");
			break;
		default:
			System.out.println("\nOpção Inválida...");
		}

	}

	public void printInfo() {
		System.out.println("O paciente " + this.nome + " com o cpf: " + this.cpf + "\nEndereço: " + this.endereco
				+ "\nTelefone: " + this.telefone + "\nMatrícula: " + this.matricula);
	}

}
