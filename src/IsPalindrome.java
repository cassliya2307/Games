public class IsPalindrome {


    public static boolean isPalindrome(int x) {
        String number = "" + x;
        String reverse = "";
        for(int count = number.length() - 1; count >= 0; count--)
            reverse = reverse + number.charAt(count);
        return number.equals(reverse);
    }



    public static void main(String[] args) {


        String name = "taye";
        System.out.println(name.charAt(3));
        System.out.println(IsPalindrome.isPalindrome(1221));
    }
}
