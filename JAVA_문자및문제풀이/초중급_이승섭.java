1. 24
2. 0
3. 10
4. 15,10
5. 문제) 배열을 선언하고 10이 몇번째 인덱스에 있었는지 찾기  
제한사항
- 변수는 아래와 같이 선언.
- 배열안에 있는 값은 0초과 100미만 입니다.
- 10을 발견했으면 더이상 코드를 실행하지 않고 결과를 확인해야 합니다.

	   int count = 0;
		   int array[] = {101, 110, 120, 130, 88, 30};
		   for(int i=0;i<array.length;++i) {
			   if((array[i])>100) {
				   ++count;
			   }
		   }
		   if(count<3) {
			   count = 5;
		   }
	System.out.println(count);

6.문제) 철수의 계좌잔고는 현재 157000이 있다.  
은행가서 5만원, 만원, 5천원 으로 교환을 하고 싶다.  
157000은 5만원 3장, 만원 0장, 5천원 1장으로 교환이 가능할 것 이다.  
제한사항
- 변수는 아래와 같이 선언.
- 잔고에 20만원이 넘으면 money에 0을 대입하시오.

	    int money = 157000;
	    final int OMAN = 50000;
	    final int MAN = 10000;
	    final int OCHEON = 5000;
	    
	    int x = money/OMAN;
	    int temp = money%OMAN;
	    int y = temp/MAN;
	    int z = temp%MAN;
	    int a = z/OCHEON;
	    int b = z%OCHEON;
	    
	    
	    System.out.println("오만원은 "+x+"장");
	    System.out.println("만원은 "+y+"장");
	    System.out.println("오천원은 "+a+"장");