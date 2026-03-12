package strings;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str="madam";
        boolean isPali=true;
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                isPali=false;
                break;
            }
            left++;
            right--;
        }
        if(isPali){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
