package sept.ex23092024;

public class Lab033 {
    public static void main(String[] args) {
        // this is applicable for JDK > 13
        int itemcode = 000;
        switch (itemcode){
            case 001, 004, 005:
                System.out.println("These are electronics gadgets");
                break;
            case 002,003,006:
                System.out.println("These are Machenical gadgets");
                break;
            default:
                System.out.println("None");
                break;
        }
        System.out.println("Please check with counter for itemcode");
    }
}
