/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

import java.util.Scanner;

/**
 *
 * @author rfrodrigues
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        char no;
        do {

            System.out.println("PROJETO 01 - ARVORE BINARIA\n");
            System.out.println("a) Inserir um no na arvore");
            System.out.println("b) Remover um no na arvore");
            System.out.println("c) Exibir a arvore");
            System.out.println("d) Sair\n");
            System.out.print("Escolha sua opcao: ");

            String opcao = sc.next();
            
            switch (opcao) {
                case "a":
                    System.out.print("Digite um caractere para inserir");
                    no = sc.next().charAt(0);
                    bt.add(no);
                    break;
                case "b":
                    System.out.print("Digite um caractere para remover");
                    no = sc.next().charAt(0);
                    bt.delete(no);
                    break;
                case "c":
                    System.out.println("Deseja mostrar em:");
                    System.out.println("a - Em ordem:");
                    System.out.println("b - Pre ordem:");
                    System.out.println("c - Pos ordem:");
                    char ordem = sc.next().charAt(0);
                    if (ordem == 'a'){
                        bt.printTreeInOrder();
                    } else if (ordem == 'b'){
                        bt.printTreePreOrder();
                    } else {
                        bt.printTreePostOrder();
                    }
                    break;
                case "d":
                    System.out.println("OBRIGADO, ATE A PROXIMA");
                    break;
                default:
                    System.out.println("OCAO INVALIDA");
            }

        } while (sc.equals("d"));
    }

}
