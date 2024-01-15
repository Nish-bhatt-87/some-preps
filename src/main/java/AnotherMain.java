public class AnotherMain {

    public static void main(String[] args) {
        String s = "abcde";
        String reversedS = reverseString(s);
        System.out.println(reversedS);
    }


    private static String reverseString(String s) {
        if (s.length() == 1) {
            return s;
        } else {
            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }

    /*
          abcde

          edcb + a
            edc + b
             ed + c
              e + d

     */
}
