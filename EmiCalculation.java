package com.topics.coreJava;

import java.util.Scanner;

/** 
 * Represents the EMI calculation.
 * Program gives the monthly EMI as standard output.  
 * @author Mahavirsinh Parmar
 * @version 1.8
 */
public class EmiCalculation {

    /**
     * This method is used to calculate EMI with three float parameters. 
     * @param principal This is the first parameter to emiCalculator method
     * @param rateOfInterest  This is the second parameter to emiCalculator method
     * @param timePeriod  This is the third parameter to emiCalculator method
     * @return float This returns the EMI.
     */
    public float emiCalculator(float principal, float rateOfInterest, float timePeriod) {
        float emi;
        rateOfInterest = rateOfInterest / (12 * 100); // One month interest
        timePeriod = timePeriod * 12; // One month period
        emi = (principal * rateOfInterest * (float) Math.pow(1 + rateOfInterest, timePeriod)) / (float)(Math.pow(1 + rateOfInterest, timePeriod) - 1);
        return (emi);
    }

    // Driver Program
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principle amount");
        float principal = scanner.nextFloat();
        System.out.println("Enter the rate of intrest for annum");
        float rate = scanner.nextFloat();
        System.out.println("Enter number of months");
        float time = scanner.nextFloat();

        EmiCalculation emiCalculation = new EmiCalculation();
        float emi = emiCalculation.emiCalculator(principal, rate, time);
        System.out.println("Monthly EMI is = " + emi);
    }

}