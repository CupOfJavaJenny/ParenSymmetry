package src.main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParenSymmetry {

//false-{"(", "((", ")", "", "(()())((())))"};
//true-{"()", "(())", "(((())))", "", "(()())((()))", "( )", "( () ( ) )"}
    //use a for loop that goes through each string's charachter
    //check if open or closed parenthesis by using a counter
public Boolean isBalanced(String s) {
        int open=0;
        int closed=0;
       for (int i=0;i<s.length();i++){

       if (s.charAt(i)=='('){
           open++;

       }
       else if (s.charAt(i)==')'){
           closed++;

       }


       }
       if(open==closed){
           //add print statement
          return true;

       }else{
           //add print statement
           return false;
       }
    }

    private void checkFile(String filename) throws FileNotFoundException {
        // open file named filename
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        //COME BACK TO THIS!!!!^^^^^^^


        // for each line in the file
        // read the line
        // print whether or not the line's parenthesis are balanced
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            isBalanced(data);
            System.out.println("String is balanced");
            // CLOSE the file
        }
    }
        public static void main (String[]args){
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

        private static void printResult (Boolean b0,boolean b){
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
