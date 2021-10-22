public class Main {
  private static Calculator calculator = new Calculator();

  public static void main(String[] args){
    String command = args[0];
    try {
      System.out.println(calc(command, args));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static String calc(String command, String[] args){
    int[] intArgs = convertArgsToInts(args);
    switch (command){
      case "add":
        return Integer.toString(calculator.add(intArgs[1], intArgs[2]));
      case "subtract":
        return Integer.toString(calculator.subtract(intArgs[1], intArgs[2]));
      case "multiply":
        return Integer.toString(calculator.multiply(intArgs[1], intArgs[2]));
      case "divide":
        return Integer.toString(calculator.divide(intArgs[1], intArgs[2]));
      case "fib":
        return Integer.toString(calculator.fibonacciNumberFinder(intArgs[1]));
      case "binary":
        return calculator.intToBinaryNumber(intArgs[1]);
      default:
        throw new RuntimeException("Invalid command");
    }
  }

  public static int[] convertArgsToInts(String[] args){
    int[] numArgs = new int[args.length];
    for (int i = 1; i < args.length; ++i){
      numArgs[i] = Integer.parseInt(args[i]);
    }
    return numArgs;
  }
}
