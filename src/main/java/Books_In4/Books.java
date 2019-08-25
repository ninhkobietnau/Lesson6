package Books_In4;

import java.util.Scanner;

public class Books {
    protected String ID;
    protected String name;
    protected String author;
    protected String company;
    protected String major;
    protected int number_page;

    public void input () {
        Scanner inp = new Scanner(System.in);

        System.out.println("book's ID :");
        ID = inp.nextLine().trim();

        System.out.println("book's name :");
        name = inp.nextLine().trim();

        System.out.println("book's author :");
        author = inp.nextLine().trim();

        System.out.println("book's company :");
        company = inp.nextLine().trim();

        System.out.println("book's number_page :");
        number_page = inp.nextInt();
    }

    public void output () {
        System.out.printf("%-20s%-20s%-20s%-20s%-20s",name, ID,author,company,number_page);
    }
}
