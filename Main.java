package com.company;

import java.util.Scanner;

public class Main {
    public static final class Veragenie {
        private static Main.Veragenie wuw = null;
        private double x;
        private double y;
        private Veragenie() {
            this.x = x;
            this.y = y;
        }

        public synchronized Main.Veragenie getInstance() {
            if (wuw == null)
                wuw = new Main.Veragenie();
            return wuw;
        }
        public void prim(double x,double y){
            double resault = (2*x+3)/y;
            System.out.println("результат: " + resault);
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите x:");
        double x = in.nextDouble();
        System.out.println("введите y:");
        double y = in.nextDouble();
        Veragenie ver = new Veragenie();
        ver.prim(x,y);
    }

    }

}