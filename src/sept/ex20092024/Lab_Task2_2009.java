package sept.ex20092024;

public class Lab_Task2_2009 {
    public static void main(String[] args) {
        int side_a=10;
        int side_b=10;
        int side_c=20;
        if (side_a==side_b && side_b==side_c) {
            System.out.println("Equilateral Triangle");;
        } else if (side_a==side_b && side_b!=side_c) {
            System.out.println("Iscocellus Triangle");;
        }else{
            System.out.println("Scalne Triangle");
        }
    }
}
