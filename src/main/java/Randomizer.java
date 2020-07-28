public class Randomizer {
    private static final int NUMBER_OF_COLOURS = 4;
    private static final int NUMBER_OF_FIGURES = 4;
    private static final int MAX_NUMBER_OF_FIGURES = 30;
    private static final int MAX_VALUE = 10;

    public String choseFigure() {
        FigureTypes[] figureTypes = FigureTypes.values();
        return figureTypes[(int) (Math.random()*NUMBER_OF_FIGURES)].figure;
    }

    public String choseColour() {
        Colours[] colours = Colours.values();
        return colours[(int) (Math.random()*NUMBER_OF_COLOURS)].colour;
    }

    public double createValue() {
        return Math.random()*MAX_VALUE + 1;
    }

    public Figure[] createFigureArray() {
        Figure[] figures = new Figure[(int) (Math.random()*MAX_NUMBER_OF_FIGURES + 1)];
        for (int i = 0; i < figures.length; i++) {
            switch (choseFigure()) {
                case ("Circle"):
                    figures[i] = new Circle(FigureTypes.CIRCLE.figure, choseColour(), createValue());
                    break;
                case ("Square"):
                    figures[i] = new Square(FigureTypes.SQUARE.figure, choseColour(), createValue());
                    break;
                case ("Trapezoid"):
                    figures[i] = new Trapezoid(FigureTypes.TRAPEZOID.figure, choseColour(), createValue(), createValue(), createValue());
                    break;
                case ("Triangle"):
                    figures[i] = new Triangle(FigureTypes.TRIANGLE.figure, choseColour(), createValue(), createValue());
                    break;
            }
        }
        return figures;
    }
}
