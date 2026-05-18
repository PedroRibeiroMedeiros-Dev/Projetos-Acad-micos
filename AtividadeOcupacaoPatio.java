import java.util.Scanner;

public class AtividadeOcupacaoPatio//Pedro RIbeiro Medeiros
 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		String placa;
		int i = 0;
		do
		 {
		    System.out.print(" Digite sua placa: ");
		    placa = leitor.nextLine();
		    
		    i++;
		 }
		 
		 while ((i <= 50 ) &&   !placa.equals("FIM"));
		    		
	}
}