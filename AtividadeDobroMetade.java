/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadedobrometade;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeDobroMetade {

    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double num1 = leitor.nextDouble();
        double dobro = num1 * 2;
        System.out.print("O dobro desse numero e:" + dobro);
        double metade = num1/2;
        System.out.print(" A metade desse numero e:" + metade);
        
        
    }
}
