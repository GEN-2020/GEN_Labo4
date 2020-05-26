package ch.heigvd.gen2019;

public class Product {
    private String code;
    private Color color;
    private Size size;
    private double price;
    private String currency;

    public Product(String code, Color color, Size size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    private String propertyString(String propertyName, String propertyValue, boolean inQuotes){
        StringBuffer sb = new StringBuffer();
        sb.append("\"");
        sb.append(propertyName);
        sb.append("\": ");
        if(inQuotes) sb.append("\"");
        sb.append(propertyValue);
        if(inQuotes) sb.append("\"");
        sb.append(", ");
        return sb.toString();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("{");

        sb.append(propertyString("code", getCode(), true));
        sb.append(propertyString("color", color.toString(), true));
        if (size != Size.NO_SIZE) {
            sb.append(propertyString("size", size.toString(), true));
        }
        sb.append(propertyString("price", Double.toString(getPrice()), false));
        sb.append(propertyString("currency", getCurrency(), true));

        sb.delete(sb.length() - 3, sb.length());
        return sb.append("\"}, ").toString();
    }
}