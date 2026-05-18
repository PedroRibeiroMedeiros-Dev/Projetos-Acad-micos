/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package idid.atividadeareadocirculo;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeAreaDoCirculo {

    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       System.out.print("informe o raio do circulo: ");
       double raio = leitor.nextDouble();
       double area = raio * 3.14;
       System.out.print( "A area do circulo sera de:" + area);
      
       
    }
}
