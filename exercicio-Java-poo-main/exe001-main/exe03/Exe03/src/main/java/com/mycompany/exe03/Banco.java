/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exe03;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Banco {

    private int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    private List<String> historico = new ArrayList<>();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    // ===== CONSTRUTOR =====
    public Banco() {
        this.setSaldo(0);
        this.setStatus(true);
        registrarHistorico("Objeto ContaBanco criado.", "SISTEMA");
    }

    // ===== REGISTRO INTERNO =====
    private void registrarHistorico(String evento, String categoria) {
        String dataHora = LocalDateTime.now().format(formatter);
        historico.add("[" + dataHora + "][" + categoria + "] " + evento);
    }

    // ===== ABRIR CONTA =====
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo.equals("CC")) {
            setSaldo(50);
            registrarHistorico("Conta Corrente aberta. Saldo inicial: R$ 50,00", "ABERTURA");
        } else if (tipo.equals("CP")) {
            setSaldo(150);
            registrarHistorico("Conta Poupanca aberta. Saldo inicial: R$ 150,00", "ABERTURA");
        }
    }

    // ===== FECHAR CONTA =====
    public void fecharConta() {
        if (this.getSaldo() == 0) {
            this.setStatus(false);
            registrarHistorico("Conta encerrada com sucesso.", "FECHAMENTO");
            System.out.println("Conta encerrada com sucesso!");
        } else {
            registrarHistorico("Encerramento negado. Saldo pendente: R$ " + getSaldo(), "ERRO");
            System.out.println("Nao e possivel encerrar. Saldo: R$ " + getSaldo());
        }
    }

    // ===== DEPOSITAR =====
    public void depositar(double valor) {
        if (valor <= 0) {
            registrarHistorico("Deposito invalido: R$ " + valor, "ERRO");
            System.out.println("Valor invalido para deposito.");
        } else if (!this.getStatus()) {
            registrarHistorico("Deposito negado: conta inativa.", "ERRO");
            System.out.println("Conta inativa.");
        } else {
            this.saldo += valor;
            registrarHistorico("Deposito: +R$ " + String.format("%.2f", valor) +
                    " | Saldo: R$ " + String.format("%.2f", this.saldo), "DEPOSITO");
            System.out.println("Deposito realizado! Saldo: R$ " + String.format("%.2f", this.saldo));
        }
    }

    // ===== SACAR =====
    public void sacar(int saque) {
        if (!this.getStatus()) {
            registrarHistorico("Saque negado: conta inativa.", "ERRO");
            System.out.println("Conta inativa.");
            return;
        }
        if (saque <= 0) {
            registrarHistorico("Saque invalido: R$ " + saque, "ERRO");
            System.out.println("Valor invalido para saque.");
            return;
        }
        if (this.getSaldo() >= saque) {
            this.saldo -= saque;
            registrarHistorico("Saque: -R$ " + saque +
                    " | Saldo: R$ " + String.format("%.2f", this.saldo), "SAQUE");
            System.out.println("Saque realizado! Saldo: R$ " + String.format("%.2f", this.saldo));
        } else {
            registrarHistorico("Saque negado: saldo insuficiente.", "ERRO");
            System.out.println("Saldo insuficiente.");
        }
    }

    // ===== PAGAR MENSALIDADE =====
    public void pagarMensalidade() {
        if (!this.getStatus()) {
            System.out.println("Conta inativa.");
            return;
        }
        if (this.getTipo().equals("CC")) {
            double taxa = 12.00;
            if (this.getSaldo() >= taxa) {
                this.saldo -= taxa;
                registrarHistorico("Mensalidade: -R$ 12,00 | Saldo: R$ " +
                        String.format("%.2f", this.saldo), "MENSALIDADE");
                System.out.println("Mensalidade paga! Saldo: R$ " + String.format("%.2f", this.saldo));
            } else {
                registrarHistorico("Mensalidade nao paga: saldo insuficiente.", "ERRO");
                System.out.println("Saldo insuficiente para mensalidade.");
            }
        } else {
            registrarHistorico("Conta Poupanca: isenta de mensalidade.", "MENSALIDADE");
            System.out.println("Conta Poupanca e isenta de mensalidade.");
        }
    }

    // ===== HISTORICO =====
    public void historico() {
        System.out.println("\n╔══════════════════════════════════════════════════════╗");
        System.out.println("║                HISTORICO DA CONTA                   ║");
        System.out.printf ("║  Titular: %-42s║%n", this.dono);
        System.out.printf ("║  Conta  : %-42d║%n", this.numConta);
        System.out.println("╠══════════════════════════════════════════════════════╣");
        if (historico.isEmpty()) {
            System.out.println("║  Nenhuma movimentacao registrada.                   ║");
        } else {
            for (int i = 0; i < historico.size(); i++) {
                System.out.printf("║  %d. %-49s║%n", (i + 1), historico.get(i));
            }
        }
        System.out.println("╚══════════════════════════════════════════════════════╝");
    }

    // ===== GETTERS E SETTERS =====
    public List<String> getHistorico() { return new ArrayList<>(historico); }

    public int     getNumConta() { return numConta; }
    public String  getTipo()     { return tipo; }
    public String  getDono()     { return dono; }
    public double  getSaldo()    { return saldo; }
    public boolean getStatus()   { return status; }

    public void setNumConta(int numConta)    { this.numConta = numConta; }
    public void setTipo(String tipo)         { this.tipo = tipo; }
    public void setDono(String dono)         { this.dono = dono; }
    public void setSaldo(double saldo)       { this.saldo = saldo; }
    public void setStatus(boolean status)    { this.status = status; }

    // ===== TO STRING =====
    @Override
    public String toString() {
        return "ContaBanco1{numConta=" + numConta + ", tipo=" + tipo +
               ", dono=" + dono + ", saldo=R$ " + String.format("%.2f", saldo) +
               ", status=" + (status ? "Ativa" : "Encerrada") + "}";
    }
}