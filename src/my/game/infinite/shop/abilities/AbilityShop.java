package my.game.infinite.shop.abilities;

import my.game.constants.Constants;
import my.game.game_state.GameState;
import my.game.infinite.level.object.InfinitePlayer;
import my.game.infinite.shop.Shop;
import my.game.infinite.shop.abilities.cloaking.CloakShop;
import my.game.infinite.shop.abilities.speedBoost.SpeedBoostShop;
import my.game.infinite.shop.abilities.warp.WarpShop;
import my.game.menu.SlidingOption;

public class AbilityShop extends Shop
{
    private Shop shop;
    public AbilityShop(Shop shop, GameState state, InfinitePlayer player)
    {
        super(state);
        this.shop = shop;
        addShop(new SpeedBoostShop(state, this, player), new SlidingOption(10, 20, "Speed Boost", new Constants().nameColor, new Constants().boxColor, 0));
        addShop(new WarpShop(state, this, player), new SlidingOption(40, 20, "Warp", new Constants().nameColor, new Constants().boxColor, 1));
        addShop(new CloakShop(state, this, player), new SlidingOption(70, 20, "Invisibility", new Constants().nameColor, new Constants().boxColor, 2));
        options.add(new SlidingOption(200, 50, "Back", new Constants().nameColor, new Constants().boxColor, 3));
        setRelativeCoordinates(-1000, 0);
    }

    protected void select()
    {
        if(!super.optionMoving())
        {
            setRelativeCoordinates(-1000, 0);
            if (highlightedOption == options.size() - 1)
                shop.setMenu(0);
            else
                setMenu(highlightedOption + 1);
        }
    }
}
