public class SquareMain {
    double side;
    public SquareMain(double side)
    {
        this.side = side;
    }
    public double areaOfSquare()
    {
        return side*side;
    }

    public double perimeterOfSquare() {
        return 4*side;
    }
}
