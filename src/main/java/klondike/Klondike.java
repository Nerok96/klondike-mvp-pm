package klondike;

import klondike.controllers.MoveController;
import klondike.controllers.ResumeController;
import klondike.controllers.StartController;
import klondike.models.Game;
import klondike.views.View;
import klondike.views.console.ConsoleView;

public class Klondike {

    /**
     * TODO
     * Estos campos privados y finales que había originalmente pueden ser locales.
     *     private final StartController startController;
     *     private final MoveController moveController;
     *     private final ResumeController resumeController;
     */
    private View view;

    private Klondike() {
        Game game = new Game();
        StartController startController = new StartController(game);
        MoveController moveController = new MoveController(game);
        ResumeController resumeController = new ResumeController(game);
        this.view = new ConsoleView(startController, moveController, resumeController);
    }

    public static void main(String[] args) {
        new Klondike().play();
    }

    public void play() {
        view.interact();
    }
}