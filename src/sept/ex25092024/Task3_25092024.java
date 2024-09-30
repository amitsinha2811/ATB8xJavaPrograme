package sept.ex25092024;

public class Task3_25092024 {
    public static void main(String[] args) {
        int vcount =0;
        int consCount =0;
        String str ="Accordingly";

        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' ||  str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
                vcount++;

            else
                consCount++;

        }
        System.out.println("Count of vowels in Accordingly is :" +vcount);
        System.out.println("Count of vowels in Accordingly is :" +consCount);
    }
}
