package com.vishwa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ComMedia implements Comparable {

	
	private int x;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	 ComMedia(int i){
		 this.x=i;
		
	}
	 public String toString()
	 {
		 return String.valueOf(x);
	 }
	 
public static void main(String[] args) {
		
	ComMedia c=new ComMedia(1);
	ComMedia c1=new ComMedia(1);
	System.out.println(c.equals(c1));
	System.out.println(c1.getX());
	List<ComMedia> l=new ArrayList<ComMedia>();
	l.add(new ComMedia(12));
	l.add(new ComMedia(2));
	l.add(new ComMedia(20));
	Collections.sort(l);
	System.out.println(l);;
	Iterator itr1=l.iterator();
	while(itr1.hasNext())
	{
		ComMedia cc=(ComMedia) itr1.next();
		System.out.print(cc.x+" ");
	}
	Set set=new HashSet();
	set.add(11);set.add(2);set.add(3);
	Iterator itr=set.iterator();
	while(itr.hasNext())
	{
		int i=(Integer) itr.next();
		if(set.contains(1))
		System.out.print(i+" ");
	   }
	}
@Override
public int compareTo(Object o) {
	ComMedia cc=(ComMedia) o;
	if(x==cc.x)
		return 0;
	else if(x>cc.x)
		return 1;
	else
	return -1;
}

}
