package klondike.views.console.menu;

import klondike.controllers.MoveController;
import klondike.models.Error;
import klondike.utils.IO;

/**
 * TODO
 * Resulta extraño tener dos clases abstractas llamadas Command que hereda una de la otra pero en distinos paquetes.
 *
 * Soluciones propuestas:
 * 1) Cambiar el nombrado de la hija de Command a CommandMove.
 */

public abstract class Command extends klondike.utils.Command {

    protected MoveController moveController;

    protected Command(String title, MoveController moveController) {
        super(title);
        this.moveController = moveController;
    }

    @Override
    protected void execute() {
        Error error = this.move();
        if (error != null) {
            IO.writeError(Message.INVALID_MOVE, error.getMessage());
        }
    }

    protected abstract Error move();
}
