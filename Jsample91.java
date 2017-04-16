class Jsample91{
	public static void main (String args[]){
		System.out.println(sum(4,10,9,1,6));
		System.out.println(sum(7,2,8));	
		System.out.println(sum());

		disp("[", "]", 10, 20);
		disp("[", "]", 123, 456, 789);
	}

	private static int sum (int ... nums){
		int sum = 0;
		for(int i = 0; i < nums.length; i++){
			sum += nums[i];
		}	
		return sum;
	}

	private static void disp(String sb, String sa, int... num){
		for(int i = 0; i < num.length; i++){
			System.out.println(sb + num[i] + sa);
		}
	}

}
