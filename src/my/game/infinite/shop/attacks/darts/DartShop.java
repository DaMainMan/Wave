package my.game.infinite.shop.attacks.darts;

import my.game.game_state.GameState;
import my.game.infinite.level.object.InfinitePlayer;
import my.game.infinite.shop.Shop;
import my.game.menu.LabelColor;
import my.game.menu.SlidingOption;

public class DartShop extends Shop
{
    private Shop shop;
    public DartShop(GameState state, Shop shop, InfinitePlayer player)
    {
        super(state);
        this.shop = shop;
        //poison dart
        //fire dart
        //stun dart
        //confusion dart
        options.add(new SlidingOption(400, 50, "Back", LabelColor.GREEN, 0));
        setRelativeCoordinates(-1000, 0);
    }

    protected void select()
    {
        if(!super.optionMoving())
        {
            setRelativeCoordinates(-1000, 0);
            if (highlightedOption == 0)
                shop.setMenu(0);
            else
                setMenu(highlightedOption + 1);
        }
    }
}
