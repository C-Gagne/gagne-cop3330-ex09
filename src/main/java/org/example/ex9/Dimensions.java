package org.example.ex9;

import java.util.Scanner;

public class Dimensions {
    public Integer setDimension()
    {
        Scanner newDimension = new Scanner(System.in);
        return Integer.parseInt(newDimension.nextLine());
    }
}

