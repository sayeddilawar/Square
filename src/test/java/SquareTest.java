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
}
