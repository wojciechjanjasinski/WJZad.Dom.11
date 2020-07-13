package NamesHolder;

import java.util.Arrays;

public class NamesHolder {
    private static final int MAX_SIZE_OF_ARRAY = 3;
    private String[] namesHolder;
    private int currentNamesCount;

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

    public void add(String name){
        if (name == null){
            throw new NullPointerException("Proszę wypełnić to pole.");
        }
        if (namesHolder.length > MAX_SIZE_OF_ARRAY){
            throw new ArrayIndexOutOfBoundsException(" Nie możesz dodać więcej imion do tej tabeli");
        }
        namesHolder[currentNamesCount] = name;
        currentNamesCount++;
    }

    public boolean contains (String name){
        if (name != null){
            System.out.println("To pole zostało już wypełnione");
        } else throw new IllegalArgumentException ("Pozostawiłeś puste pole wypełnij je proszę.");
        for(int i=0;i<namesHolder.length;i++) {
            if(namesHolder[i].equals(name))
                System.out.println("The value at " + i + " is empty");
        }
        return true;
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
