package Assignment1;

import java.util.Arrays;
import java.util.List;

public class Month
{
    public List<Integer> months31Days = Arrays.asList(1, 3, 5, 7, 8, 10, 12);

    public boolean isLastMonth (int month)
    {
        if (month == 12)
            return true;
        else
            return false;
    }
}
