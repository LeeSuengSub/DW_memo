//파이널 문제. 별찍기!!
//조건1. 이중 for문을 이용해서
//조건2. if/else사용하지말 것, 전역변수 선언하지 말 것
//결과 : 아래와 같은 결과를 출력할 것.
문제 1)별찍기
*
**
***
****
*****

답)
 for(int i=0; i<6; ++i) {
		        for(int j=1; j<=i; j++) {
		            System.out.print("*");
		        }
		        System.out.println();

문제 2)반대로 별찍기
*****
****
***
**
*
답)
	for (int i = 5; i > 0; --i) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		