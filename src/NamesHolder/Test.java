package NamesHolder;

public class Test {
    public static void main(String[] args) {
        NamesHolder namesHolder = new NamesHolder();
        namesHolder.add(new String[]{"Anna", "Adam", "Albert", "Fred"});


        System.out.println(namesHolder.toString());
    }
}
