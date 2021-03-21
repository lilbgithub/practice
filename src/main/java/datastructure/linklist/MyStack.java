package datastructure.linklist;

public class MyStack {
    int[] array;
    int tos;

    public MyStack(int size) {
        array = new int[size];
        tos = -1;
    }

    int size(){
        return tos+1;
    }

    void display(){
        for(int i = tos;  i>= 0; i--){
            System.out.println(array[i]);
        }
    }
    void push(int value){
        if(tos == array.length -1){
            throw new StackOverflowError("Stack capacity over flow");
        }else {
            tos++;
            array[tos] =value;
        }
    }
    int top(){
        if(tos == -1 ){
            System.out.println("Under Flow");
            return -1;
        }else {
            return  array[tos];
        }

    }
    int pop(){
       int value = array[tos];
       tos--;
       return value;
    }
}
