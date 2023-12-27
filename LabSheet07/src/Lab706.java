import javax.swing.JOptionPane;

public class Lab706 {
	public static void main(String[] args) {
		int[] nums = {25,78,41,22,36,85,37};
		
		int indexNumb = Integer.parseInt(JOptionPane.showInputDialog("Input index of array: "));
		
		while(checkIndex(nums,indexNumb)) {
			indexNumb = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again: "));
		}
		int currentValue = currentData(nums,indexNumb); //method return value
		JOptionPane.showMessageDialog(null, "Current data,nums["+indexNumb+"] is " + currentValue + 
				((indexNumb-1<0)?"\nNo previous data":"\nPrevious data, nums["+(indexNumb-1)+"] is " + prevData(nums,indexNumb)) +
				((indexNumb+1>nums.length-1)?"\nNo next data":"\nNext data, nums["+(indexNumb+1)+"] is " + nextData(nums,indexNumb)));
	}//end of main()

	public static boolean checkIndex(int[] number, int index) {
		/* if ((index >= number.length)||(index < 0)) {
			return true;
		}
		else {
			return false;
		} */
		
		return ((index >= number.length)||(index < 0))? true : false;
	}
	
	public static int currentData(int[] nums,int index) {
		return nums[index];
	}
	
	public static int prevData(int[] nums,int index) {
		return nums[index-1];
	}
	public static int nextData(int[] nums,int index) {
		return nums[index+1];
	}
}
