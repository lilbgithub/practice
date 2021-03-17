
public class Example {



    public static void main (String[] args) {
        Example s = new Example();
        s.printVal(null);

    }
    public static void printVal(Object i){
        System.out.println("obj called "+i);
    }

    public static void printVal(Integer i){
        System.out.println("Int called "+i);
    }
}
