import java.text.DecimalFormat;

public abstract class Figure {
    private String figureType;
    private String color;
    private double square;
    public static final DecimalFormat FORMATTER = new DecimalFormat("####.#");

    public Figure(String figureType, String color) {
        this.figureType = figureType;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public abstract void calculateSquare();
}
