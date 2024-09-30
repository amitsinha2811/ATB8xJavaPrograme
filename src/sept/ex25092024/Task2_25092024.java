package sept.ex25092024;

public class Task2_25092024 {
    public static void main(String[] args) {
        int n=5;
        int factorial = 1;
        for(int i=n; i>1; i--){
            factorial*= i;

        }
        System.out.println("factorial of the given no is : " + factorial);
    }
}
