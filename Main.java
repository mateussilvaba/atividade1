/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.threads.mateus;

/**
 *
 * @author aluno@jacobina.intranet
 */
public class Main {
   public static void main(String[] args) {
       System.out.println("início do programa");
       ThreadsMateus mateus = new ThreadsMateus();
       mateus.start();
       System.out.println("Fim do programa");
   }
}
