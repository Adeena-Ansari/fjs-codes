import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word");
        String a = sc.nextLine();

        boolean isPalindrome=true;

        a = a.toLowerCase();
        int start=0;
        int end=a.length()-1;
        while(start<end){
            if(a.charAt(start) != a.charAt(end)){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome){
            System.out.println("yes,its a palindrome");
        }else{
            System.out.println("no,its not palindrome");
        }
        sc.close();
    }
}
