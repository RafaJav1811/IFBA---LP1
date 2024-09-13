package com.mycompany.consulta_telefone;

import java.util.Scanner;

public class Consulta_telefone 
{

    public static void main(String[] args) 
    {
         Scanner teclado = new Scanner(System.in);       
        
        System.out.println("Informe a quantidade de nomes e seus contatos telefônicos a serem digitados:");
        int quantidade = teclado.nextInt();
        teclado.nextLine();
        
        String pessoas[] = new String[quantidade];
        String contatos[] = new String[quantidade];
        
        for (int i = 0; i < quantidade; i++)
        {
      
        System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
        pessoas[i] = teclado.nextLine();

        System.out.print("Digite o telefone da pessoa " + (i + 1) + ": ");
        contatos[i] = teclado.nextLine();   
        }
        
        System.out.println("\nDigite a pessoa que gostaria de saber o seu contato telefônico:");
        String consulta = teclado.nextLine();
        
        boolean encontrado = false;
        
        
        for(int i = 0; i < quantidade; i++)
        {
            if(pessoas[i].equalsIgnoreCase(consulta))
                {
                    System.out.println("O telefone de " + pessoas[i] + " é: " + contatos[i]);
                    encontrado = true;
                    break;
                }
        }
        
        if(!encontrado)
        {
            System.out.println("Nome não encontrado!");
        }
        
        
    }
}
