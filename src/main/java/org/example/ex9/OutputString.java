/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex9;

public class OutputString {
    public static String genOutputString(int amountPaint, int area)
    {
        return String.format("You will need to purchase %d gallons of paint to cover %d square feet.", amountPaint, area);
    }
}
