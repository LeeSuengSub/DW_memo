1. 24
2. 0
3. 10
4. 15,10
5. 		   int count = 0;
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

6.
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