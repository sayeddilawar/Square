import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest
{

    @DisplayName("Area of Square with Positive Sides")
    @Test
    void toImplementAreaOfSquareWithPositiveSides()
    {
        SquareMain object = new SquareMain(5);
        assertEquals(25,object.areaOfSquare());
    }

    @DisplayName("Area of Square with Negative Sides")
    @Test
    void toImplementAreaOfSquareWithNegativeSides()
    {
        SquareMain object = new SquareMain(-5);
        assertEquals(-25,object.areaOfSquare());
    }

    @DisplayName("Area of Square with Positive Decimal side")
    @Test
    void toImplementAreaOfSquareWithPositiveDecimalSides()
    {
        SquareMain object = new SquareMain(5.5);
        assertEquals(30.25,object.areaOfSquare());
    }

    @DisplayName("Area of Square with Positive Decimal side")
    @Test
    void toImplementAreaOfSquareWithNegativeDecimalSides()
    {
        SquareMain object = new SquareMain(-5.5);
        assertEquals(30.25,object.areaOfSquare());
    }

    //Perimeter of Square
    @DisplayName("Perimeter of Square with Positive side")
    @Test
    void toImplementPerimeterOfSquareWithPositiveSides()
    {
        SquareMain object = new SquareMain(10);
        assertEquals(40,object.perimeterOfSquare());
    }

    @DisplayName("Perimeter of Square with Negative side")
    @Test
    void toImplementPerimeterOfSquareWithNegativeSides()
    {
        SquareMain object = new SquareMain(-10);
        assertEquals(-40,object.perimeterOfSquare());
    }

    @DisplayName("Perimeter of Square with Positive Decimal side")
    @Test
    void toImplementPerimeterOfSquareWithPositiveDecimalSides()
    {
        SquareMain object = new SquareMain(2.5);
        assertEquals(10,object.perimeterOfSquare());
    }

    @DisplayName("Perimeter of Square with Negative Decimal side")
    @Test
    void toImplementPerimeterOfSquareWithNegativeDecimalSides()
    {
        SquareMain object = new SquareMain(-2.5);
        assertEquals(-10,object.perimeterOfSquare());
    }
    //End Perimeter Of Square
}
