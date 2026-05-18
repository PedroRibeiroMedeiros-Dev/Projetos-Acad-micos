import java.util.Scanner;

public class MapeamentoProteina//Pedro Ribeiro Medeiros
{
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double[] pH = new double[10];
		double foraDaFaixa = 0;
		double media;
		double contador = 0;
		
		for (int i = 0; i < pH.length; i++ )
		{
		    System.out.println("Digite o valor: " + (i + 1));
		    pH[i] = leitor.nextDouble();
		}
		
		for(int k = 0; k < pH.length; k++)
		{
		   contador = contador + pH[k];
		}
		
		media = contador / pH.length;
		
		for(int r = 0; r < pH.length; r++)
		{
		   if(pH[r] < 6.5 || pH[r] > 7.5)
		   {
		       foraDaFaixa += 1;
		       
		   }
		}		    
		
		System.out.println("A media sera: " + media);
		System.out.println("A quantidade de valores fora da faixa e: " + foraDaFaixa);		
	}
}