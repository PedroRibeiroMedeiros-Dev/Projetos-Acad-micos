/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeanobissesto;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeAnoBissesto {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int n = leitor.nextInt();
        int resto = n % 4;
        if (resto==0){
        System.out.print(" O ano pode ser bissexto");                
        }
        else{
            System.out.print(" Nao é bissexto");
        }
    }
}
