/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex9;

public class App {
    public static void main( String[] args )
    {
        AreaCalculation product = new AreaCalculation();
        Dimensions width = new Dimensions();
        Dimensions length = new Dimensions();

        System.out.println("What is the width of the room?");
        int x = width.setDimension();
        System.out.println("What is the length of the room?");
        int y = length.setDimension();

        double paintCoverage = 350.00000;
        int area = product.calculateArea(x, y);

        int amountPaint = product.calculateAmountPaint(paintCoverage, area);
        String finalOutput = OutputString.genOutputString(amountPaint, area);

        System.out.println(finalOutput);
    }
}
