package practice;

/**
 * Make class as final
 * Make variables as private
 * Make variable as final
 * No setter method
 * Make deep copy for the object
 */
class Engine{
    int speed;
    Engine(int speed){
        this.speed = speed;
    }
}
public final class ImmutableClass {
    private final int id;
    private final String name;
    private final Engine engine;

    public ImmutableClass(int id, String name, Engine engine){
        this.id =  id;
        this.name = name;
        // Dont do following commented line, always do deep copy.
        //this.engine = engine;
        Engine newEngine =  new Engine(engine.speed);
        this.engine = newEngine;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        Engine engine =  new Engine(50);
        ImmutableClass obj =  new ImmutableClass(1,"java", engine);
        System.out.println(obj.name == "java");

        System.out.println(obj.engine.speed);
        engine.speed = 70;
        System.out.println(obj.engine.speed);


    }
}
