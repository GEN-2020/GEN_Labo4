package ch.heigvd.gen2019;

public enum Color {
    BLUE("blue"),
    RED("red"),
    YELLOW("yellow"),
    NOCOLOR("no color");

    private String text;

    Color(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
