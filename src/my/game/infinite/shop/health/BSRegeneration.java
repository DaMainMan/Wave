package my.game.infinite.shop.health;

import my.game.game_state.GameState;
import my.game.infinite.level.object.InfinitePlayer;
import my.game.infinite.shop.BuySellMenu;
import my.game.infinite.shop.Shop;

public class BSRegeneration extends BuySellMenu
{

    public BSRegeneration(GameState state, Shop shop, InfinitePlayer player)
    {
        super(state, "Regeneration", 20, shop, player);
    }

    public boolean canSell()
    {
        return false;
    }

    public boolean canBuy()
    {
        return false;
    }

    protected void buy()
    {

    }

    protected void sell()
    {

    }
}
