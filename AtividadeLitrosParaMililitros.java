/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package idid.atividadelitrosparamililitros;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeLitrosParaMililitros {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       System.out.print("informe o volume em litros: ");
       double l = leitor.nextDouble();
       double ml = l * 1000;
       System.out.print(" O volume em mililitros sera de:" + ml);
    }
}
