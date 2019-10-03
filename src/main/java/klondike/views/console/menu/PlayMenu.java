package klondike.views.console.menu;

import klondike.controllers.MoveController;
import klondike.utils.Menu;

public class PlayMenu extends Menu {

    /**
     * TODO
     * Pequeño error de formateo, salto de linea innecesario al final del constructor PLayMenu
     */

    public PlayMenu(MoveController moveController) {
        this.addCommand(new MoveFromStockToWasteCommand(moveController));
        this.addCommand(new MoveFromWasteToStockCommand(moveController));
        this.addCommand(new MoveFromWasteToFoundationCommand(moveController));
        this.addCommand(new MoveFromWasteToPileCommand(moveController));
        this.addCommand(new MoveFromFoundationToPileCommand(moveController));
        this.addCommand(new MoveFromPileToFoundationCommand(moveController));
        this.addCommand(new MoveFromPileToPileCommand(moveController));

    }

}
