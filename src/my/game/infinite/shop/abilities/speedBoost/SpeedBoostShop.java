package my.game.infinite.shop.abilities.speedBoost;

import my.game.game_state.GameState;
import my.game.infinite.level.object.InfinitePlayer;
import my.game.infinite.shop.Shop;
import my.game.menu.LabelColor;
import my.game.menu.SlidingOption;

public class SpeedBoostShop extends Shop
{
    private Shop shop;
    public SpeedBoostShop(GameState state, Shop shop, InfinitePlayer player)
    {
        super(state);
        this.shop = shop;
        addShop(new BSBoostDistance(state, this, player), new SlidingOption(10, 20, "Distance", LabelColor.GREEN, 0));
        addShop(new BSSpeedMultiplier(state, this, player), new SlidingOption(40, 20, "Speed Multiplier", LabelColor.GREEN, 1));
        addShop(new BSBoostChargeRate(state, this, player), new SlidingOption(70, 20, "Boost Charge Rate", LabelColor.GREEN, 2));
        options.add(new SlidingOption(200, 50, "Back", LabelColor.GREEN, 3));
        setRelativeCoordinates(-1000, 0);
    }

    protected void select()
    {
        if(!super.optionMoving())
        {
            setRelativeCoordinates(-1000, 0);
            if (highlightedOption == 3)
                shop.setMenu(0);
            else
                setMenu(highlightedOption + 1);
        }
    }
}
