/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exe00;

/**
 *
 * @author Fernando Felipe
 */
public class LivroDeLivraria {
    private String titulo;
    private String autor;
    private int ano;
    private double preco;
    private int paginas;
    private String genero;
    private String idioma;
    private int quantidade;
    /*GETTERS*/
    public String getTitulo(){  
        return titulo;
    }
    public String getAutor(){   
        return autor;
    }
    public int getAno(){    
        return ano;
    }
    public double getPreco(){  
        return preco;
    }
    public int getPaginas(){    
        return paginas;
    }
    public String getGenero(){    
        return genero;
    }
    public String getIdioma(){
        return idioma;
    }
    
    public int getQuantidade(){ 
        return quantidade;
    }
    /*SETTERS*/
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setAutor(String autor){ 
        this.autor=autor;
    }
    public void setAno(int ano){
        this.ano=ano;
    }
    public void setPreco(double preco){
        this.preco=preco;
    }
    public void setPaginas(int paginas){
        this.paginas=paginas;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public void setIdioma(String idioma){
        this.idioma=idioma;
    }
    public void setQuantidade(int quantidade){
        this.quantidade=quantidade;
    }
    
    
    
    public void mostrarInformacoes(){   
        System.out.println("=== Informacoes do Livro ===");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Preco: R$" + preco + " Reais");
        System.out.println("Paginas: " + paginas);
        System.out.println("Genero: " + genero);
        System.out.println("Idioma: " + idioma);
        System.out.println("Quantidade: " + quantidade+"\n");
    }    
}