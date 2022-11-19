package Assignment2.StampCoupling;

public class Rectangle
{
    private int height;
    private int width;
    private int depth;

    public void setHeight(int h)
    {
        this.height = h;
    }

    public void setWidth (int w)
    {
        this.width = w;
    }

    public void setDepth (int d)
    {
        this.depth = d;
    }

    public double getArea()
    {
        return height * width;
    }

    public double getVolume()
    {
        return height * width * depth;
    }
}
