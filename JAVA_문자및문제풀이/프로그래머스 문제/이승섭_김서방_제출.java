public static String solution(String[] seoul) {
		String answer = "";
		String searchWord = "Kim";
		int index = 0;
		int len = seoul.length;
		if (len >= 1 && len <= 1000) {
			for (int i = 0; i < len; ++i) {
				if (seoul[i].length() >= 1 && seoul[i].length() <= 20) {
					if (seoul[i].equals(searchWord)) {
						index = i;
						answer = "김서방은 "+Integer.toString(index)+"에 있다";
					}
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String array[] = { "Jane", "Kim" };
		String result = solution(array);
		System.out.println(result);
	}
}
