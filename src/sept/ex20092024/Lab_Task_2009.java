package sept.ex20092024;

public class Lab_Task_2009 {
    public static void main(String[] args) {
        char Grade = 'A';
        int score = 82;
        if (score >= 90 && score <= 100) {
            Grade = 'A';
        } else if (score >= 80 && score <= 89) {
            Grade = 'B';
        } else if (score >= 70 && score <= 79) {
            Grade = 'C';
        } else if (score >= 60 && score <= 69) {
            Grade = 'D';
        } else if (score < 0 || score > 100) {

            Grade = 'O';
            System.out.println("You are Ultimate");
        }else{
            Grade = 'F';
        }
        System.out.println("Your Grade is " + Grade);
    }

}
