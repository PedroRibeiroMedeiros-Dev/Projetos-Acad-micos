/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadedoisintervalos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeDoisIntervalos {

    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double n1 = leitor.nextDouble();
        if (n1>20){
            System.out.print("Maior que 20");        
        }
        else if(n1>10){
        System.out.print(" Entre 11 e 20");
        }
        else if(n1>0){
            System.out.print(" Entre 0 e 10");
        }
           }
}
