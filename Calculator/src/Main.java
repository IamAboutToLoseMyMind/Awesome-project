import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String num1;
        String num2;
        char op;
        String[] numbers;
        int a;
        int b;
        int result;
        String userInput = scanner.next();

        if (userInput.indexOf('+') > 0) {
            numbers = userInput.split("[+]",2);
            num1 = String.valueOf(numbers[0]);
            num2 = String.valueOf(numbers[1]);
            op = '+';
        } else if (userInput.indexOf('-') > 0) {
            numbers = userInput.split("[-]",2);
            num1 = String.valueOf(numbers[0]);
            num2 = String.valueOf(numbers[1]);
            op = '-';
        } else if (userInput.indexOf('/') > 0) {
            numbers = userInput.split("[/]",2);
            num1 = String.valueOf(numbers[0]);
            num2 = String.valueOf(numbers[1]);
            op = '/';
        } else if (userInput.indexOf('*') > 0) {
            numbers = userInput.split("[*]",2);
            num1 = String.valueOf(numbers[0]);
            num2 = String.valueOf(numbers[1]);
            op = '*';
        } else {
            throw new IllegalArgumentException();
        }

        if (num1 != null && num2 != null) {


            try {
               a = romanToNumber(num1);
               b = romanToNumber(num2);

                if (a <= 10 && a >= 1 && b <= 10 && b >= 1) {

                    result = operation(a, b, op);
                    String answer = convertNumToRoman(result);
                    System.out.println(answer);

               } else {
                    throw new IllegalArgumentException();
                }


            } catch (IllegalArgumentException e) {

                a = Integer.parseInt(num1);
                b = Integer.parseInt(num2);
                if (a <= 10 && a >= 1 && b <= 10 && b >= 1) {

                   result = operation(a, b, op);
                   System.out.println(result);

                } else {
                    throw new IllegalArgumentException();
                }

            }

        }else{
            throw new IllegalArgumentException();
        }

    }
        public static String convertNumToRoman ( int numArabian){
            String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                    "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                    "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                    "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                    "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                    "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
            };
            return roman[numArabian];
        }
        public static int romanToNumber (String roman){

            return switch (roman) {
                case "I" -> 1;
                case "II" -> 2;
                case "III" -> 3;
                case "IV" -> 4;
                case "V" -> 5;
                case "VI" -> 6;
                case "VII" -> 7;
                case "VIII" -> 8;
                case "IX" -> 9;
                case "X" -> 10;
                default -> throw new IllegalArgumentException();
           };
        }
        public static int operation ( int a, int b, char op){
            return switch (op) {
                case '*' -> a * b;
                case '+' -> a + b;
                case '-' -> a - b;
                case '/' -> a / b;
                default -> 0;
            };
        }

    }
