package nyc.c4q.shawn;

public class Main {

    public static void main(String[] args) {
	// write your code here
//    String myString = new String("ABCDEFGHIJK");
//       String temp;
//        System.out.println(myString.length());
//
//        temp = myString.substring(0, myString.length());
//
//        print(temp);
//

//matchParens("(-(-(-(-(-(-(-(-(-");


//        String gangstaString = "";
//       print(String.valueOf(gangstaString.isEmpty()));
//        System.out.println(isEquals("20.1"));
//        System.out.println(equal2("100."));
//
//
//        System.out.println(myMethod("iiiooop"));

        System.out.println(addNumRepeatedLetters("100115754899aa"));


    }

    /**
     * addNumRepeatedNumbers does NOT work. It is an infinite loop, if any String is passed in.
     * ~~~~ HINT ~~~~~~
     * Use a method that will shrink the size of the String parameter.
     *
     */


    public static int addNumRepeatedLetters(String word) {
        int numberCount = 0;
        while(!word.isEmpty()){
            char tempChar = word.charAt(0);
            numberCount += find2(word, tempChar);
            word = word.replaceAll("" + word.charAt(0), "");
            /*
            USE 1 BUILT IN JAVA METHOD TO SOLVE THIS PROBLEM.
             */

        }
    return numberCount;
    }

    /**
     * find2 Method looks through the entire string and returns the number of letters that time occurred UNLESS it is a unique character, in that case it returns 0.
     *
     */

    private static int find2(String word, char c) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                count++;
            }
        }
        if(count == 1){
            count = 0;
        }
        return count;
    }

    public static char firstRepeatedCharacter(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == word.charAt(i + 1))
                return ch;
        }
        return 0;
    }


    public static int myMethod(String word) {
        int c = 0;

        for (int i = 0; i < word.length() - 1; i++) {
            if (i == 0 && (word.charAt(i) == word.charAt(i + 1))) {
                c++;
            } else if ((word.charAt(i) == word.charAt(i + 1)) && (word.charAt(i - 1) != word.charAt(i))) {
                c++;
            }
        }
        return c;
    }


    public static boolean isEquals(String val1){
       return Math.floor(Double.valueOf(val1))== (Double.valueOf(val1));
    }

    public static boolean equal2(String aString){
        return Double.valueOf(aString)==Math.rint(Double.valueOf(aString));
    }

    public static void testFunction(int a1, int b2){
        boolean bool1 = (a1 > b2);
        System.out.println(bool1);
    }



    public static void print(String a){
        System.out.println(a);
    }

    static int findDecimal(String inputString){
        int decimalIdx = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if(inputString.charAt(i) == '.'){
                decimalIdx = i;                }
        }
        return decimalIdx;
    }

    static boolean isLastCharOperand(char c){
        return (c == '*'|| c == '/'|| c == '+' || c == '-');
    }
    static int findLastOperatorIdx(String inputString){
        int operatorIdx = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if(isLastCharOperand(inputString.charAt(i))){
                operatorIdx = i;
            }
        }
        return operatorIdx;
    }

//    static void matchParens(String inputString){ //// FIXME: 10/13/16 I DON'T WORK
//        int openCount = 0;
//        int closeCount = 0;
//        StringBuilder mySB = new StringBuilder();
//        for(int i = 0; i < inputString.length(); i++) {
//            if (inputString.charAt(i) == '(') {
//                openCount++;
//            } else if (inputString.charAt(i) == ')') {
//                closeCount++;
//            }
//        }
//            if(openCount > closeCount){
//                while(openCount!=closeCount){
//                    mySB.append(")");
//                    closeCount++;
//                }
//                inputString = inputString + mySB.toString();
//            }else if(openCount < closeCount){
//                while(openCount != closeCount){
//                    mySB.append("(");
//                    openCount++;
//                }
//                inputString = mySB.toString() + inputString;
//            }
//
//        System.out.println(inputString);
//    }


}
