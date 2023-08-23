package Assignment;
 class MethodOverloading {

    
    public int add(int a, int b) {
        return a + b;
    }

    
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading calculator = new MethodOverloading();

        int sum1 = calculator.add(5, 10);
        System.out.println("Sum of two integers: " + sum1);

        int sum2 = calculator.add(2, 4, 6);
        System.out.println("Sum of three integers: " + sum2);

        double sum3 = calculator.add(2.5, 3.7);
        System.out.println("Sum of two doubles: " + sum3);
    }
}
