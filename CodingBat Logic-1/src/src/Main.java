package src;

public class Main {

    public static void main(String[] args) {
	    //cigarParty
        cigarParty(35, false);

        //caughtSpeeding
        caughtSpeeding(85, false);

        //lastDigit
        lastDigit(10,26,45);

        // greenTicket
        greenTicket(10,5, 10);

        //sumLimit
        sumLimit(120, 16);

        //teenSum
        teenSum(10, 22);

    }


    //cigarParty
    /*When squirrels get together for a party, they like to have cigars.
    A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
    Unless it is the weekend, in which case there is no upper bound on the number of cigars.
    Return true if the party with the given values is successful, or false otherwise.
     */
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if(isWeekend)
            return (cigars >= 40);
        System.out.println(cigars >= 40 && cigars <= 60);
        return (cigars >= 40 && cigars <= 60);
    }

    // caughtSpeeding
    /* You are driving a little too fast, and a police officer stops you.
      code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
      If speed is 60 or less, the result is 0.
      If speed is between 61 and 80 inclusive, the result is 1.
      If speed is 81 or more, the result is 2.
      Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.*/
     public static int caughtSpeeding(int speed, boolean isBirthday) {
         if(speed <= 60 || (isBirthday == true && speed <= 65)) {
             System.out.println(0);
             return 0;
         } else if((speed >= 61 && speed <= 80) || (isBirthday == true && speed <= 85)) {
             System.out.println(1);
             return 1;
         } else {
             System.out.println(2);
             return 2;
         }
     }

     // lastDigit
     /* Given three ints, a b c, return true if two or more of them have the same rightmost digit.
        The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7*/
     public static boolean lastDigit(int a, int b, int c) {
         int aD = a % 10;
         int bD = b % 10;
         int cD = c % 10;
         if (aD == bD) {
            System.out.println(true);
            return true;
         }
         if (aD == cD) {
            System.out.println(true);
            return true;
         }
            System.out.println(bD == cD);
            return (bD == cD);
     }

     // greenTicket
     /* You have a green lottery ticket, with ints a, b, and c on it.
        If the numbers are all different from each other, the result is 0. If all of the numbers are the same,
        the result is 20. If two of the numbers are the same, the result is 10. */
     public static int greenTicket(int a, int b, int c) {
         if (a == b && b == c) {
             System.out.println(20);
             return 20;
         }
         if (a == c || b == c) {
             System.out.println(10);
             return 10;
         }
         else {
             System.out.println(0);
             return 0;
         }
     }

     //sumLimit
    /* Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a.
       If the sum has more digits than a, just return a without b.
       Note: one way to compute the number of digits of a non-negative int n is to convert it to a
       string with String.valueOf(n) and then check the length of the string.)*/
    public static int sumLimit (int a, int b) {
        int aLength = Integer.parseInt(String.valueOf(a));
        int sum = a + b;
        if (aLength == a) {
            System.out.println(sum);
            return sum;
        }
        if (aLength >= a) {
            System.out.println(a);
            return a;
        }
        return aLength;
    }

    //teenSum
    /*Given 2 ints, a and b, return their sum.
      However, "teen" values in the range 13..19 inclusive, are extra lucky.
      if either value is a teen, just return 19.
      */
    public static int teenSum(int a, int b) {
        if (a >= 13 && a <= 19) {
            System.out.println(19);
            return 19;
        } else {
            System.out.println(a + b);
            return (a + b);
        }
    }
}


