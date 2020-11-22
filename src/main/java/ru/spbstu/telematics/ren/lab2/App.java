package ru.spbstu.telematics.ren.lab2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		MylinkedHashMap<String, String>t1=new MylinkedHashMap<>() ;
		t1.add("1", "ren");
		t1.add("2","meng");
		t1.add("3", "guang");
		Iterator<MylinkedHashMap.MyNode<String,String>> iter=t1.iterator();
		while(iter.hasNext())
		{
			System.out.printf(iter.next().toString());
		}
		t1.add("1", "ren");
		t1.clear();
		System.out.print('\n');
		iter=t1.iterator();
		System.out.print(t1.size());
		while(iter.hasNext())
		{
			System.out.printf(iter.next().toString());
		}

	}
}
