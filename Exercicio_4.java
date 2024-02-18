/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_4;

import java.util.Scanner;
        
public class Exercicio_4 
{
    public static void main(String[] args) 
    {
        int x,digitos = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro maior ou igual a zero");
        
        x = entrada.nextInt();
        
        if(x>=0)
        {
        digitos=digitos+1;
            if(x>=10)
            {
            digitos=digitos+1;   
            if(x>=100)
            {
                digitos=digitos+1;
                if(x>=1000)
                {
                    digitos=digitos+1;
                    if(x>=10000)
                    {
                        digitos=digitos+1;
                        if(x>=100000)
                        {
                            digitos=digitos+1;
                            if(x>=1000000)
                                digitos=digitos+1;
                                if(x>10000000)
                                {
                                    digitos=digitos+1;
                                            if(x>=100000000)
                                            {
                                             digitos=digitos+1;   
                                            }
                                                
                                            
                                }
                                        
                        }
                    }
                }
            }
            }    
        }
            
        else
        {
            System.out.println("O valor inserido não cumpri com os requisitos citados");
        }
        System.out.println("A quantidade de digitos do número "+x+" é "+digitos);
    }
}
