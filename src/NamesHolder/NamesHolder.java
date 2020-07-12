package NamesHolder;

import java.util.Arrays;

public class NamesHolder {
    private static final int MAX_SIZE_OF_ARRAY = 3;
    private String[] namesHolder;

    public NamesHolder() {
        this.namesHolder = new String[MAX_SIZE_OF_ARRAY];
    }

    public String[] getNamesHolder() {
        return namesHolder;
    }

    public void setNamesHolder(String[] namesHolder) {
        this.namesHolder = namesHolder;
    }

    public static int getMaxSizeOfArray() {
        return MAX_SIZE_OF_ARRAY;
    }

    public void add(String[] name){
        if (name == null){
            throw new NullPointerException("Proszę wypełnić to pole.");
        }
        this.namesHolder = name;
    }

    public void contains (String[] name){
        if (name != null){
            System.out.println("To pole zostało już wypełnione" + Arrays.toString(name));
        } else throw new IllegalArgumentException ("Pozostawiłeś puste pole wypełnij je proszę.");
    }

    public void size (){
        System.out.println(this.namesHolder.length);
    }

    @Override
    public String toString() {
        return "NamesHolder{" +
                "namesHolder=" + Arrays.toString(namesHolder) +
                '}';
    }
}
