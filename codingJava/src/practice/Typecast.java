package practice;

import java.util.ArrayList;

public class Typecast {

	public static void main(String[] args) {
		
	}
	 public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
	        int n=A.size();
	        ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
	        
	        for(int i=0;i<n;i++)
	        {
	            for(int j=i;j<n;j++)
	            {
	            	ArrayList<Integer> a=new ArrayList<Integer>();
	                for(int k=i;k<=j;k++)
	                {
	                    a.add(A.get(k));
	                }
	                al.add(a);
	            }
	        }
	        return al;
	    }

}
