/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadesalariobonus;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeSalarioBonus {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira seu salario: ");
        double s = leitor.nextDouble();
        if (s<=2000){
        double vf = s * 1.05;
        System.out.print(vf);
        }
        else if (s>5000){
            double vf2 = s * 1.150;
            System.out.print(vf2);
        }
        else if (s>2000){
            double vf3 = s * 1.10;
            System.out.print(vf3);
        }
    }
}
