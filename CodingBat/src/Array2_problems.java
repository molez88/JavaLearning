
public class Array2_problems {
	
	
	//Given an array of ints, return true if every element is a 1 or a 4.
	public boolean only14(int[] nums) {
		for(int i = 0; i < nums.length; i++)
			{
				if(nums[i] != 1 && nums[i] != 4)
					return false;
			}
			return true;
		}
	
	public String[] fizzArray2(int n) {
	     String[] fizz = new String[n];
	     
	     for (int x =0; x < n; x++){
	     
	         String element = new Integer(x).toString();
	         fizz[x] = element;
	     }
	  return fizz;
	}
	
	public boolean no14(int[] nums)
	{
		boolean noOne = true, noFour = true;
	  for(int i = 0; i < nums.length && (noOne || noFour); i++)
		{
			if(nums[i] == 1)
				noOne = false;
			else if(nums[i] == 4)
				noFour = false;
		}	
		return (noOne || noFour);
	}
	
	public boolean isEverywhere(int[] nums, int val) {
		  for (int x = 0; x < nums.length - 1; x++){
		      if (nums[x] != val && nums[x + 1] != val){
		      return false;
		      }
		  }
		  return true;
		}

	
	public boolean either24(int[] nums) {
		  int no2pair = 1, no4pair = 1;
		  for(int i = 0; i < nums.length - 1 && (no2pair + no4pair != 0); i++)
			{
				if(nums[i] == 2 && nums[i+1] == 2)
					no2pair = 0;
				else if(nums[i] == 4 && nums[i+1] == 4)
					no4pair = 0;
			}
			return ((no2pair ^ no4pair) == 1);
		  
		}
	
	public int matchUp(int[] nums1, int[] nums2) {
		int count = 0;
		  for (int x = 0; x < nums1.length; x++){
		      if (nums1[x] - nums2[x] <= 2 && nums1[x] - nums2[x] >= -2 && 
		    		  nums1[x] != nums2[x]){
		      count++;
		      }
		  }
		  return count;
		}
	
	
	public boolean has77(int[] nums) {
		  for(int i = 0; i < nums.length - 1; i++){
		  	if(nums[i] == 7){
					if(nums[i+1] == 7)
						return true;
					else if(i < nums.length - 2 && nums[i+2] == 7)
						return true;
				}
			}
			return false;
	}
	
	public boolean has12(int[] nums)
	{
	  boolean oneSpotted = false;
	  for(int i = 0; i < nums.length; i++){
		  if(oneSpotted){
			  if(nums[i] == 2)
				  return true;
		  }
	  	else if(nums[i] == 1)
	  		oneSpotted = true;
	  }
	  return false;
	}
	
	public boolean modThree(int[] nums) {
		int result = 0;      
		for (int x = 0; x < nums.length - 2; x++){
			if (nums[x] % 2 == 1 && nums[x + 1] % 2 == 1 && nums[x + 2] % 2 == 1){
		    result = 1;
		    }
		} 
		for (int x = 0; x < nums.length - 2; x++){
			if (nums[x] % 2 == 0 && nums[x + 1] % 2 == 0 && nums[x + 2] % 2 == 0){
		    result = 1;
		    }
		}
		return (result == 1);	  
	}
	
	
	public boolean haveThree(int[] nums){
		int count = 0;
		boolean isPerv3 = false;
		for(int i = 0 ; i < nums.length && count <= 3; i++){
			if(nums[i] == 3){
				if(isPerv3)
	  			return false;
				else{
	  			count++;
	  			isPerv3 = true;
				}
			}
			else
	  		isPerv3 = false;
	  }
		return (count == 3);
	}
	
	
	public boolean sameEnds(int[] nums, int len)
	{
		int start = 0;
		int end = nums.length-len;
		for(; len > 0; len--)
		{
			if(nums[start] != nums[end])
				return false;
			else
			{
				start++;
				end++;
			}
		}
		return true;
	}

	public boolean tripleUp(int[] nums) {
		int count = 0;
		for(int x = 0; x < nums.length -2; x++){
			if (nums[x + 2] == nums[x + 1] + 1 && nums[x + 1] == nums[x] + 1){
				count++;
			}
		}
		return (count != 0);
	}

	
	public int[] fizzArray3(int start, int end) {
		  int[] fizz = new int[end - start];
		  
		  for(int x = 0; x < end - start; x++){
		  fizz[x] = start + x;
		  }
		  return fizz;
		}

	public int[] shiftLeft(int[] nums)
	{
		if(nums.length >= 2)
		{
			int temp = nums[0];
			for(int i = 0; i < nums.length - 1; i++)
				nums[i] = nums[i+1];
			nums[nums.length-1] = temp;
		}
		return nums;
	}
	
	public int[] tenRun(int[] nums)
	{
		int tenMode = -1;
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] % 10 == 0)
				tenMode = nums[i];
			else if(tenMode != -1)
				nums[i] = tenMode;
		}
		return nums;
	}
	
	
	public int[] pre4(int[] nums)
	{
		int p = 0;
		int[] arr;
		while(nums[p] != 4)
			p++;
		arr = new int[p];
		for(int i = 0; i < p; i++)
			arr[i] = nums[i];
		return arr;
	}

	
	
	public int[] post4(int[] nums)
	{
	  int p = nums.length - 1;
		int[] arr;
		while(nums[p] != 4)
			p--;
		arr = new int[nums.length - 1 - p];
		for(int i = p + 1; i < nums.length; i++)
			arr[i - p - 1] = nums[i];
		return arr;
	}
	
	
	public int[] notAlone(int[] nums, int val)
	{
	  for(int i = 1; i < nums.length - 1; i++)
	  {
			if(nums[i] == val)
			{
				if(nums[i-1] != val && nums[i+1] != val)
					nums[i] = (nums[i-1] > nums[i+1]) ? nums[i-1] : nums[i+1];
			}
	  }
	  return nums;
	}

	
	public int[] zeroFront(int[] nums)
	{
		int zeroIndex = 0;
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] == 0)
			{
				nums[i] = nums[zeroIndex];
				nums[zeroIndex] = 0;
				zeroIndex++;
			}
		}
		return nums;
	}

	
	public int[] withoutTen(int[] nums)
	{
		int[] arr = new int[nums.length];
		int p = 0;
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] != 10)
			{
				arr[p] = nums[i];
				p++;
			}
		}
		// Java arrays are initialized to 0 so no need to set the last elements to 0
		return arr;
	}
	
	
	public int[] zeroMax(int[] nums)
	{
		int max;
		for(int i = 0; i < nums.length - 1; i++)
		{
			if(nums[i] == 0)
			{
				max = 0;
				for(int k = i + 1; k < nums.length; k++)
				{
					if(nums[k] > max && nums[k] % 2 == 1)
						max = nums[k];
				}
				if(max != 0)
					nums[i] = max;
			}
		}
		return nums;
	}

	
	public int[] evenOdd(int[] nums)
	{
		int temp;
	  int evenIndex = 0;
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] % 2 == 0)
			{
				temp = nums[i];
				nums[i] = nums[evenIndex];
				nums[evenIndex] = temp;
				evenIndex++;
			}
		}
		return nums;
	}
	
	
	

	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
