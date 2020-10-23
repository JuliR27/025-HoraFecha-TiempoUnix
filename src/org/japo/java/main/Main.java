/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Date;

/**
 *
 * @author CicloM
 */
public class Main {

    public static void main(String[] args) {
       long tiempo = new Date().getTime();
        System.out.printf("Tiempo Unix: %d%n", tiempo);
    }

}