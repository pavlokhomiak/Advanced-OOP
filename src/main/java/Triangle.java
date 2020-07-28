public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double hypotenuse;

    Triangle(String figureType, String colour, double sideA, double sideB) {
        super(figureType, colour);
        this.sideA = sideA;
        this.sideB = sideB;
        hypotenuse = Math.sqrt((sideA * sideA) + (sideB * sideB));
    }

    public double getSquare() {
        calculateSquare();
        return super.getSquare();
    }

    public void calculateSquare() {
        super.setSquare((sideA * sideB) / 2);
    }

    @Override
    public String toString() {
        return "Фігура: " + this.getClass().getSimpleName()
                + ", площадь: " + df.format(getSquare())
                + " кв. ед., гипотенуза: " + df.format(hypotenuse)
                + " ед., цвет: " + getColor();
    }
}
