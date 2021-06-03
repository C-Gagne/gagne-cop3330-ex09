package org.example.ex9;

public class OutputString {
    public static String genOutputString(int amountPaint, int area)
    {
        return String.format("You will need to purchase %d gallons of paint to cover %d square feet.", amountPaint, area);
    }
}
