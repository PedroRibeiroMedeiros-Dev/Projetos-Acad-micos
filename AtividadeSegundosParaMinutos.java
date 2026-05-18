/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package idid.atividadesegundosparaminutos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeSegundosParaMinutos {

    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
       System.out.print("informe a quantidade de tempo em segundos: ");
       double s = leitor.nextDouble();
       double min = s / 60;
       System.out.print(" A quantidade de tempo em minutos sera de:" + min);
    }
}
