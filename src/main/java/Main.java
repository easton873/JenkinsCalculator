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

  public static int calc(String command, String[] args){
    int[] intArgs = convertArgsToInts(args);
    switch (command){
      case "add":
        return calculator.add(intArgs[1], intArgs[2]);
      case "subtract":
        return calculator.subtract(intArgs[1], intArgs[2]);
      case "multiply":
        return calculator.multiply(intArgs[1], intArgs[2]);
      case "divide":
        return calculator.divide(intArgs[1], intArgs[2]);
      case "fib":
        return calculator.fibonacciNumberFinder(intArgs[1]);
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
