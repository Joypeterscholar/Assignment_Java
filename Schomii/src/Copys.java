public class Copys {
    int num;
    int book;
    public int noOfCopys(int num) {

     int book = num;
        if (num < 1){
            return 0;
        }
        else if (num > 0 && num < 5) {
            return 2000;
        } else if (num > 4 && num < 10) {
            return 1800;
        } else if (num > 9 && num < 30) {
            return 1600;
        } else if (num > 29 && num < 50) {
            return 1500;
        } else if (num > 49 && num < 100) {
            return 1300;
        } else if (num > 99 && num < 200) {
            return 1200;
        } else if (num > 199 && num < 500) {
            return 1100;
        }
        else if (num > 500){
            return 1000;
        }
        else {
        return 404;
        }
    }
    }

