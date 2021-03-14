package Recursion;

public interface printSubSequence {

    public static void main(String[] args) {
        SubSequence("abcd", "");

    }

    public static void SubSequence(String Str, String Result) {

        if (Str.length() == 0) {
            System.out.print(Result + " ");
            return;
        }
        char cc = Str.charAt(0); // cc = current character
        String ros = Str.substring(1); // ros = rest of the string
        SubSequence(ros, Result);
        SubSequence(ros, Result + cc);

    }
}
