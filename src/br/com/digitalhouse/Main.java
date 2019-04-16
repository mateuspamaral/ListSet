package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //List
        List<Integer> listaNum = new ArrayList<>();

        listaNum.add(1);
        listaNum.add(5);
        listaNum.add(5);
        listaNum.add(6);
        listaNum.add(7);
        listaNum.add(8);
        listaNum.add(8);
        listaNum.add(8);

        for (Integer numList : listaNum) {
            System.out.print(numList + ",");
        }

        System.out.println();

        //Set
        Set<Integer> listaSet = new HashSet<>();

        listaSet.add(1);
        listaSet.add(5);
        listaSet.add(5);
        listaSet.add(6);
        listaSet.add(7);
        listaSet.add(8);
        listaSet.add(8);
        listaSet.add(8);

        for (Integer numSet : listaSet) {
            System.out.print(numSet + ",");
        }
    }
}
