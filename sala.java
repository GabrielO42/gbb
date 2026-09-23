/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.df.atividade3;

/**
 *
 * @author gabriel62947886
 */
public class sala {
     public static void main(String[] args) {
        Aluno aluno = new Aluno("Gabriel", "986545588", "Distrito Federal", 8.5);
        Professor professor = new Professor("Pedro", "965853214", "Distrito Federal", 3500.00, "2G");

        System.out.println("ALUNO");
        aluno.Apresentar();
        aluno.mostrarDados();

        System.out.println();

        System.out.println("PROFESSOR");
        professor.Apresentar();
        professor.mostrarDados();
    }  
}
