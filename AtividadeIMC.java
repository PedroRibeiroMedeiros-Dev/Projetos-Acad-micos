/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeimc;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeIMC {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        double alt = leitor.nextDouble();
        System.out.print(" Digite seu peso");
        double pes = leitor.nextDouble();
        double imc = pes / (alt*alt);
        if (imc>=25) System.out.print(" Acima do peso " + imc);
        else System.out.print(" Peso normal " + imc);
    }
}
