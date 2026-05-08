/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exe01;

/**
 *
 * @author Administrador
 */
/*Atributos*/
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Carro {
    private double valor;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private String combustivel;
    private double quilometragem;   
    
/*METODO CONSTRUTOR*/
    public Carro(double valor,String marca, String modelo, String cor, int ano, String combustivel,double quilometragem){
        this.valor=valor;
        this.marca=marca;
        this.modelo=modelo;       
        this.cor=cor;
        this.ano=ano;
        this.combustivel=combustivel;
        this.quilometragem=quilometragem;
    
    }
    /*METODOS GETTERS*/
    public double getValor()            {return valor;}
    public String getMarca()            {return marca;}
    public String getModelo()           {return modelo;}
    public String getCor()              {return cor;}
    public int getAno()                 {return ano;}
    public String getCombustivel()      {return combustivel;}
    public double getQuilometragem()    {return quilometragem;
    }
 
    /*Metodos Setters*/
    public void setValor(double valor)                      {this.valor=valor;}
    public void setCor(String cor)                          {this.cor=cor;}
    public void setAno(int ano)                             {this.ano=ano;}
    public void setQuilometragem(double quilometragem)      {this.quilometragem=quilometragem;}
    
    /*Mostrando informaçoes*/
    public void mostrarInformacoes(){
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.of("pt", "BR"));
        DecimalFormat formato = new DecimalFormat("#,##0.00", simbolos);
        

        System.out.println("================================");
        System.out.println("    INFORMAÇÕES DO VEÍCULO");
        System.out.println("================================");
        System.out.println("Valor:       R$ " + formato.format(valor));
        System.out.println("Marca:       " + marca);
        System.out.println("Modelo:      " + modelo);
        System.out.println("Cor:         " + cor);
        System.out.println("Ano:         " + ano);
        System.out.println("Combustível: " + combustivel);
        System.out.println("Km:          " + formato.format(quilometragem) + " km");
        System.out.println("================================\n");
}  
}    
