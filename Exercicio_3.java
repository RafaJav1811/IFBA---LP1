/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_3;

import java.util.Scanner;


public class Exercicio_3 
{

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        int Hi,Mi,Si,Hf,Mf,Sf,somaH,somaM,somaS,subH,subM,subS;
        
        System.out.println("Digite uma hora inicial");
        Hi = entrada.nextInt();
        
        System.out.println("Digite um minuto inicial");
        Mi = entrada.nextInt();
        
        System.out.println("Digite um segundo inicial");
        Si = entrada.nextInt();
        
        System.out.println("Digite uma hora final");
        Hf = entrada.nextInt();
        
        System.out.println("Digite um minuto final");
        Mf = entrada.nextInt();
        
        System.out.println("Digite um segundo final");
        Sf = entrada.nextInt();
        
        System.out.println("Horário inicial - "+Hi+" h "+Mi+" m "+Si+" s");
        System.out.println("Horário final - "+Hf+" h "+Mf+" m "+Sf+" s");
        
        somaH = Hi+Hf;
        somaM = Mi+Mf;
        somaS = Si+Sf;
        
        subH = Hf-Hi;
        subM = Mf-Mi;
        subS = Sf-Sf;
       
        
        System.out.println("A soma das horas foi de "+somaH+" h "+somaM+" m "+somaS+" s");
        System.out.println("A subtração das horas foi de "+subH+" h "+subM+" m "+subS+" s");
    }
}
