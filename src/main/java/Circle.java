public class Circle extends Figure {
    private double radius;

    Circle(String figureType, String colour, double radius) {
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
                + ", площадь: " + df.format(getSquare())
                + " кв. ед., радиус: " + df.format(radius)
                + " ед., цвет: " + getColor();
    }
}
