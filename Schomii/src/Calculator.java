
public class Calculator {
    public int addition(int firstNumber, int secNumber) {
        return firstNumber += secNumber;
    }

    public int subtraction(int firstNUmber, int secNUmber) {
        if(firstNUmber > secNUmber) return firstNUmber - secNUmber;
        else if (secNUmber > firstNUmber) return secNUmber - firstNUmber;
        else return firstNUmber - secNUmber;
    }

    public int multiply(int firstNumber, int secNumber) {
        return firstNumber * secNumber;
    }

    public int quotient(int firstNUmber, int secNUmber) {
        return firstNUmber/secNUmber;
    }
}
