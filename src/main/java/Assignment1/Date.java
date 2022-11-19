package Assignment1;

public class Date
{
    public int day;
    public int month;
    public int year;
    Factory f = new Factory();
    Year y = f.getNewYear();
    Month m = f.getNewMonth();
    Day d = f.getNewDay();

    public Date (String date)
    {
        String splitDate[] = date.split("/");
        this.day = Integer.parseInt(splitDate[0]);
        this.month = Integer.parseInt(splitDate[1]);
        this.year = Integer.parseInt(splitDate[2]);
    }

    public String getNextDate ()
    {
        if (day < d.getLastDay(month, year))
            day++;
        else
        {
            if (m.isLastMonth(month))
            {
                day = 1;
                month = 1;
                year++;
            }
            else
            {
                day = 1;
                month++;
            }
        }
        return day + "/" + month + "/" + year;
    }

}
