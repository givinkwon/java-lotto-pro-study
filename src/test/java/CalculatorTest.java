public static void main(String[] args) {
  final static 숫자_1 = 3;
  final static 숫자_2 = 5;
  Calculator calculator = const Calculator();
  System.out.println(calculator.add(숫자_1, 숫자_2));
  System.out.println(calculator.subtract(숫자_1, 숫자_2));
  System.out.println(calculator.multiply(숫자_1, 숫자_2));
  System.out.println(calculator.divide(숫자_1, 숫자_2));
}
