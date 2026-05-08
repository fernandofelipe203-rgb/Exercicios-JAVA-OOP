/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exe02;

/**
 *
 * @author Administrador
 */


public class ContaBanco {
    private int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;
   /*metodo comuns*/
    
    public void abrirConta(String tipo){
      this.setTipo(tipo);
      this.setStatus(true);
        if(tipo=="CC"){
            setSaldo(50);
        }else if(tipo=="CP"){
            setSaldo(150);
        }      
    }
    public void fecharConta(){
        if(this.getSaldo()==0){
            this.setStatus(false);
            System.out.println("Sua conta foi encerrado com sucesso!");
        }else if(this.getSaldo()>0){
            System.out.println("Nao e possivel encerrar sua conta. Saldo no valor de:" +getSaldo());
        }
     }
        
    
    public void depositar(double valor){
        if(this.getStatus()==true){
            this.saldo+=valor;
        }else if(valor<0){
            System.out.println("Deposito invalido..");
        }else{
            System.out.println("Deposito invalido. conta nao reconhecida");
        };
        
    
    }
    public void sacar(int saque){
        if(this.getStatus()==true){
           if(this.getSaldo()>=saque){
            this.saldo-=saque;
            System.out.println("Saque realizado com sucesso!!!");           
           }else{
            System.out.println("Saque indisponivel, saldo insuficiente.");
        }
    }    
    
    }
    public void pagarMensalidade(){
    } 
    /*METODO CONSTRUTOR VAZIO*/
    public ContaBanco(){
        
        this.setSaldo(0);
        this.setStatus(true);
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void historico(){
        
    }

    @Override
    public String toString() {
        return "ContaBanco{" + "numConta=" + numConta + ", tipo=" + tipo + ", dono=" + dono + ", saldo=" + saldo + ", status=" + status + '}';
    }

    
     

       
}

