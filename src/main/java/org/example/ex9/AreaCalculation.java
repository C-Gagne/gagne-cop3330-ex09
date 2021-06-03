/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex9;

public class AreaCalculation {
    public Integer calculateArea(int x, int y)
    {
        return x * y;
    }
    public int calculateAmountPaint(double paintCoverage, int area)
    {
        double exactPaint = area/paintCoverage;
        return ((int) Math.ceil(exactPaint));
    }
}
