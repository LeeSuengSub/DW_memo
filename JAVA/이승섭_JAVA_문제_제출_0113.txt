문제1. 1 ~ 10까지 중 짝수,홀수 출력

		for(int i=1; i<=10; ++i) {
			if((i%2)== 0) {
				System.out.println("짝수"+i);
			}if((i%2)==1) {
				System.out.println("홀수"+i);
			}	
		}

문제2. 1 ~ 100까지 중 짝수가 몇개인지 출력
		int y = 0;
		for(int i=1; i<=100;++i) {
			if((i%2)==0) {
				++y;
			}
		}System.out.println("총갯수는 "+y);

문제3. 1 ~ 10 총합은? 55?

		int sum = 0;
		for(int i=1; i<=10;++i) {
			sum+=i;
				}System.out.println("총합은 "+sum);