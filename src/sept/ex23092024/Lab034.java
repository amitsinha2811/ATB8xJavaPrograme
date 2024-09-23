package sept.ex23092024;

public class Lab034 {
    public static void main(String[] args) {
        int itemcode = 003;
        switch (itemcode){
            case 001 -> System.out.println("This is Laptop");
            case 002 -> System.out.println("This is Desktop");
            case 003 -> System.out.println("This is Android Mobile");
            case 004 -> System.out.println("This is linux system");
            case 005 -> System.out.println("This is Mac system");
            case 006 -> System.out.println("None, Please try again");
        }
    }
}
