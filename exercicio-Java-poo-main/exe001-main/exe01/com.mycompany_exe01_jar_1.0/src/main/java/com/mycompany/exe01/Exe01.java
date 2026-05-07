/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe01;

/**
 *
 * @author Administrador
 */
import java.io.PrintStream;
public class Exe01 {

    public static void main(String[] args)throws Exception {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        System.out.println("---LOJA DE CARROS---");
        Carro c1 = new Carro(55000,"Honda","Civic","Preto",2020,"Gasolina",45000);   
        Carro c2 = new Carro(42000,"Chevrolet","Onix","preto",2020,"Alcool",7000);
        
        c1.mostrarInformacoes();
        c2.mostrarInformacoes();
        
        
    }
       
}
