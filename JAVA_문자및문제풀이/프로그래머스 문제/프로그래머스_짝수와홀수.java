 public static String solution(int num) {
	        String answer = "";
	       if((num%2)==0) {
	        	System.out.println(answer);
	        return "Even";
	        }
	        if((num%2)!=0) {
	        	System.out.println(answer);
	        	return "Odd";
	        }
	        return answer;
	}
	public static void main(String[] args) {
			int num =0;
			System.out.println("num : "+num+" "+"return : "+solution(num));
	}
}