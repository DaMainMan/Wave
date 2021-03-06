package my.game.menu;

import my.game.engine.Game;
import my.game.game_state.MenuState;

public class MainMenu extends SlideEnterMenu {

    public MainMenu(MenuState menuState) {
        super(menuState);
        options.add(new SlidingOption(10, 50, "Play", LabelColor.GREEN, 0));
        options.add(new SlidingOption(100, 50, "Help", LabelColor.GREEN, 1));
        options.add(new SlidingOption(200, 50, "Quit", LabelColor.GREEN, 2));
        super.setRelativeCoordinates(-1000, 0);
    }

    public void tick() {
        for (int i = 0; i < options.size(); i++) {
            ((SlidingOption) options.get(i)).setHighlighted(i == highlightedOption);
        }
        super.setLabelPositions();
        super.tick();
    }

    protected void select() {
        if (!super.optionMoving()) {
            super.setRelativeCoordinates(-1000, 0);
            switch (highlightedOption) {
                case 0:
                    ((MenuState) state).setMenu(3);
                    Game.window.setTitle("GameMode");
                    break;
                case 1:
                    ((MenuState) state).setMenu(1);
                    Game.window.setTitle("Help");
                    break;
                case 2:
                    System.exit(0);
            }
        }
    }
}
