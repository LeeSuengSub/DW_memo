1.
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
2.
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
	
3.
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
4.
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