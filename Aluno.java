/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.df.atividade3;

/**
 *
 * @author gabriel62947886
 */
public class Aluno extends Pessoa{
       private double notaMedia;
    
public Aluno(String nome, String telefone, String endereco, double notaMedia) {
        super(nome, telefone, endereco);
        this.notaMedia = notaMedia;
    }

public double getNotaMedia(){
    return notaMedia;
    } 

public void Apresentar(){
System.out.println("Olá sou aluno, me chamo " + getNome());
}

public void mostrarDados(){
super.mostrarDados();
System.out.println("Nota média: " + notaMedia);
    } 
    }

