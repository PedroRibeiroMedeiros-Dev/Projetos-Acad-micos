/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeinvestigador;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeInvestigador {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] nome = {"Pedro", "Lucas", "Enri", "JP", "Thiago"};
        int i;
        String procurado;
        for(i=0;i<nome.length;i++)
        {
            System.out.println(" Qual nome esta a procura? ");
            procurado = leitor.nextLine();
            if(nome[i].equals(procurado))
                    {
                        System.out.println(" A pessoa está na posicao " + i);
                    }
            System.out.print("Nao encontrado");
        }
    }
}
