/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadebuscadorpares;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeBuscadorPares {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int [] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i;
        int soma = 0;
        for (i=0; i < num.length; i++);
        {
            soma = soma + 1;
            if (num[soma]%2==0)
            {
                System.out.print(soma);
            }
        }
    }
    }


