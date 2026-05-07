/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe00;

/**
 *
 * @author Fernando Felipe
 */
public class Exe00 {

    public static void main(String[] args) {
        Lampada lamp1 = new Lampada();
        Livro l1 = new Livro();
        LivroDeLivraria l2 = new LivroDeLivraria();
        
        
        
        
        
        System.out.println("=====  SUPERMERCADO  =====");
        System.out.println("-----LAMPADAS-----");
        lamp1.setMarca("philips");
        lamp1.setValor(20);
        lamp1.setPotencia(7);
        lamp1.setVoltagem(12);
        lamp1.setSoquete("E27");
        lamp1.setCor("quente");
        lamp1.mostrarInformacoes();
       
        
        System.out.println("-----BIBLIOTECA DE LIVROS----- ");
        l1.setTitulo("Fundamentos de Programacao em Java ");
        l1.setAutor("Maria Jose, Antonio Jose, Antonio Jose Mendes, Maria Jose Marcelino");
        l1.setAno(2012);
        l1.setPaginas(324);
        l1.setPreco(130);
        l1.setGenero("Tecnologia");
        l1.setIdioma("Portugues");
        l1.setQuantidade(10);
        l1.mostrarInformacoes();
        
        System.out.println("-----LIVROS DE LIVRARIA----- ");
        System.out.println("PRODUTO: LIVRO DE LIVRARIA ");
        l2.setTitulo("Java como programar");
        l2.setAutor("Paul Deitel e Harvey Deitel");
        l2.setAno(2010);
        l2.setPreco(968);
        l2.setPaginas(600);
        l2.setGenero("Tecnologia");
        l2.setIdioma("Portugues");
        l2.setQuantidade(10);
        l2.mostrarInformacoes();
        
        
        
        
        
        
        
        
        
    }
}
