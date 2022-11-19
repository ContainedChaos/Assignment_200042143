package Assignment2.ControlCoupling;

public class BonusCalculator
{
    public double BonusCalculator(String type) //type parameter passed from Employee class controls the flow of this class
    {
        if (type == "PermanentEmployee")
            return 2000;
        else if (type == "ContractualWorker")
            return 1000;
        else
            return 500;
    }
}
