package com.mycompany.exe03;

import java.util.Scanner;

public class Exe03 {

    static Scanner sc = new Scanner(System.in);

    // ===== LEITURA SEGURA DE INTEIRO =====
    static int lerInt(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = sc.nextLine();
            try {
                return Integer.parseInt(entrada.trim());
            } catch (NumberFormatException e) {
                System.out.println("!! Entrada invalida. Digite apenas numeros inteiros.");
            }
        }
    }

    // ===== LEITURA SEGURA DE DOUBLE =====
    static double lerDouble(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = sc.nextLine();
            try {
                return Double.parseDouble(entrada.trim().replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.println("!! Entrada invalida. Digite apenas numeros. Ex: 150 ou 150.50");
            }
        }
    }

    // ===== LEITURA SEGURA DE TEXTO NAO VAZIO =====
    static String lerTexto(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = sc.nextLine().trim();
            if (!entrada.isEmpty()) {
                return entrada;
            }
            System.out.println("!! Campo obrigatorio. Digite um valor.");
        }
    }

    public static void main(String[] args) {
        Banco conta = new Banco();
        int opcao;

        // ===== ABERTURA DE CONTA =====
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║     BEM-VINDO AO CONTABANCO  ║");
        System.out.println("╚══════════════════════════════╝");

        conta.setDono(lerTexto("Nome do titular: "));
        conta.setNumConta(lerInt("Numero da conta: "));

        String tipo;
        while (true) {
            tipo = lerTexto("Tipo [CC] Corrente | [CP] Poupanca: ").toUpperCase();
            if (tipo.equals("CC") || tipo.equals("CP")) break;
            System.out.println("!! Tipo invalido. Digite CC ou CP.");
        }
        conta.abrirConta(tipo);

        System.out.println("\nConta aberta! " + conta.toString());

        // ===== MENU =====
        do {
            System.out.println("\n╔══════════════════════════════╗");
            System.out.println("║          MENU PRINCIPAL      ║");
            System.out.println("╠══════════════════════════════╣");
            System.out.printf ("║  Titular : %-18s║%n", conta.getDono());
            System.out.printf ("║  Conta   : %-18d║%n", conta.getNumConta());
            System.out.printf ("║  Tipo    : %-18s║%n", conta.getTipo());
            System.out.printf ("║  Saldo   : R$ %-15.2f║%n", conta.getSaldo());
            System.out.printf ("║  Status  : %-18s║%n", conta.getStatus() ? "Ativa" : "Encerrada");
            System.out.println("╠══════════════════════════════╣");
            System.out.println("║  1. Depositar                ║");
            System.out.println("║  2. Sacar                    ║");
            System.out.println("║  3. Pagar mensalidade        ║");
            System.out.println("║  4. Ver historico            ║");
            System.out.println("║  5. Encerrar conta           ║");
            System.out.println("║  0. Sair                     ║");
            System.out.println("╚══════════════════════════════╝");

            opcao = lerInt("Opcao: ");

            switch (opcao) {
                case 1:
                    double deposito = lerDouble("Valor para depositar: R$ ");
                    conta.depositar(deposito);
                    break;
                case 2:
                    int saque = lerInt("Valor para sacar: R$ ");
                    conta.sacar(saque);
                    break;
                case 3:
                    conta.pagarMensalidade();
                    break;
                case 4:
                    conta.historico();
                    break;
                case 5:
                    conta.fecharConta();
                    break;
                case 0:
                    System.out.println("Ate logo, " + conta.getDono() + "!");
                    break;
                default:
                    System.out.println("!! Opcao invalida. Escolha entre 0 e 5.");
            }

        } while (opcao != 0);

        sc.close();
    }
}