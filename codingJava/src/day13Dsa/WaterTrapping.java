package day13Dsa;

import java.util.List;

public class WaterTrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int trap(final List<Integer> A) {
		 //find max_left and max_Right and min of those and subtract from a[i]
		 //add list to array
		 int n=A.size();
		 int [] arr=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 arr[i]=A.get(i);
		 }
		 int[] left_max=new int[n];
		 int[] right_max=new int[n];
		 //add all value to both the arrays
		 left_max=arr;
		 right_max=arr;
		 //aage se psum nikalna h
		 //find psum of left_max array
		 for(int i=1;i<n;i++)
		 {
			 left_max[i]+=left_max[i-1];
		 }
		 //piche se psum nikalna h
		//find psum of right_max array
		 for(int i=n-2;i>=0;i--)
		 {
			 right_max[i]+=right_max[i+1];
		 }
		 
		 for(int i=1;i<n-1;i++)//first and last k outside to zero hi hoga so not including
		 {
			 int water_trap=min(lef_max, i)
		 }
		 
	    }
	 
	 public int min(int a,int b)
	 {
		 if(a>b)
		 {
			 return b;			 
		 }
		 else {
			 return a;
		 }
	 }

}
