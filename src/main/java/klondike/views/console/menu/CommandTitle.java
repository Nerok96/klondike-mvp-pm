package klondike.views.console.menu;

public enum CommandTitle {

    /**
     * TODO
     * Mensajes de comando muy similares entre si.
     *
     * Soluciones propuestas:
     * 1) Aplicar el patron builder para tener almancenado en el valor enumerado solo el nombre que cambia del mensaje.
     * 2) Siendo que todas las instrucciones son de mover, cambiar el nombre de la clase a MoveCommandMsg
     */

    STOCK2WASTE_COMMAND("Move from stock to waste"),
    WASTE2STOCK_COMMAND("Move from waste to stock"),
    WASTE2FOUNDATION_COMMAND("Move from waste to foundation"),
    WASTE2PILE_COMMAND("Move from waste to pile"),
    FOUNDATION2PILE_COMMAND("Move from foundation to pile"),
    PILE2FOUNDATION_COMMAND("Move from pile to foundation"),
    PILE2PILE_COMMAND("Move from pile to pile");

    private String title;

    CommandTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

}
