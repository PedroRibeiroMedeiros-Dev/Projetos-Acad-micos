/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadelistaamigos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeListaAmigos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] lista = new String[5];
        int i;
        int num;
        for (i=0;i<lista.length;i++)
        {
            System.out.print("Digite o nome de seus amigos: ");
            lista[i] = leitor.nextLine();
            num = i +1;
            System.out.println(" Seus amigos sao: " + num + " - " + lista[i]);
        }
    }
}
