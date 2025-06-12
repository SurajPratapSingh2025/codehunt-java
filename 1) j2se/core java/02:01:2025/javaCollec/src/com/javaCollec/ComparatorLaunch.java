package com.javaCollec;

import java.util.Comparator;
import java.util.TreeSet;

class Comp1 implements Comparator<Comp> {

	//custom sorting: it held on the basis of only one either id or age
    // compare for ascending order by age
    @Override
	public int compare(Comp current, Comp existing) {
		// TODO Auto-generated method stub
		return current.getAge()-existing.getAge();
	}
}

public class ComparatorLaunch{
    public static void main(String[] args) {
        Comp c1 = new Comp(11, "name1", 40);
        Comp c2 = new Comp(12, "name2", 20);
        Comp c3 = new Comp(13, "name3", 19);
        Comp c4 = new Comp(14, "name4", 18);
        
        //pass Comp1 as a parameter
        TreeSet<Comp> cp = new TreeSet<>(new Comp1());
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
