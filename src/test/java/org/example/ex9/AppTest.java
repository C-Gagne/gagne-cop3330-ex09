package org.example.ex9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void howManyGallonsOfPaint()
    {
        AreaCalculation product = new AreaCalculation();

        int x = 351;
        int y = 1;

        int amountPaint = product.calculateAmountPaint(350.0, (x*y));

        String expectedOutput = "You will need to purchase 2 gallons of paint to cover 351 square feet.";

        String actualOutput = OutputString.genOutputString(amountPaint, (x*y));

        assertEquals(expectedOutput, actualOutput);

    }
}