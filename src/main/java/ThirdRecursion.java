public class ThirdRecursion {

    public static void main(String[] args) {
        String s=  "india";

        int x = countNumberOftimesCharAppearsInString(s,'i');
        System.out.println(x);
    }

    private static int countNumberOftimesCharAppearsInString(String s, char x) {

        if (s.length() == 0) {
            return 0;
        }else if (s.charAt(0) == x) {
            return 1 + countNumberOftimesCharAppearsInString(s.substring(1),x);
        }else{
            return 0 + countNumberOftimesCharAppearsInString(s.substring(1), x);
        }

    }

    /*
      hippopotamus

      0 + [ippopotamus,p]
           0 + [ppopotamus,p]
                1 + [popotamus,p]
                     1 + [opotamus,p]
                          0 + [potamus,p]
                               1 + [otamus,p]
                                    0 + [tamus,p]
                                         0 + [amus,p]
                                              0 + [mus,p]
                                                   0 + [us,p]
                                                        0 + [s,p]
                                                             0 + ["",p]
     */
}
