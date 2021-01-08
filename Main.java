class Main {
  public static void main(String[] args) {
    System.out.println(recursiveFactorial(6));

  }

  public static int recursiveFactorial(int num) {
    if (num == 1 || num == 0) {
      return num;
    }

    return num * recursiveFactorial(num - 1);
  }
}