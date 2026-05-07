/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exe00;

/**
 *
 * @author Fernando Felipe
 */
public class Lampada { 
    /* ---ATRIBUTOS---- */

    private String marca;
    private double valor;
    private int potencia;
    private int voltagem;
    private String soquete;
    private String cor;
    
    
    /*METODOS GETTERS*/
    public String getMarca(){ 
        return marca;
    }
    public double getValor(){   
        return valor;
    }
    public int getPotencia(){  
        return potencia;  
    }
    public int getVoltagem(){ 
        return voltagem;
    }
    public String getSoquete(){  
        return soquete;
    }
    
    public String getCor(){
        return cor;   
    }
    /*METODOS SETTERS*/
    public void setMarca(String marca){ 
        this.marca=marca;
    }
    public void setValor(double valor){ 
        this.valor = valor;
    }
    public void setPotencia(int potencia){  
        this.potencia=potencia;
    }
    
    public void setVoltagem(int voltagem){
        this.voltagem=voltagem;
    }
    
    public void setSoquete(String soquete){ 
        this.soquete=soquete;
    }
    public void setCor(String cor){  
        this.cor=cor;
    }
    public void mostrarInformacoes(){
        System.out.println("=== Informacoes da Lampada ===");
        System.out.println("Produto: LAMPADA");
        System.out.println("Marca: " + marca);
        System.out.println("valor R$:" + valor +" Reais");
        System.out.println("Potencia: " + potencia + " WATTS");
        System.out.println("Voltagem: " + voltagem + " V");
        System.out.println("Soquete da lampada: " + soquete);
        System.out.println("Estilo da cor: " + cor +"\n");
    }
    
  
   
}
