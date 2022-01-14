
1. 아래 배열을 선언하고, 3의배수 개수를 찾아내시오.
int array[] = {3,6,9,10,1}; 

	int count = 0;
		int array[] = {3,6,9,10,1};
		for(int i=0; i<array.length; ++i) {
			if((array[i]%3)==0) {
				++count;
			}
		}System.out.println("갯수는 "+count);


2. 아래 배열을 선언하고, 총 합을 구한후 평균값을 구하시오.
int array[] = {80,90,100,70,50}; 

	int array[] = {80,90,100,70,50}; 
		int sum = 0;
		int avg = 0;
		for(int i=0;i<array.length;++i) {
			sum += array[i];
		}System.out.println(sum);
			avg = sum/array.length;
		System.out.println(avg);

3. 아래 배열을 선언하고, 짝수를 0으로 수정하시오.
int array[] = {2,4,6,8,10}; 
ex) 결과 값 : {0,0,0,0,0}

int array[] = {2,4,6,8,10};
		for(int i=0;i<array.length;++i) {
			if((array[i]%2)==0) {
				array[i] = 0;
			}System.out.print(array[i]);
		}

4. 아래 배열을 선언하고, 배열 인덱스 중 가장 큰 수를 찾아내시오.
int array[] = {5,11,2,0,7}; 
ex) 결과값 : 11

5. 아래 배열을 선언하고 정렬하시오. (풀 수 있는사람만)
int array[] = {5,11,2,0,7}; 
ex) {5,11,2,0,7} -> {0,2,5,7,11}
