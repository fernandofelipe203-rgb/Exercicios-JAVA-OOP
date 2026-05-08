/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exe01;

/**
 *
 * @author Administrador
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String corDoOlho;

    public Pessoa(String nome, int idade, String corDoOlho) {
        this.nome = nome;
        this.idade = idade;
        this.corDoOlho = corDoOlho;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCorDoOlho() {
        return corDoOlho;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCorDoOlho(String corDoOlho) {
        this.corDoOlho = corDoOlho;
    }
    public void mostrarInformacoes(){
        System.out.println("nome:" + nome);
        System.out.println("idade:" + idade);
        System.out.println("Cor dos olhos:" + corDoOlho);
    }
    
    
    
}
