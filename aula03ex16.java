package aula;
import java.util.Scanner;
/*Desafio da Noite – Caixa Eletrônico Simples
Descrição: Implemente um programa que simula um caixa eletrônico simples. O usuário poderá:
    Depositar dinheiro
    Sacar dinheiro
    Consultar saldo
    Sair do sistema

O programa deve:
    Manter o saldo atual usando uma variável.
    Utilizar um menu com do-while e switch para navegar entre as opções.
          Utilizar if para validar valores.
          Utilizar Scanner para entrada de dados.
                              
Operações:
Depositar: Solicita o valor a ser depositado. Valor deve ser positivo (> 0). Atualiza o saldo.
Sacar: Solicita o valor a ser sacado. Valor deve ser positivo e menor ou igual ao saldo. Atualiza o saldo. Se não houver saldo suficiente, mostrar erro.
Consultar saldo: Exibe o valor atual do saldo, com duas casas decimais.
Sair: Encerra o programa com uma mensagem de despedida                    
Extras opcionais:
Bloquear saques ou depósitos com valores negativos ou inválidos.
Simular "senha" com até 3 tentativas antes de sair (usando while e if).
Mostrar quantas operações foram feitas antes de sair (com uma contagem no do-while).*/
public class aula03ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 0.0;
        int opcao;
        int contadorOperacoes = 0;
        final int senhaCorreta = 1234;
        int tentativas = 0;
        boolean acessoPermitido = false;
        while (tentativas < 3) {
            System.out.print("Digite a senha do caixa eletrônico: ");
            int senha = sc.nextInt();
            if (senha == senhaCorreta) {
                acessoPermitido = true;
                break;
            } else {
                tentativas++;
                System.out.println("Senha incorreta! Tentativa " + tentativas + " de 3.");
            }
        }

        if (!acessoPermitido) {
            System.out.println("Acesso bloqueado! Encerrando sistema.");
            sc.close();
            return;
        }
        do {
            System.out.println("\n=== MENU CAIXA ELETRÔNICO ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double deposito = sc.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.printf("Depósito de R$ %.2f realizado com sucesso!%n", deposito);
                        contadorOperacoes++;
                    } else {
                        System.out.println("Valor inválido! O depósito deve ser maior que zero.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o valor para saque: R$ ");
                    double saque = sc.nextDouble();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.printf("Saque de R$ %.2f realizado com sucesso!%n", saque);
                        contadorOperacoes++;
                    } else if (saque <= 0) {
                        System.out.println("Valor inválido! O saque deve ser maior que zero.");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;

                case 3:
                    System.out.printf("Seu saldo atual é: R$ %.2f%n", saldo);
                    contadorOperacoes++;
                    break;

                case 4:
                    System.out.println("Obrigado por usar o caixa eletrônico!");
                    System.out.println("Total de operações realizadas: " + contadorOperacoes);
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 4);

        sc.close();
    }
}