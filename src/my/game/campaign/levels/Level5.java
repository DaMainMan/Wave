package my.game.campaign.levels;

import my.game.campaign.GameLevel;
import my.game.game_state.GameState;
import my.game.object.Enemies;
import my.game.object.Enemy;

public class Level5 extends GameLevel
{

    public Level5(GameState state)
    {
        super(20, state);
    }

    public void init()
    {
        enemies.addEnemy(new Enemy(new Enemies().greenSpeeder), 0);
    }
}