package ch.heigvd.gen2019;

public enum Size {

    XS("XS"),
    S("S"),
    M("M"),
    L("L"),
    XL("XL"),
    XXL("XXL"),
    NO_SIZE("Size not applicable");


    private String text;

    Size(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}