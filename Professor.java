/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.df.atividade3;

/**
 *
 * @author gabriel62947886
 */
public class Professor extends Pessoa {
 private double salario;
    private String nContrato;

    public Professor(String nome, String telefone, String endereco, double salario, String nContrato) {
        super(nome, telefone, endereco);
        this.salario = salario;
        this.nContrato = nContrato;
    }

    public double getSalario() {
        return salario;
    }

    public String getNContrato() {
        return nContrato;
    }

    public void Apresentar() {
        System.out.println("Olá, sou professor(a), me chamo " + getNome());
    }
    
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Salário: " + salario);
        System.out.println("Nº Contrato: " + nContrato);
    }
   }
   

