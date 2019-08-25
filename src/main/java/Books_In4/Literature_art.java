package Books_In4;

public class Literature_art extends Books {
    public void input () {
        super.input();
        major = "Literature_art";
    }

    public void output () {
        super.output();
        System.out.printf("%s\n" , major);
    }
}
