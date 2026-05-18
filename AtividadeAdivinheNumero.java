/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeadivinhenumero;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeAdivinheNumero {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int segredo =42;
        int chute;
        System.out.print(" Insira um numero: ");
        chute = leitor.nextInt();
        while (chute!=segredo)
        {
            if (chute>segredo)
            {
                System.out.println(" Maior");           
            }
            else 
            {
                System.out.print(" Menor");
            }
            System.out.println(" Tente novamente");
            chute = leitor.nextInt();
        }
        System.out.print(" Acertou, parabens");
    }
}
