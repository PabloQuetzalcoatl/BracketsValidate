package org.stud;

import java.util.Arrays;
import java.util.List;

public class Brackets {
    public static void main(String[] args) {
        List<String> arguments = Arrays.asList(args);
        String inputString = String.join("", args);
        if (!arguments.isEmpty()) {
            boolean r = checkBrackets(inputString, '(', ')');
            if (r){
                System.out.println(inputString+"- brackets OK");
            }else {
                System.out.println(inputString+"- missing bracket");
            }
        } else {
            System.out.println("Input string is empty");
        }
    }

    public static boolean checkBrackets(String inputString, char openBracket, char closeBracket) {
        int openBracketCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch == openBracket) {
                openBracketCount++;
            }else if (ch == closeBracket) {
                openBracketCount--;
            }
        }

        if (openBracketCount==0){
            return true;
        }else {
            return  false;
        }
    }
}