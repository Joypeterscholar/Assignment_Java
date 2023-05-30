public class Tax {
    public double earning;
    public String name;
    public double i;

    public static void main(String[] args) {

    }

    public void setEarning(double earning) {
        this.earning = earning;

        }

    public double getEarning() {
        return earning;
    }

    public double calculateTax(double earning) {
        double tax = 0.0;
        if(earning >= 30000){
            tax = earning * 0.15;
        }
        else{
            tax = earning * 0.20;
        }
        return tax;
    }
}
