package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Cliente> clientList = new ArrayList<>();
    Cliente cliente = new Cliente();

    public static void main(String[] args) {
        LOOPUM:
        while (true) {
            System.out.println("Digite 1 para adicionar um cliente");
            System.out.println("Digite 2 para excluir um cliente");
            System.out.println("Digite 3 para saber os atributos de um cliente pelo nome");
            System.out.println("Digite 4 para mostrar todos os clientes");
            System.out.println("Digite 5 para editar a idade de um cliente");
            System.out.println("Digite 6 para sair");
            Scanner scanner = new Scanner(System.in);
            int opcaoEscolhida = scanner.nextInt();

            if (opcaoEscolhida == 1) {
                LOOPDOIS:
                while (true) {
                    Scanner scannerNome = new Scanner(System.in);
                    Cliente cliente = new Cliente();
                    System.out.println("Digite o nome do cliente");
                    cliente.nome = scannerNome.nextLine();
                    System.out.println("Digite a idade do cliente");
                    cliente.idade = scannerNome.nextInt();
                    if (cliente.idade > 65){
                        cliente.aposentadoria = 2000;
                    }
                    clientList.add(cliente);
                    System.out.println("Digite 1 para continuar ou 2 para sair");
                    int loopUmSair = scanner.nextInt();
                    if (loopUmSair == 2) {
                        break LOOPDOIS;
                    }
                }
            }
            if (opcaoEscolhida == 2) {
                LOOPTRES:
                while (true) {
                    Scanner scannerExcluir = new Scanner(System.in);
                    System.out.println("Digite o nome do cliente para remover");
                    String clienteExcluir = scannerExcluir.nextLine();
                    for (int i = 0; i < clientList.size(); i++) {
                        if (clienteExcluir.equals(clientList.get(i).nome)) {
                            clientList.remove(i);
                        }
                    }
                    System.out.println("Digite 1 para continuar ou 2 para sair");
                    int loopDoisSair = scanner.nextInt();
                    if (loopDoisSair == 2) {
                        break LOOPTRES;
                    }
                }
            }
            if (opcaoEscolhida == 3) {
                LOOPQUATRO:
                while (true) {
                    Scanner scannerMostrar = new Scanner(System.in);
                    System.out.println("Digite o nome do cliente para exibir seus status");
                    String clienteMostrar = scannerMostrar.nextLine();
                    for (Cliente i : clientList) {
                        if (clienteMostrar.equals(i.nome)) {
                            System.out.println("====================================");
                            System.out.println("nome: " + i.nome);
                            System.out.println("Idade: " + i.idade);
                            System.out.println("Aposentadoria: " + i.aposentadoria);
                            System.out.println("====================================");
                        }
                    }
                    System.out.println("Digite 1 para continuar ou 2 para sair");
                    int loopTresSair = scanner.nextInt();
                    if (loopTresSair == 2) {
                        break LOOPQUATRO;
                    }
                }
            }
            if (opcaoEscolhida == 4) {
                System.out.println("====================================");
                System.out.println("Lista Completa");
                for (Cliente a : clientList) {
                    System.out.println("====================================");
                    System.out.println("Nome: " + a.nome);
                    System.out.println("Idade: " + a.idade);
                    System.out.println("Aposentadoria: " + a.aposentadoria);
                }
                System.out.println("====================================");
            }
            if (opcaoEscolhida == 5) {
                LOOPCINCO:
                while (true) {
                    Scanner scannerEditarIdade = new Scanner(System.in);
                    System.out.println("Digite o nome do cliente para editar sua idade");
                    String scannerEditar = scannerEditarIdade.nextLine();
                    for (int i = 0; i < clientList.size(); i++) {
                        if (scannerEditar.equals(clientList.get(i).nome)) {
                            System.out.println("Digite a nova idade do cliente");
                            int novaIdade = scannerEditarIdade.nextInt();
                            clientList.get(i).idade = novaIdade;
                        }
                    }
                    System.out.println("Digite 1 para continuar ou 2 para sair");
                    int loopQuatroSair = scanner.nextInt();
                    if (loopQuatroSair == 2) {
                        break LOOPCINCO;
                    }
                }
            }
            if (opcaoEscolhida == 6){
                System.out.println("saindo...");
                break LOOPUM;
            }
        }
    }
}