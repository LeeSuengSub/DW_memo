버블 정렬


-아래 배열을 선언하고, 배열 인덱스 중 가장 큰 수를 찾아내시오.
int array[] = {5,11,2,0,7}; 
ex) 결과값 : 11

예시)
int array22[] = {14,11}; //{0,1} <==버블정렬 알고리즘.
			int size = array.length;
			int temp = 0;
			for(int i=1; i<size;++i) {
				for(int j=0; j<size-1; ++j) {
					if(array[i] < array[i]) {
						temp = array[i];//array[i]를 임시공간에 잠시 넣어둔다.
						array[i] = array[j];
						array[j] = temp;
						
					}
				}
			}