package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
//Napisz program, który rysuje prostokąt z gwiazdek o wymiarach podanych przez użytkownika.
        Scanner scanner = new Scanner(System.in);
//        System.out.println("podaj width");
//        int width = scanner.nextInt();
//        System.out.println("podaj height");
//        int height = scanner.nextInt();
//        drawRectangle(width, height);

//    Napisz program, który wyświetla piramidę z gwiazdek o wysokości podanej przez użytkownika.

//        System.out.println("podaj szerokosc piramidy");
        int pyramideHeight = scanner.nextInt();
//        drawTree(pyramideHeight);

//        Napisz program, który tworzy tablicę dwuwymiarową (macierz) 3x3, wypełnia ją liczbami od 1 do 9,


        System.out.println(Arrays.deepToString(createMatrix()));
    }

    public static int[][] createMatrix(){
        int[][] macierz = new int[3][3];
        int first = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                macierz[i][j] = first;
                first++;
            }
        }
        return macierz;
    }


    public static void drawTree(int pyramideHeight) {
    for (int i = 1; i <= pyramideHeight; i++) {
        for (int j = 1; j <= pyramideHeight - i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= (2 * i) - 1; k++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }
}


public static void drawRectangle(int width, int height) {
    for (int i = 0; i < height; i++) {
        for (int j = 0; j < width; j++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }
}
}

