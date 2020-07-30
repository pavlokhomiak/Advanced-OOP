public class Circle extends Figure {
    private double radius;

    public Circle(String figureType, String colour, double radius) {
        super(figureType, colour);
        this.radius = radius;
    }

    public double getSquare() {
        calculateSquare();
        return super.getSquare();
    }

    public void calculateSquare() {
        super.setSquare(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return "Фігура: " + this.getClass().getSimpleName()
                + ", площадь: " + FORMATTER.format(getSquare())
                + " кв. ед., радиус: " + FORMATTER.format(radius)
                + " ед., цвет: " + getColor();
    }
}
