package Books_In4;

public class Life_science extends Books {
    public void input () {
        super.input();
        major = "Life_science";
    }

    public void output () {
        super.output();
        System.out.printf("%s\n" , major);
    }
}
