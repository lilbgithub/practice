package practice.easy;

public class MyHashSetDirty {
    private boolean[] array;

    public MyHashSetDirty(){
        array = new boolean[1001];
    }

    public void add(int number){
        array[number] = true;
    }

    public void remove(int number){
        array[number] = false;
    }

    public boolean contains(int number){
        return array[number];
    }

    public static void main(String[] args) {
        MyHashSetDirty hashSet = new MyHashSetDirty();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.remove(2);
        hashSet.contains(2);

    }

}
