public class Reverse {
    public static void main(String[] args) {
        String name = "scholar";
        String rev = "";
        for (int i = 0; i < name.length(); i++){
            rev = name.charAt(i) + rev;
        }
        System.out.println(rev);
    }
public String name;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        String rev = "";
        for (int i = 0; i < name.length(); i++){
            rev = name.charAt(i) + rev;
        }
        return rev;
    }
}
