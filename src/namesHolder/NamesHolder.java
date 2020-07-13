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
        }
        if (index >= size()) {
            throw new ArrayIndexOutOfBoundsException("W tablicy nie ma tyle miejsca!");     //kontrolowany lub nie
        }
 //       for (int i=0; i < size(); i++) {
            if (names[index].contains(name)) {
                throw new IllegalArgumentException("Zduplikowane imie!");
//            }
        }
        names[index] = name;
    }

     boolean contains(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Imie nie moze byc null!");
        }

        for (String s : names) {
            if (s.equalsIgnoreCase(name)) {
                return true;
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
