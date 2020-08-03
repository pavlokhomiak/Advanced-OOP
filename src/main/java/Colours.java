public enum Colours {

    RED("Red"),
    BLACK("Black"),
    YELLOW("Yellow"),
    WHITE("White");

    private String colour;

    Colours(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
