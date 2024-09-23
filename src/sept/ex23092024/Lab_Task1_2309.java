package sept.ex23092024;

public class Lab_Task1_2309 {
    public static void main(String[] args) {
        int num1 =22;
        int num2 = 4;
        char ch = '%';
        switch (ch){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Please Check and Try again");

        }

    }
}
