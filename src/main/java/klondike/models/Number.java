package klondike.models;

//TODO card number siendo un as jack etc, no son todo numeros

public enum Number {
    AS,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;

    public int getValue() {
        return this.ordinal() + 1;
    }
}
