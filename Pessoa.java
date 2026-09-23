/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.df.atividade3;

/**
 *
 * @author gabriel62947886
 */
public class Pessoa {
private String nome;
    private String telefone;
    private String endereco;

    public Pessoa(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }

    public void Apresentar() {
        System.out.println("Olá, sou uma pessoa.");
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
    }
   }
    

