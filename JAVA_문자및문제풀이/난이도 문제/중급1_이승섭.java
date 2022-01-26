1.문제) 문제설명
메소드 파라미터에 정수형 데이터 start와 end를 받는다.
array[]배열에서 가장 큰 수를 리턴한다.
리턴 받은 값을 리턴타입이 boolean인 isNum함수 파라미터에 넣는다.

제한사항
아래 메소드 생성
start는 0보다 클 수 없습니다.
end는 배열길이와 같아야 합니다.
max에 10보다 큰 수가 오면 0을 return 해야 합니다.

public static boolean isNum(int max){
        final int standardVal = 10;
        if(max < standardVal){
            return true;
        }
        return false;
    }
    public static int getSum(int start, int end){
        int array[] = {3,8,9};
        int max = 0;
        for(int i=start; i<end; i++){
        	if((start)<=0) {
        	if((array.length)<10) {
            if(max<array[i]) {
            	max = array[i];
            	if(max>10) {
            		return 0;
            	}
            	}
            	}
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int start = 0;
        int end = 0;
        int max = getSum(start, end);
        boolean isFlag = isNum(max);
        System.out.print(isFlag);
2.문제) 문제설명
메소드 파라미터에 정수형 배열을 받는다.
배열 인덱스 값중 짝수인 값은 0으로 대입한다.
단, 인덱스 값중 짝수이고 300이 넘으면 0 대입을 무시한다.

제한사항
아래 메소드 생성

 public static int[] getResult(int[] array){
       for(int i=0;i<array.length;++i) {
    	   if(array[i]<300) {
    			   if((array[i]%2)==0) {
    				   array[i] = 0;
    }
    				   
    			   }
    }
       return array;
    }
    public static void main(String[] args) {
        int array[] = {120, 340, 200, 430, 33};
        int result[] = getResult(array);
        for(int i : result){
            System.out.print(i+", ");
        }
    }
    }
	
3.문제) 문제설명
메소드 파라미터에 문자열 배열을 받는다.
배열 인덱스값에 기호가 들어간 문자는 제거한다.
배열 인덱스값을 문자에서 숫자로 변환한다.
인덱스값 중 1번째 인덱스값이 200이하면 100을 리턴. 200 이상이면 200을 리턴 하시오.

제한사항
아래 메소드 생성

public static int getResult(String[] array){
        for(int i=0;i<array.length;++i) {
        	String x= array[i].replace("!", "");
        	x= array[i].replace("$", "");
        	int temp = Integer.parseInt(x);
        	for(int j=0;j<x.length();++j)
        	if(temp<200) {
        		return 100;
        	}
        	if(temp>200) {
        		return 200;
        	}
        	}
    	return 0;
    }

    public static void main(String[] args) {
        String array[] = {"100","1!30","11$0","200"};
        int result = getResult(array);
        System.out.println(result);
    }
}
4.문제) 문제설명
철수는 명부작성에 이름과 온도를 쓰려고 한다.
해당 명부에는 1페이지에 10명만 작성할 수 있다.
명부에 58명이 작성했다고 가정하면 총 몇 페이지 명부가 작성되었을까?

제한사항
아래 메소드 생성
명부는 100명 이하까지 작성 가능합니다.
calcPage()함수 코드라인 10줄 이하로 작성.

public static int calcPage(int totalCount, int rows) {
       int pages = 0;
       pages = totalCount/rows; 
       if((totalCount%rows)>1) {
    	   ++pages;
       }
       return pages;
       }
    public static void main(String[] args) {
        int totalCount = 58; //총 인원값
        int rows = 10; //1페이지에 작성할 수 있는 기준값
        int pages = calcPage(totalCount, rows);
        System.out.println(pages+" 페이지");
    }
}