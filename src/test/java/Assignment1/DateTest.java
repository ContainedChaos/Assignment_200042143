package Assignment1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest
{
    @Test
    public void NewYear()
    {
        Date date = new Date("31/12/2022");
        String expected = "1/1/2023";
        assertEquals(expected, date.getNextDate());
    }

    @Test
    public void FebruaryLeapYear()
    {
        Date date = new Date("5/2/2000");
        String expected = "6/2/2000";
        assertEquals(expected, date.getNextDate());
        Date date2 = new Date("29/2/2000");
        String expected2 = "1/3/2000";
        assertEquals(expected2, date2.getNextDate());
    }

    @Test
    public void FebruaryNotLeapYear()
    {
        Date date = new Date("5/2/2001");
        String expected = "6/2/2001";
        assertEquals(expected, date.getNextDate());
        Date date2 = new Date("28/2/2001");
        String expected2 = "1/3/2001";
        assertEquals(expected2, date2.getNextDate());
    }

    @Test
    public void RegularDates()
    {
        Date date = new Date("20/1/2022");
        String expected = "21/1/2022";
        assertEquals(expected, date.getNextDate());
        Date date2 = new Date("30/9/2023");
        String expected2 = "1/10/2023";
        assertEquals(expected2, date2.getNextDate());
        Date date3 = new Date("31/3/2023");
        String expected3 = "1/4/2023";
        assertEquals(expected3, date3.getNextDate());
    }

}