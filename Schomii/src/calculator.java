public class calculator {
    public int calculate(int firstNumber, int secondNumber, char operator){
        switch (operator){
            case '+' : return firstNumber + secondNumber;
            case '-' : {
                if (firstNumber > secondNumber) {
                    return firstNumber - secondNumber;
                }
                else return secondNumber - firstNumber;
                }
            default: return 0;
            }

        }
    }





