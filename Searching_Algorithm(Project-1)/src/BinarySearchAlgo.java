
public class BinarySearchAlgo {

	public static void main(String[] args) {

		int nums [] = {1,3,4,5,9,11,13,34,45,65,77,80,87,89};
		
		int x = 87        ;
		int result = search(nums, x);
		
		if(result == -1)
		System.out.println("The given number doesnot exist in the array");
		else
		{
			System.out.println("The specified number is at position : "+result);
		}
		
		
	}

	public static int search(int[] nums, int x) {
		
	
		
		int step = 0;
		int  left = 0;
		int right = nums.length -1;
		
		while(left < right)
		{
			int mid = (left+right)/2;
			step++;
			if(nums[mid] == x)
			{	
				System.out.println("No. of steps : "+step);
			return mid;
			}
			else if(nums[mid] < x)
			{
				left = mid + 1;
			}
			else
			{
				right = mid - 1;
				
			}
		}
		System.out.println("No. of steps : "+step);
		return -1;
	}

}
