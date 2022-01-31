전화번호 암호화 문제
선생님 식)
public static String solution(String phone_number) {
		String answer = "";
		int exception_count = 4;
		int phoneNumberLen = phone_number.length();
		int temp = phoneNumberLen - exception_count;
		String FirstNum = phone_number.substring(0,temp);
		String lastNum = phone_number.substring(temp, phoneNumberLen);
		String star = "";
		for(int i=0;i<FirstNum.length();++i) {
			star+="*";
		}
		answer = star+lastNum;
			return answer;
	}

