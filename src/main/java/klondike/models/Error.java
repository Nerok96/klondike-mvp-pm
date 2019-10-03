package klondike.models;

public enum Error {

    /**
     * TODO
     * Mensajes de error muy similares entre si.
     *
     * Soluciones propuestas:
     * 1) Aplicar el patron builder para tener almancenado en el valor enumerado solo el nombre que cambia del mensaje.
     * 2) Diferencias entre distintos de error, ya sean de tipo EMPY, NO_EMPTY, etc.
     */
    EMPTY_STOCK("No cards in stock to move."),
    EMPTY_WASTE("No cards in waste to move."),
    EMPTY_FOUNDATION("No cards in foundation to move."),
    EMPTY_PILE("No cards in pile to move."),
    NO_EMPTY_STOCK("Stock is not empty."),
    NO_FIT_FOUNDATION("Foundations should be built up by suit from Ace to King."),
    NO_FIT_PILE("Piles should be built down by alternate colors."),
    SAME_PILE("Same origin and destination pile index."),
    NO_ENOUGH_CARDS_PILE("There is no enough cards in the pile to move.");

    private String message;

    Error(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

}
