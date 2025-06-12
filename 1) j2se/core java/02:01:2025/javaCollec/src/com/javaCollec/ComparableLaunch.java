package com.javaCollec;

import java.util.TreeSet;

class Comp implements Comparable<Comp> {

    private int id;
    private String name;
    private int age;

    public Comp(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // toString method
    @Override
    public String toString() {
        return "ComparableLaunch[id=" + id + ", name=" + name + ", age=" + age + "]";
    }
    
    //default sorting: it held on the basis of only one either id or age
    // compareTo for descending order by age
    @Override
    public int compareTo(Comp let) {
        return let.age - this.age;
    }
}

public class ComparableLaunch {
    public static void main(String[] args) {
        Comp c1 = new Comp(11, "name1", 40);
        Comp c2 = new Comp(12, "name2", 20);
        Comp c3 = new Comp(13, "name3", 19);
        Comp c4 = new Comp(14, "name4", 18);

        TreeSet<Comp> cp = new TreeSet<>();
        cp.add(c2);
        cp.add(c1);
        cp.add(c3);
        cp.add(c4);
        
        //print array
//        System.out.println(cp);
        
        //print array element
        for (Comp cl : cp) {
            System.out.println(cl);
        }
    }
}
