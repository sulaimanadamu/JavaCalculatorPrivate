package com.ravi.cal.RaviCalculator;

public class Calculator {

    public long first;
    public long second;
    
    public Calculator(long first, long second){
        this.first = first;
        this.second = second;
    }
    
    public long getFirst() {
        return first;
    }

    public long getSecond() {
        return second;
    }
    
    // Addition Function
    public long addFucn(long first, long second){
        return first + second;
    }
    
    // Difference 
    public long subFucn(long first, long second){
        return second - first;
    }
    
    // Product - *
    public long mulFucn(long first, long second){
        return first * second;
    }

    // Percentage Function
    public String percentageFucn(long first, long second) {
        if (first == 0) {
            return "Cannot calculate percentage (division by zero).";
        }
        double res = ((double) second / (double) first) * 100;
        return String.format("The first number is %.2f%% of the second number", res);
    }
    
    public static void main(String[] args) {

        long first = Long.parseLong(args[0]);
        long second = Long.parseLong(args[1]);
        
        Calculator cal = new Calculator(first, second);
        
        String output = String.format(
            "\n*** Your Results ***\n\nFirst: %d\nSecond: %d\n\nSum : %d\nDifference : %d\nProduct : %d\n%s\n\n",
            cal.first, 
            cal.second, 
            cal.addFucn(first, second), 
            cal.subFucn(first, second), 
            cal.mulFucn(first, second),
            cal.percentageFucn(first, second)
        );
		
        System.out.println(output);
        System.out.print("\n");
        System.out.println("task completed");
    }
}
