public static double solution(int[] array) {
		double sum = 0;
		double avg = 0;
		int len = array.length;
		for(int i=0; i<len;i++) {
			sum += array[i];
		}
		avg = sum/len;
		return avg;
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4};
		double result = solution(array);
		System.out.println(result);
	}

}
