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
        boolean sair = false;
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
                    System.out.print("\nDigite um caractere para inserir: ");
                    no = sc.next().charAt(0);
                    bt.add(no);
                    break;
                case "b":
                    System.out.print("\nDigite um caractere para remover: ");
                    no = sc.next().charAt(0);
                    bt.delete(no);
                    break;
                case "c":
                    System.out.println("\n\nDeseja mostrar em:");
                    System.out.println("a - Em ordem:");
                    System.out.println("b - Pre ordem:");
                    System.out.println("c - Pos ordem:");
                    System.out.print("Escolha sua opcao: ");
                    char ordem = sc.next().charAt(0);
                    if (ordem == 'a') {
                        bt.printTreeInOrder();
                    } else if (ordem == 'b') {
                        bt.printTreePreOrder();
                    } else if (ordem == 'c') {
                        bt.printTreePostOrder();
                    } else {
                        System.out.println("OPCAO INVALIDA");
                    }
                    break;
                case "d":
                    System.out.println("\nOBRIGADO, ATE A PROXIMA");
                    sair = true;
                    break;
                default:
                    System.out.println("\n\nOPCAO INVALIDA");
            }

        } while (sair != true);
    }

}
