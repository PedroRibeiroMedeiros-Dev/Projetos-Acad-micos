/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadedobrador2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeDobrador2 {

    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
        for (int i = 1; i < 6; i++)
        {
            System.out.println(" Digite um numero: ");
            int num = leitor.nextInt();
            int dobro = num * 2;
            System.out.println(" o dobro do numero e: " + dobro);  
        }
    }
}
