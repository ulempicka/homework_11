package namesHolder;

import java.util.Arrays;

public class NamesHolder {
    private String[] names;

    public NamesHolder(int length) {
        this.names = new String[length];
    }

    void add(String name, int index) {
        if (name == null) {
            throw new NullPointerException("Imie nie moze byc null!");
        }else if(index >= size()){
            throw new ArrayIndexOutOfBoundsException("W tablicy nie ma tyle miejsca!");     //kontrolowany lub nie
        }
//        else if (names[index].equalsIgnoreCase(name)){
//            throw new IllegalArgumentException("Zduplikowane imie!");
//        }
        else {
            names[index] = name;
        }
    }

    boolean contains(String name) {
        for (String s : names) {

            if (name == null) {
                throw new IllegalArgumentException("Imie nie moze byc null!");
            } else {
                return s.equalsIgnoreCase(name);
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
