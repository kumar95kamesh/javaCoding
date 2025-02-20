package day14_2DArray;

import java.util.ArrayList;

public class CountMaxOccurance {
//	Given a binary sorted matrix A of size N x N. Find the row with the maximum number of 1.
//	NOTE:
//	If two rows have the maximum number of 1 then return the row which has a lower index.
//	Rows are numbered from top to bottom and columns are numbered from left to right.
//	Assume 0-based indexing.
//	Assume each row to be sorted by values.
//	Expected time complexity is O(rows + columns).
	
	  public int solve(ArrayList<ArrayList<Integer>> A) {
	        int row=A.size();
	        int col=A.get(0).size();
	        int i=0, j=col-1;
	        int ans=Integer.MAX_VALUE;  
	        while(i<row && j>=0)
	        {
	            int ele=A.get(i).get(j);
	            if(ele==1)
	            {
	                j--;
	                ans=i;
	            }
	            else{
	                i++;
	            }
	        }
	        return ans;
	    }


}
