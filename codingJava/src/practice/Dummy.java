package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Dummy {

	public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(2,3);
	
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}
	}
	
}
