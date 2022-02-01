package OOPBasic;

public interface Calc {

    double PI = 3.14;
    int ERROR = -999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
}

class ImplementsCalc implements Calc {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if( num2 == 0 )
            return ERROR;
        else
            return num1 / num2;
    }
}

class CalculatorTest{
    public static void main(String[] args) {
        Calc calc = new ImplementsCalc();
        int num1 = 10;
        int num2 = 2;

        System.out.println("num1 + num2 = " + calc.add(num1, num2));
        System.out.println("num1 - num2 = " + calc.substract(num1, num2));
        System.out.println("num1 * num2 = " + calc.times(num1, num2));
        System.out.println("num1 / num2 = " + calc.divide(num1, num2));
    }
}