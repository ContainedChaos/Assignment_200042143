package Assignment1;

public class Factory
{
    public Year getNewYear ()
    {
        return new Year();
    }

    public Month getNewMonth()
    {
        return new Month();
    }

    public Day getNewDay()
    {
        return new Day();
    }
}
