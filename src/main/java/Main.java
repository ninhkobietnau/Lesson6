import Books_In4.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Books[] book = new Books[10];
        boolean check = true;
        int count = 0;

        while (check) {

            System.out.println("1. Technology book");
            System.out.println("2. Life_science book");
            System.out.println("3. Literature_art book");
            System.out.println("0. Escape & print");

            Scanner inp = new Scanner(System.in);
            int choose;
            System.out.println("Choose your number ?");
            choose = inp.nextInt();

            switch (choose) {

                case 1 :{
                    count++;
                    book[count] = new Technology();
                    System.out.println(count + "-Technology book :");
                    book[count].input();
                    break;
                }

                case 2 :{
                    count++;
                    book[count] = new Life_science();
                    System.out.println(count + "-Life_science book :");
                    book[count].input();
                    break;
                }

                case 3 :{
                    count++;
                    book[count] = new Literature_art();
                    System.out.println(count + "-Literature_art book :");
                    book[count].input();
                    break;
                }

                case 0 :{
                    check = false;
                    break;
                }

                default :{
                    break;
                }
            }
        }
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%s\n", "Name", "ID", "Author", "Company", "PageNumber", "Major");
        for (int i = 1 ; i <= count ; i++) {
            book[i].output();
        }
    }
}
