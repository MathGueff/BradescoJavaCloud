package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		String[] candidatos = {"FELIPE", "MÁRCIA", "JÚLIA","PAULO","ROBERTO","RICARDO","MATHEUS"};
		for (String candidato : candidatos) {
			entrandoEmContato(candidato);
		}
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuaTentando = true;
		boolean atendeu = false;
		
		do{
			atendeu = atender();
			continuaTentando = !atendeu;
			if(continuaTentando)
				tentativasRealizadas++;
		}while(continuaTentando && tentativasRealizadas < 3);
		
		if(atendeu)
			System.out.println("✅ CONSEGUIMOS CONTATO COM O " + candidato + " NA " + tentativasRealizadas + "º TENTATIVA");
		else
			System.out.println("❌ NÃO CONSEGUIMOS CONTATO COM O " + candidato);
			
	}
	
	static boolean atender() {
		return new Random().nextInt(5) == 1; //Gera um int de 0 a 3
	}
	
	static void imprimirSelecionados() {
		String[] candidatos = {"FELIPE", "MÁRCIA", "JÚLIA","PAULO","ROBERTO"};
		
		for(int i = 0; i < candidatos.length; i++) {
			System.out.println("O candidato de nº " + (i+1) + " é o " + candidatos[i]);
		}
		
		for(String candidato : candidatos) {
			System.out.println("O candidato selecionado é: " + candidato);	
		}
	}
	static void selecaoCandidatos() {
		String[] candidatos = {"FELIPE", "MÁRCIA", "JÚLIA","PAULO","ROBERTO","RICARDO","MATHEUS"};
		double salarioBase = 2000.00;
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			System.out.println("O candidato " + candidato + " solicitou esse valor de salário: " +salarioPretendido);
			//analisarCandidato(salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " entrou para a vaga");
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
		System.out.println("Vagas preenchidas: " + candidatosSelecionados + " de 5");	
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.00;
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if(salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM OUTRA PROPOSTA");
		}
		else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}
