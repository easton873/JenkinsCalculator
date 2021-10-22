import java.util.*;

class Calculator {

  help me colon

  int[] fibMem = new int[1000];

  Calculator(){
    Arrays.fill(fibMem, -1);
    fibMem[0] = 0;
    fibMem[1] = 1;
  }

  int add(int a , int b){
    return a + b;
  }

  int subtract(int a , int b){
    return a - b;
  }

  int multiply(int a , int b){
    return a * b;
  }

  int divide(int a , int b){
    return a / b;
  }


  /*
  Returns the n'th number in the fibonacci sequence
  https://en.wikipedia.org/wiki/Fibonacci_number
  Example below
  n = x
  0 = 0
  1 = 1
  2 = 1
  3 = 2
  4 = 3
  5 = 5
  .
  .
  .
  etc
   */
  int fibonacciNumberFinder(int n){
    if (n == 0)
      return fibMem[0];
    if (n == 1)
      return fibMem[1];
    if (fibMem[n - 2] == -1){
      fibMem[n - 2] = fibonacciNumberFinder(n - 2);
    }
    if (fibMem[n - 1] == -1){
      fibMem[n - 1] = fibonacciNumberFinder(n - 1);
    }
    return fibMem[n - 1] + fibMem[n - 2];
  }


  /*
  Returns binary value of the given int number
  The binary number will be stored as a string
  if int a = 0 then this method returns: 0
  if int a = 10 then this method returns: 1010
  if int a = 16 then this method returns: 10000
   */
  String intToBinaryNumber(int n){
    return Integer.toBinaryString(n);
//    StringBuilder binary = new StringBuilder();
//    while (n > 0){
//      binary.append(n % 2);
//      n /= 2;
//    }
//    return binary.reverse().toString();
  }

  /*
  Create a completely unique String identifier for a given string
  Each createdID must contain the string n in its unaltered Form
  if String n = "Jason"
  then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique

  if you run this function twice with the same String input, it must return 2 unique String IDs
   */
  String createUniqueID(String n){
    Random rand = new Random();
    List<Character> alphabet = new ArrayList<>();
    for (char letter = 'a'; letter <= 'z'; ++letter){
      alphabet.add(letter);
    }
    StringBuilder newStr = new StringBuilder(n);
    for (int i = 0; i < 32; ++i){
      newStr.append(alphabet.get(Math.abs(rand.nextInt()) % alphabet.size()));
    }
    return newStr.toString();
  }


}
