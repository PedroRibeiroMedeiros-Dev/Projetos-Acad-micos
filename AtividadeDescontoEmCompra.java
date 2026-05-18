/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadedescontoemcompra;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeDescontoEmCompra {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira o valor da compra: ");
        double v = leitor.nextDouble();
        if (v>200){
        double prom = v * 0.9;
        System.out.print("O novo valor sera:" + prom);
        }
        else {
        System.out.print(v);
        
        }
    }
}
