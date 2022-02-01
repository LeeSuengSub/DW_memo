public static String solution(String phone_Num) {
		int len = phone_Num.length();
		int count = 4;
		int temp = len - count;
		String star = "";
		String answer = "";
		String First = phone_Num.substring(0,temp);
		for(int i=0;i<temp;i++) {
			star +="*";
		}
		String second = phone_Num.substring(temp,len);
		answer = star+second;
		return answer;
		
	}
	public static void main(String[] args) {
		String phone_Num = "01077778888";
		System.out.println(solution(phone_Num));
	}
	
}
