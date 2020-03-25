package src;

public class Main {

    public static void main(String[] args) {

        //helloName
        String name = "Bob";
        helloName(name);

        //makeOutWord
        //#1
        makeOutWord("<<>>", "Yay");
        /*     //#2
        String out = "<<>>";
        String word = "Yay";
        makeOutWord(out, word);
        */

        //makeAbba
        makeAbba("Hi", "Bye");

        //extraEnd
        extraEnd("Hello");

        //firstHalf
        firstHalf("HelloThere");

        //extraFront
        extraFront("Hello");
    }

    //helloName
    public static void helloName () {
        System.out.println("Greeting ");
    }
    public static String helloName (String name) {
        System.out.println("Hello " + name + '!');
        return ("Hello " + name + '!');
    }

    //makeOutWord
    public static String makeOutWord(String out, String word) {
        System.out.println(out.substring(0, 2) + word + out.substring(2, 4));
        return (out.substring(0, 2) + word + out.substring(2, 4));
    }

    //makeAbba
    public static String makeAbba(String a, String b) {
        System.out.println(a + b + b + a);
        return a + b + b + a;
    }

    //extraEnd
    //Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
    public static String extraEnd(String str) {
        int len = str.length();
        String temp = str.substring((len - 2), len);
        System.out.println(temp + temp + temp);
        return (temp + temp + temp);
    }

    //firstHalf
    // Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
    public static String firstHalf(String str) {
        int len = str.length();
        String temp = str.substring(0, (len / 2));
        System.out.println(temp);
        return temp;
    }

    //extraFront
    //Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
    // The string may be any length. If there are fewer than 2 chars, use whatever is there.
    public static String extraFront(String str) {
        int len = str.length();
        String temp = str.substring(0, 2);
        System.out.println(temp + temp + temp);
        return (temp + temp + temp);
    }
}


