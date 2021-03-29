package practice.designPattern;


class SingletonEager{
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance(){
        return instance;
    }
}
class Singleton{
    private static Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

class SingletonSynchronizedMethod{
    private static SingletonSynchronizedMethod instance;
    private SingletonSynchronizedMethod(){}
    public static synchronized SingletonSynchronizedMethod getInstance(){
        if(instance == null){
            instance = new SingletonSynchronizedMethod();
        }
        return instance;
    }
}

class SingletonSynchronized {
    private static SingletonSynchronized instance;

    private SingletonSynchronized() {
    }

    public static SingletonSynchronized getInstance() {
        if (instance == null) {
            synchronized (SingletonSynchronized.class){
                if(instance == null){
                    instance = new SingletonSynchronized();
                }
            }
        }
        return instance;
    }
}


public class SingletonExample {

    public static void main(String[] args) {

        //Eager
        SingletonEager instance  = SingletonEager.getInstance();
        System.out.println(instance);
        SingletonEager instance2  = SingletonEager.getInstance();
        System.out.println(instance2);

        //Lazy
        Singleton instance3  = Singleton.getInstance();
        System.out.println(instance3);
        Singleton instance4  = Singleton.getInstance();
        System.out.println(instance4);

        //Synchronized method
        SingletonSynchronizedMethod instance7  = SingletonSynchronizedMethod.getInstance();
        System.out.println(instance7);
        SingletonSynchronizedMethod instance8  = SingletonSynchronizedMethod.getInstance();
        System.out.println(instance8);

        //Synchronized blcok
        SingletonSynchronized instance5  = SingletonSynchronized.getInstance();
        System.out.println(instance5);
        SingletonSynchronized instance6  = SingletonSynchronized.getInstance();
        System.out.println(instance6);
    }


}
