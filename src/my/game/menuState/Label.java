package my.game.menuState;

import java.awt.*;

public class Label
{
    protected String name;
    protected double y;
    protected double x;
    protected int width;
    protected int height;
    protected int scale;
    protected int stringWidth;
    protected Color nameColor;
    protected Color boxColor;

    public Label(int y, int scale, String name, Color nameColor, Color boxColor)
    {
        this.nameColor = nameColor;
        this.boxColor = boxColor;
        this.y = y;
        this.scale = scale;
        this.name = name;
        FontMetrics metrics = new FontMetrics(new Font("Arial", 0, scale))
        {
            private static final long serialVersionUID = -8572322988205722333L;
        };
        this.stringWidth = (int) metrics.getStringBounds(name, null).getWidth();
        this.width = this.stringWidth + scale / 4;
        this.height = (int) (metrics.getStringBounds(name, null).getHeight() + (double) (scale / 8));
        this.x = 320 - this.width / 2;
    }

    public Label(int x, int y, int scale, String name, Color nameColor, Color boxColor)
    {
        this.nameColor = nameColor;
        this.boxColor = boxColor;
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.name = name;
        FontMetrics metrics = new FontMetrics(new Font("Arial", 0, scale))
        {
            private static final long serialVersionUID = -8572322988205722333L;
        };
        this.width = (int) (metrics.getStringBounds(name, null).getWidth() + (double) (scale / 4));
        this.height = (int) (metrics.getStringBounds(name, null).getHeight() + (double) (scale / 8));
        this.stringWidth = (int) metrics.getStringBounds(name, null).getWidth();
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public void tick()
    {
    }

    public void render(Graphics g)
    {
        g.setFont(new Font("Arial", 0, this.scale));
        g.setColor(this.boxColor);
        g.fillRect((int) x, (int) y, this.width, this.height);
        g.setColor(this.nameColor);
        g.drawString(this.name, (int) x + width / 2 - stringWidth / 2, (int) y + height - height / 4);
    }

    public int getHeight()
    {
        return this.height;
    }

    public String getName()
    {
        return this.name;
    }

    public double getX()
    {
        return this.x;
    }

    public int getWidth()
    {
        return this.width;
    }

    public double getY()
    {
        return y;
    }
}

