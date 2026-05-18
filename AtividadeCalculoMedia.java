/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadecalculomedia;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeCalculoMedia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double n1 = leitor.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = leitor.nextDouble();
        double m = (n1+n2/2);
        if (m>7){
            System.out.print(" Aprovado");
        }
        else{
            System.out.print(" Reprovado");
        }
    }
}
