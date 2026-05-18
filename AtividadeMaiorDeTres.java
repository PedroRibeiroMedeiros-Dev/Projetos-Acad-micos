/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividademaiordetres;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeMaiorDeTres {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int num1 = leitor.nextInt();
        System.out.print("Digite outro numero: ");
        int num2 = leitor.nextInt();
        System.out.print("Digite o ultimo numero: ");
        int num3 = leitor.nextInt();
        int maior = num1;
        if(num2>maior){
        maior = num2;
        if (num3>maior)
        maior = num3;
        }
         System.out.print("O maior numero e:" + maior);
        
    }
}
