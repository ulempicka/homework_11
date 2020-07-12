package namesHolder;

import java.util.Arrays;

public class NamesHolder {
    private String[] names;
//    int length;

    public NamesHolder(String[] names) {        //jak dodac length w konstruktorze?
        this.names = names;
    }

//    void add(String name){      //– dodaje imię do tablicy lub rzuca NullPointerException przy przekazainu wartości null,
//        for (int i=0; i < names.length; i++) {
//            try{
//                names[i] = name;
//            }catch (NullPointerException e){
//                System.err.println("Imie nie moze byc null!");
//            }
//        }
//    }

    void add(String name, int index) {
        if (name == null) {
            throw new NullPointerException("Imie nie moze byc null!");
        }else if(index >= size()){
            throw new ArrayIndexOutOfBoundsException("W tablicy nie ma tyle miejsca!");
        }
        else {
            names[index] = name;
        }
    }

    boolean contains(String name) {
        for (int i = 0; i < names.length; i++) {
            if (name == null) {
                throw new IllegalArgumentException("Imie nie moze byc null!");
            }
            else {
                return names[i].equals(name);
            }
        }
        return false;
    }

    int size() {
        return names.length;
    }

    @Override
    public String toString() {
        return "NamesHolder{" +
                "names=" + Arrays.toString(names) +
                '}';
    }
}
