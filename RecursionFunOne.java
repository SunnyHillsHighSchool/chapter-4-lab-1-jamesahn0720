//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
 public static int countOddDigits(int num)
 {

if (num == 0) {
            return 0;
        } else {
            int count = countOddDigits(num/10);
            if ((num % 10) % 2 == 0)
                ++count;
            return count;
        }
 }
}
