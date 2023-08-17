/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 * @author hcadavid
 */
public class CountThread extends Thread {

    private final int initialValue;
    private final int endValue;

    public CountThread(int initialValue, int endValue) {
        this.initialValue = initialValue;
        this.endValue = endValue;
    }

    public void run() {
        for (int i = initialValue; i <= endValue; i++) {
            System.out.println(i);
        }
    }
}
