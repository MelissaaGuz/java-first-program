package com.h2;

public class BestRates {
}
package com.h2;

        import java.util.Scanner;
        import java.util.Map;
public class BestLoanRates {
    public static final Map<Integer, Float> bestRates = Map.of
            (1, 5.50f, 2, 3.45f, 3, 2.67f);

    //void means it returns nothing.
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Enter the loan term (in years)");
        int loanTerm_inYears = scanner.nextInt();
        float bestRate = getRates(loanTerm_inYears);
        if(bestRate == 0.0f) {
            System.out.println("No available rates for term: " + loanTerm_inYears + " years");
        }else {
            System.out.println("Best Available Rate: " + getRates(loanTerm_inYears) + "%");
        }
    }
    public static float getRates( int loanTerm_inYears) {
        if (bestRates.containsKey(loanTerm_inYears)) {
            return bestRates.get(loanTerm_inYears);
        }
        return 0.0f;
    }
}