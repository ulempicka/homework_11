package namesHolder;

public class TestNamesHolder {
    public static void main(String[] args) {
        String[] names = new String[3];
        NamesHolder namesHolder = new NamesHolder(names);

        try{
            //namesHolder.add(null,0);
            namesHolder.add("Ania",0);
            System.out.println(namesHolder.toString());
            System.out.println("Czy tablica ma Anię? " + namesHolder.contains("Ania"));
            namesHolder.add("Karol",1);
            namesHolder.add("Michał",2);
            System.out.println(namesHolder.toString());
            namesHolder.add("Kasia",3);
        }catch (NullPointerException e){
            System.err.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }
}
