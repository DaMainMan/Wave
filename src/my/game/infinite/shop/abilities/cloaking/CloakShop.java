package my.game.infinite.shop.abilities.cloaking;

import my.game.game_state.GameState;
import my.game.infinite.level.object.InfinitePlayer;
import my.game.infinite.shop.Shop;
import my.game.menu.LabelColor;
import my.game.menu.SlidingOption;

public class CloakShop extends Shop
{
    private Shop shop;
    public CloakShop(GameState state, Shop shop, InfinitePlayer player)
    {
        super(state);
        this.shop = shop;
        addShop(new BSCloakTime(state, this, player), new SlidingOption(10, 20, "Cloak Time", LabelColor.GREEN, 0));
        addShop(new BSCloakChargeRate(state, this, player), new SlidingOption(40, 20, "Cloak Charge Rate", LabelColor.GREEN, 1));
        options.add(new SlidingOption(200, 50, "Back", LabelColor.GREEN, 3));
        setRelativeCoordinates(-1000, 0);
    }

    protected void select()
    {
        if(!super.optionMoving())
        {
            setRelativeCoordinates(-1000, 0);
            if (highlightedOption == 2)
                shop.setMenu(0);
            else
                setMenu(highlightedOption + 1);
        }
    }
}
