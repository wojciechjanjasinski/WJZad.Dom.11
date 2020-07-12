package NamesHolder;

public class Test {
    public static void main(String[] args) {
        NamesHolder namesHolder = new NamesHolder();
        namesHolder.add("Anna");
        namesHolder.add("Robert");

        namesHolder.contains("Hanna");


        System.out.println(namesHolder.toString());
    }
}
