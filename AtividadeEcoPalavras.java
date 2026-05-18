/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeecopalavras;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeEcoPalavras {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite alguma palavra: ");
        String f = leitor.nextLine();
        for ( int i = 10; i > 0; i--)
        {
            System.out.println( f );
        }
    }
}
