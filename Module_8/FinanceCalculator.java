public class FinanceCalculator {

    //Private varible for how many months in a year
    private static int MONTHS_IN_YEAR = 12;


    static double calculateFutureValue(double monthlyPayment, double rate, int years) {
        int totalMonths = years * MONTHS_IN_YEAR; //Calculates the amount of months
        double interestRate = (1 + rate/100); //Calculates the interest rate
        double presentValue = monthlyPayment * totalMonths; //Calculates current value based on total months and the monthly payments
        double futureValue = presentValue * (Math.pow(interestRate, totalMonths)); //Calculates future value based on rate times current value
        return futureValue = Math.round(futureValue*100.0)/100.0; //Gives future value here
    }
}