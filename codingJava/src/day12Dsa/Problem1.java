package day12Dsa;

public class Problem1 
{
//	Given a binary string A. It is allowed to do at most one swap between any 0 and 1.
//	Find and return the length of the longest consecutive 1’s that can be achieved.
//			For Example
//
//			Input 1:
//			    A = "111000"
//			Output 1:
//			    3			

	
	public static void main(String[] args) 
	{
		String a="11101";
		System.out.println(maximum_one(a));
	}
	
	  public static int maximum_one(String s)
	    {
	        // To count all 1's in the string
	        int cnt_one = 0;
	        int n=s.length();
	        for (int i = 0; i < n; i++) {
	            if (s.charAt(i) == '1')
	                cnt_one++;
	        }
	        // To store cumulative 1's
	        int left[] = new int[n];
	        int right[] = new int[n];
	        if (s.charAt(0) == '1')
	            left[0] = 1;
	        else
	            left[0] = 0;
	    
	        if (s.charAt(n-1) == '1')
	            right[n - 1] = 1;
	        else
	            right[n - 1] = 0;
	        for (int i = 1; i < n; i++) {
	            if (s.charAt(i) == '1')
	                left[i] = left[i - 1] + 1;
	            else
	                left[i] = 0;
	        }
	    
	        for (int i = n - 2; i >= 0; i--) 
	        {
	            if (s.charAt(i) == '1')
	                right[i] = right[i + 1] + 1;
	    
	            else
	                right[i] = 0;
	        }
	    
	        int cnt = 0, max_cnt = 0;
	        for(int i=0; i<n; ++i )
	        max_cnt=Math.max(max_cnt,Math.max(right[i],left[i]));
	        for (int i = 1; i < n - 1; i++) {
	            if (s.charAt(i) == '0') {
	                int sum = left[i - 1] + right[i + 1];
	    
	                if (sum < cnt_one)
	                    cnt = sum + 1;
	    
	                else
	                    cnt = sum;

	                max_cnt = Math.max(max_cnt, cnt);
	                cnt = 0;
	            }
	        }
	    
	        return max_cnt;
	    }

}
