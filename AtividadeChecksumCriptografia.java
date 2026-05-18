/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadechecksumcriptografia;

/**
 *
 * @author Aluno
 */
public class AtividadeChecksumCriptografia {

    public static void main(String[] args) {
        double [] [] m = {
            {30, 50, 21, 20},
            {25, 35, 33, 30},
            {82, 26, 23, 14},
            {46, 90, 10, 15}
        };
        int [] token = new int[4];
        int i,j;
        int k = 0;
        for(i=0; i<m.length;i++)
        {
            for(j=0; j<m[i].length; j++)
            {
                if((i+j)== 5)
                {
                    k++;
                    m[i][j] = token[k];
                }
            }
            System.out.println(k);
        }
    }
}
