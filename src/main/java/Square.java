public class Square extends Figure {
    private double side;

    public Square(String figureType, String colour, double side) {
        super(figureType, colour);
        this.side = side;
    }

    public double getSquare() {
        calculateSquare();
        return super.getSquare();
    }

    public void calculateSquare() {
        super.setSquare(side * side);
    }

    @Override
    public String toString() {
        return "Фігура: " + this.getClass().getSimpleName()
                + ", площадь: " + FORMATTER.format(getSquare())
                + " кв. ед., длина стороны: " + FORMATTER.format(side)
                + " ед., цвет: " + getColor();
    }
}
