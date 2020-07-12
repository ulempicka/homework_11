package namesHolder;

public class TestNamesHolder {
    public static void main(String[] args) {
        //String[] names = new String[3];
        NamesHolder namesHolder = new NamesHolder(3);

        try{
            //namesHolder.add(null,0);
            namesHolder.add("Karol",0);
            System.out.println(namesHolder.toString());
            namesHolder.add("Ania",1);
            System.out.println("Czy tablica ma Anię? " + namesHolder.contains("Ania"));
            namesHolder.add("Michał",2);
            System.out.println(namesHolder.toString());
            namesHolder.add("Kasia",3);
        } catch (NullPointerException e){
            System.err.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }
}
