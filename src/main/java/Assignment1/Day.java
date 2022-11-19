package Assignment1;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Day
{
    Factory f = new Factory();
    Year y = f.getNewYear();
    Month m = f.getNewMonth();

    public int getLastDay(int month, int year)
    {
        if (m.months31Days.contains(month))
            return 31;
        else if (y.isLeapYear(year))
                return 29;
        else if (!y.isLeapYear(year))
                return 28;
        else
            return 30;
    }
}
