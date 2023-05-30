public class Weda {
    public static void main(String[] args) {
        Weda weda = new Weda();
        System.out.println(weda.checkWedaState("sunny"));
    }

        public String checkWedaState (String wedaState){
            switch (wedaState) {
                case "sunnyDay": return "take out your sunshades";
                case "windyDay": return "take out your jacket";
                case "rainyDay": return "take out your umbrella";
                case "snowyDay":
                    return "stay at home";
                default:
                    return "check your weather";
            }
        }
    }


