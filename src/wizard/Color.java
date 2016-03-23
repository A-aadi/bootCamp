package wizard;

public enum Color {
    GREEN("green"),
    RED("red"),
    BLUE("blue"),
    YELLOW("yellow");

    private String color;

    Color(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}

