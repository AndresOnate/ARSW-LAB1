/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author hcadavid
 */
public class Main {
    
    public static void main(String a[]) {
        /* Hilos: 1
        HostBlackListsValidator hblv=new HostBlackListsValidator();
        List<Integer> blackListOcurrences=hblv.checkHost("202.24.34.55", 1);
        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);
         */
        /* Hilos: Numero de nucleos de procesamiento
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println("Número de núcleos lógicos: " + availableProcessors);
        HostBlackListsValidator hblv=new HostBlackListsValidator();
        List<Integer> blackListOcurrences=hblv.checkHost("202.24.34.55", availableProcessors);
        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);
         */
        /* Hilos: Doble del numero de nucleos de procesamiento
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println("Número de núcleos lógicos: " + availableProcessors);
        HostBlackListsValidator hblv=new HostBlackListsValidator();
        List<Integer> blackListOcurrences=hblv.checkHost("202.24.34.55", availableProcessors * 2);
        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);
        */
        HostBlackListsValidator hblv=new HostBlackListsValidator();
        List<Integer> blackListOcurrences=hblv.checkHost("202.24.34.55", 100);
        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);

    }
    
}
