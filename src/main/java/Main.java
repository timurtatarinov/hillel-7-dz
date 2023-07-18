import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MyException {

        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        try {
            if (i % 5 != 0) {
                throw new MyException();
            }
        } catch (MyException e) {
            throw new MyException("\033[3;4;34m"
                    + "(public-class)Main/(psv)main/i % 5 != 0!!!/"
                    + "\033[0m" + "   " + "\033[1;37m" + ">:(   "
                    + "\033[3;4;31m"
                    + "according-->-->caught/threw-new-MyException"
                    + "\033[0m");
        }

    }
}