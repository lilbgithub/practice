package practice.ds.priorityQ;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ComparableComparator {
    static class Student implements Comparable<Student>{
        int age;
        int weight;
        String name;

        Student(int age , int weight, String name){
            this.age =  age;
            this.weight = weight;
            this.name = name;
        }

        public int compareTo(Student s){
            return this.age - s.age;
        }
        public String toString(){
            return "age is " + this.age + " weight is "+ this.weight + " name is "+ this.name;
        }

    }
    public static void main(String[] args) {
        //Compare to with comparable
        PriorityQueue<Student> pq =  new PriorityQueue<>();

        pq.add(new Student(11,82,"lil1"));
        pq.add(new Student(15,89,"lil3"));
        pq.add(new Student(12,86,"lil2"));
        pq.add(new Student(18,00,"lil4"));
        pq.add(new Student(10,80,"lil0"));

        while (pq.size() !=0){
            System.out.println(pq.poll());
        }

        //Comparator
        PriorityQueue<Student> pq2 =  new PriorityQueue<>(Comparator.comparing(student -> student.weight));

        pq2.add(new Student(11,82,"lil1"));
        pq2.add(new Student(15,89,"lil3"));
        pq2.add(new Student(12,86,"lil2"));
        pq2.add(new Student(18,00,"lil4"));
        pq2.add(new Student(10,80,"lil0"));

        System.out.println(" ##################### New comparator based on Age #########################");
        while (pq2.size() !=0){
            System.out.println(pq2.poll());
        }

        //Comparator
        PriorityQueue<Student> pq3 =  new PriorityQueue<>(Comparator.comparing(student -> student.name));

        pq3.add(new Student(11,82,"lil1"));
        pq3.add(new Student(15,89,"lil3"));
        pq3.add(new Student(12,86,"lil2"));
        pq3.add(new Student(18,00,"lil4"));
        pq3.add(new Student(10,80,"lil0"));

        System.out.println(" ##################### New comparator based on name #########################");
        while (pq3.size() !=0){
            System.out.println(pq3.poll());
        }
    }
}
