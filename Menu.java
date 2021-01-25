package redeAcademia;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private Scanner scanner = new Scanner(System.in);
	ArrayList<Aluno> alunos = new ArrayList<>();
	ArrayList<Pacotes> pacotes = new ArrayList<>();
	
	private String exibeMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("--------- ACADEMIA DE GINÁSTICA ---------- \n");
		sb.append("Selecione o menu desejado: \n");		
		sb.append("1 - Inserir aluno \n");		
		sb.append("2 - Exibir pacotes de serviços \n");
		sb.append("3 - Exibir alunos matriculados com planos \n");
		sb.append("4 - Exibir total de alunos (ativos + inativos) \n");
		sb.append("5 - Sair \n");
		System.out.println(sb.toString());
		return scanner.nextLine();
	}
	
	public void iniciar() {
		String opcao = exibeMenu();
		while(!opcao.equals("5")) {
			switch (opcao) {
			case "1":
				System.out.println("Informe o nome do(a) aluno(a): ");
				String nome = scanner.nextLine();
				System.out.println("Informe o cpf do(a) aluno(a): ");
				String cpf = scanner.nextLine();
				System.out.println("Informe a idade do aluno(a): ");
				String idade = scanner.nextLine();
				System.out.println("Informe a altura do(a) aluno(a): ");
				String altura = scanner.nextLine();
				System.out.println("Informe o peso do(a) aluno(a): ");
				String peso = scanner.nextLine();
				System.out.println("Informe se o(a) aluno(a) está ativo no sistema (Digite 'True' para Ativo ou 'False' para Inativo): ");
				String ativo = scanner.nextLine();
				System.out.println("Informe o índice do pacote do(a) aluno(a): ");
				System.out.println(pacotes);
				String indexPacote = scanner.nextLine();				
				Aluno aluno = new Aluno(nome, cpf, Integer.parseInt(idade), Double.parseDouble(altura), Double.parseDouble(peso), Boolean.parseBoolean(ativo), pacotes.get(Integer.parseInt(indexPacote)));
				alunos.add(aluno);
				System.out.println("Aluno adicionado com sucesso!");
				System.out.println();
				opcao = exibeMenu();					
				break;
			case "2":				
				mostrarPacotes();				
				System.out.println();
				opcao = exibeMenu();
				break;
			case "3":
				System.out.println(alunos);
				System.out.println();
				opcao = exibeMenu();
				break;
			case "4":				
				System.out.println("A quantidade total de alunos (ativos + inativos) é: " + alunos.size());
				System.out.println();
				opcao = exibeMenu();
				break;
			default:
				System.out.println("Opção inválida.");
				System.out.println();
				opcao = exibeMenu();
				break;
			}
		}
		System.out.println("Programa finalizado.");
	}
	
	private void mostrarPacotes() {
		Pacotes pacote1 = new Pacotes("Basico");
		pacotes.add(pacote1);
		Pacotes pacote2 = new Pacotes("Master");
		pacotes.add(pacote2);
		Pacotes pacote3 = new Pacotes("Premium");
		pacotes.add(pacote3);
		System.out.println(pacotes);
	}	
}