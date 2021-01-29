package Week02;

public class VacationCalculator {
    public static void main(String[] args) {

        VacationCalculator vc = new VacationCalculator();

        // Calculate some vacation costs...
        float japanCost = vc.calculateVacationCost(Destination.Japan);
        float MexicoCost = vc.calculateVacationCost(Destination.Mexico);
        float EuropeCost = vc.calculateVacationCost(Destination.Europe);

        // Print the cost...
    }

    public float calculateVacationCost(Destination dest)
    {

    }
/*
    float tallyExpenses(List<Expense> expenses)
    {

    }
}*/
}
