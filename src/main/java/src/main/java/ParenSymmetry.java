package src.main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParenSymmetry {

//false-{"(", "((", ")", "", "(()())((())))"};
//true-{"()", "(())", "(((())))", "", "(()())((()))", "( )", "( () ( ) )"}
    //use a for loop that goes through each string's charachter
    //check if open or closed parenthesis by using a counter
    private Boolean isBalanced(String s) {
        int open=0;
        int closed=0;
       for (int i=0;i<s.length();i++){

       if (s.charAt(i)=='('){
           open=open+1;

       }
       if (s.charAt(i)==')'){
           closed=closed+1;

       }


       }
       if(open==closed){
          return true;

       }else{
           return false;
       }
    }

    private void checkFile(String filename) throws FileNotFoundException {
        // open file named filename
        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        // for each line in the file
            // read the line
            // print whether or not the line's parenthesis are balanced

        // CLOSE the file
    }

    public static void main(String[] args) {
        ParenSymmetry ps = new ParenSymmetry();

        Boolean b0 = ps.isBalanced("()");
        printResult(b0, true);

        String[] falseStrings = {"(", "((", ")", "", "(()())((())))"};
        Boolean falses = true;
        for (String strToTest : falseStrings) {
            falses = ps.isBalanced(strToTest);
        }
        printResult(falses, false);

        String[] trueStrings = {"()", "(())", "(((())))", "", "(()())((()))", "(   )", "( () ( ) )"};
        Boolean trues = false;
        for (String strToTest : trueStrings) {
            trues = ps.isBalanced(strToTest);
        }
        printResult(trues, true);

    }

    private static void printResult(Boolean b0, boolean b) {
        if (b0 == null) {
            System.out.println("Null Failure");
            return;
        }
        if (b0 == b) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }
}
