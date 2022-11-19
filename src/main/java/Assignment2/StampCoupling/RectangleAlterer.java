package Assignment2.StampCoupling;

public class RectangleAlterer
{
    public void alterHeight(Rectangle rectangle, int newHeight) //whole Rectangle object passed by reference, its attribute mutated
    {
        rectangle.setHeight(newHeight);
    }

    public void alterWidth(Rectangle rectangle, int newWidth) //whole Rectangle object passed by reference, its attribute mutated
    {
        rectangle.setWidth(newWidth);
    }

    public void alterDepth(Rectangle rectangle, int newDepth) //whole Rectangle object passed by reference, its attribute mutated
    {
        rectangle.setDepth(newDepth);
    }
}
