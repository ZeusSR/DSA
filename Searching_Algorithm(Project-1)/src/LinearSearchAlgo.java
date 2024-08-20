
public class LinearSearchAlgo {

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
		for(int i = 0 ; i<nums.length;i++)
		{
			step++;
			if(nums[i] == x)
			{	
				System.out.println("No. of steps : "+step);
			return i;
			}
		}
		System.out.println("No. of steps : "+step);
		return -1;
	}

}
