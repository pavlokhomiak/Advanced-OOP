public class MainApp {
    public static void main(String[] args) {
        Randomizer randomizer = new Randomizer();
        Figure[] figures = randomizer.createFigureArray();
        System.out.println("Number of figures " + figures.length);
        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }
    }
}
