package me.OohBen.chap1;

import edu.princeton.cs.algs4.StdDraw;

public class main {
    public static void main(String[] args) {
        StdDraw.setXscale(-5,5);
        StdDraw.setYscale(0,6);
        StdDraw.setPenRadius(0.1);
        for (int i = 2; i < 6; i++) {
            StdDraw.point(0,i);
        }
        for (int i = -3; i < 4; i++) {
            System.out.println(i);
            StdDraw.point(i,1);
        }
    }
}

