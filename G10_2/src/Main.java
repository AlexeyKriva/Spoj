import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        String zero = "zero";
        String one = "one";
        String two = "two";
        String three = "three";
        String four = "four";
        String five = "five";
        String six = "six";
        String seven = "seven";
        String eight = "eight";
        String nine = "nine";
        String ten = "ten";
        String eleven = "eleven";
        String twelve = "twelve";
        String thirteen = "thirteen";
        String fourteen = "fourteen";
        String fifteen = "fifteen";
        String sixteen = "sixteen";
        String seventeen = "seventeen";
        String eighteen = "eighteen";
        String nineteen = "nineteen";
        String twenty = "twenty";
        String thirty = "thirty";
        String forty = "forty";
        String fifty = "fifty";
        String sixty = "sixty";
        String seventy = "seventy";
        String eighty = "eighty";
        String ninety = "ninety";
        if (number.length() < 2){
            if (number.equals("0")){
                System.out.println(zero);
            }
            if (number.equals("1")){
                System.out.println(one);
            }
            if (number.equals("2")){
                System.out.println(two);
            }
            if (number.equals("3")){
                System.out.println(three);
            }
            if (number.equals("4")){
                System.out.println(four);
            }
            if (number.equals("5")){
                System.out.println(five);
            }
            if (number.equals("6")){
                System.out.println(six);
            }
            if (number.equals("7")){
                System.out.println(seven);
            }
            if (number.equals("8")){
                System.out.println(eight);
            }
            if (number.equals("9")){
                System.out.println(nine);
            }
        } else if (Integer.parseInt(number) < 20){
            if (number.equals("10")){
                System.out.println(ten);
            }
            if (number.equals("11")){
                System.out.println(eleven);
            }
            if (number.equals("12")){
                System.out.println(twelve);
            }
            if ((number.equals("13"))){
                System.out.println(thirteen);
            }
            if (number.equals("14")){
                System.out.println(fourteen);
            }
            if (number.equals("15")){
                System.out.println(fifteen);
            }
            if ((number.equals("16"))){
                System.out.println(sixteen);
            }
            if (number.equals("17")){
                System.out.println(seventeen);
            }
            if (number.equals("18")){
                System.out.println(eighteen);
            }
            if ((number.equals("19"))){
                System.out.println(nineteen);
            }
        } else {
            if (number.charAt(0) == '2'){
                System.out.print(twenty);
            }
            if (number.charAt(0) == '3'){
                System.out.print(thirty);
            }
            if (number.charAt(0) == '4'){
                System.out.print(forty);
            }
            if (number.charAt(0) == '5'){
                System.out.print(fifty);
            }
            if (number.charAt(0) == '6'){
                System.out.print(sixty);
            }
            if (number.charAt(0) == '7'){
                System.out.print(seventy);
            }
            if (number.charAt(0) == '8'){
                System.out.print(eighty);
            }
            if (number.charAt(0) == '9'){
                System.out.print(ninety);
            }
            int i = 0;
            for(; i < Integer.parseInt(String.valueOf(number.charAt(1))); i++){
                if (i == 0){
                    System.out.print("-");
                }
            }
            if (i != 0){
                if (i == 1){
                    System.out.println(one);
                }
                if (i == 2){
                    System.out.println(two);
                }
                if (i == 3){
                    System.out.println(three);
                }
                if (i == 4){
                    System.out.println(four);
                }
                if (i == 5){
                    System.out.println(five);
                }
                if (i == 6){
                    System.out.println(six);
                }
                if (i == 7){
                    System.out.println(seven);
                }
                if (i == 8){
                    System.out.println(eight);
                }
                if (i == 9){
                    System.out.println(nine);
                }
            } else {
                System.out.println();
            }
        }
    }
}