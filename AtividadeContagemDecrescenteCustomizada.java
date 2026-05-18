/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadecontagemdecrescentecustomizada;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeContagemDecrescenteCustomizada {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int i;
        System.out.print(" Digite onde vai comecar a contagem: ");
        i = leitor.nextInt();
        while (i>0)
        {
            System.out.println("Faltam" + i + "segundos");
            i--;
        }
        System.out.print(" BOOM");
    }
}
