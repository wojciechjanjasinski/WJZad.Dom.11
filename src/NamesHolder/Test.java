package NamesHolder;

public class Test {
    public static void main(String[] args) {
        NamesHolder namesHolder = new NamesHolder(new String[5]);
        namesHolder.add("Adam");
        namesHolder.add("Albert");
        namesHolder.add("Amanda");

        System.out.println(namesHolder.toString());
    }
}
