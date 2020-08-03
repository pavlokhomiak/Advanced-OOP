public class Trapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;

    public Trapezoid(String figureType, String colour, double sideA, double sideB, double height) {
        super(figureType, colour);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public double getSquare() {
        calculateSquare();
        return super.getSquare();
    }

    public void calculateSquare() {
        super.setSquare((sideA + sideB) / 2 * height);
    }

    @Override
    public String toString() {
        return "Фігура: " + this.getClass().getSimpleName()
                + ", площадь: " + FORMATTER.format(getSquare())
                + " кв. ед., высота: " + FORMATTER.format(height)
                + " ед., цвет: " + getColor();
    }
}
