public enum FigureTypes {

    CIRCLE("Circle"),
    SQUARE("Square"),
    TRAPEZOID("Trapezoid"),
    TRIANGLE("Triangle");

    private String figure;

    FigureTypes(String figure) {
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }
}
