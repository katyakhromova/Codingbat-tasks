package src;

public class Main {

    public static void main(String[] args) {
        //sleepIn
        sleepIn(false, true);

        //monkeyTrouble
        monkeyTrouble(true,true);

        //diff21
        diff21(25);

        //parrotTrouble
        parrotTrouble(true, 6);

        //missingChar
        missingChar("puppy", 2);

        //startHi
        startHi("hi there!");
    }

    // sleepIn
    // The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    // We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    public static boolean sleepIn(boolean weekday, boolean vacation) {
       System.out.println(!weekday || vacation);
//        if (!weekday || vacation) {
//            return true;
//        } else {
//            return false;
//        }
        if (weekday == false || vacation == true) {
            return true;
        } else {
            return false;
        }
    }

    //monkeyTrouble
    //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
    // We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        System.out.println(aSmile == bSmile);
        return (aSmile == bSmile);
    }

    //diff21
    //Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
    public static int diff21(int n) {
        int temp;

        if (n <= 21) {
            temp = 21 - n;
        } else {
            temp = (n - 21) * 2;
        }
        System.out.println(temp);
        return temp;
    }

    //parrotTrouble
    //We have a loud talking parrot.
    // The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20.
    // Return true if we are in trouble.
    public static boolean parrotTrouble(boolean talking, int hour) {
        System.out.println(talking && (hour < 7) || (hour > 20));
        return (talking && (hour < 7) || (hour > 20));
    }

    //missingChar
    //Given a non-empty string and an int n, return a new string where the char at index n has been removed.
    // The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
    public static String missingChar(String str, int n) {
        int len = str.length();
        String strStart = str.substring(0, n-1);
        String strEnd = str.substring(n, len);
        System.out.println(strStart + strEnd);
        return (strStart + strEnd);
    }

    //startHi
    //Given a string, return true if the string starts with "hi" and false otherwise.
    public static boolean startHi(String str) {
        if (str.substring(0, 2).equals("hi")) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
}

