import java.util.Scanner;

public class AtividadeGerenciadorEstamina//Pedro Ribeiro Medeiros
 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double stam;
		
		System.out.print(" Insira a stamina atual: ");
		stam = leitor.nextDouble();
		if(stam>0)
		{
		System.out.print(" Insira o custo da acao desejada: ");
		double acao = leitor.nextDouble();
		
		while(stam>acao)
		{
		    System.out.print(" Acao realizada");
		    
		    stam = stam - acao;
		}
		System.out.print(" Estamina insuficiente");		
	}
	else{
	    System.out.print("Estamina zerada");
}
 }
 }
  