public class Randomizer {
    private static final int NUMBER_OF_COLOURS = 4;
    private static final int NUMBER_OF_FIGURES = 4;
    private static final int MAX_NUMBER_OF_FIGURES = 30;
    private static final int MAX_VALUE = 10;

    private String choseFigure() {
        FigureTypes[] figureTypes = FigureTypes.values();
        return figureTypes[(int) (Math.random() * NUMBER_OF_FIGURES)].getFigure();
    }

    private String choseColour() {
        Colours[] colours = Colours.values();
        return colours[(int) (Math.random() * NUMBER_OF_COLOURS)].getColour();
    }

    private double createValue() {
        return Math.random() * MAX_VALUE + 1;
    }

    public Figure[] createFigureArray() {
        Figure[] figures = new Figure[(int) (Math.random() * MAX_NUMBER_OF_FIGURES + 1)];
        for (int i = 0; i < figures.length; i++) {
            switch (choseFigure()) {
                case ("Circle"):
                    figures[i] = new Circle(FigureTypes.CIRCLE.getFigure(), choseColour(), createValue());
                    break;
                case ("Square"):
                    figures[i] = new Square(FigureTypes.SQUARE.getFigure(), choseColour(), createValue());
                    break;
                case ("Trapezoid"):
                    figures[i] = new Trapezoid(FigureTypes.TRAPEZOID.getFigure(), choseColour(), createValue(), createValue(), createValue());
                    break;
                case ("Triangle"):
                    figures[i] = new Triangle(FigureTypes.TRIANGLE.getFigure(), choseColour(), createValue(), createValue());
                    break;
            }
        }
        return figures;
    }
}
