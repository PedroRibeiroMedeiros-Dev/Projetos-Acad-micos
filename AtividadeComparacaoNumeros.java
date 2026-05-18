/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadecomparacaonumeros;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeComparacaoNumeros {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double n1 = leitor.nextDouble();
        System.out.print(" Digite outro numero: ");
        double n2 = leitor.nextDouble();
        if (n1 == n2){
            System.out.print(" Numeros iguais");
        }
        else if(n1>n2){
            System.out.print(n1);
        }
        else{
            System.out.print(n2);
        }
          }
}
