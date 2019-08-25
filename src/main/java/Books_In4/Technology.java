package Books_In4;

public class Technology extends Books {
    public void input () {
        super.input();
        major = "Technology";
    }

    public void output () {
        super.output();
        System.out.printf("%s\n" , major);
    }
}
