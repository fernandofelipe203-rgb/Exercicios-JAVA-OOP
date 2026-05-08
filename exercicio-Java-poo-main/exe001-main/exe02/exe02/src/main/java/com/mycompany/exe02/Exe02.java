/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe02;

/**
 *
 * @author fernando felipe
 */
public class Exe02 {

    public static void main(String[] args) {
        
        ContaBanco p1= new ContaBanco();
        p1.abrirConta("CC");
        p1.depositar(900);
        p1.sacar(800);
        
        
        
        
     
        System.out.println(p1);
    }
}
