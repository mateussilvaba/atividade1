/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.threads.mateus;

/**
 *
 * @author aluno@jacobina.intranet
 */
public class ThreadsMateus extends Thread {
     public void run () {
        for (int i = 0; i < 10; i++) {
    
        try {
            Thread.sleep(1000);
            System.out.println("Processando" + i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
}