1.
public static void main(String[] args) {
        String phone = "017-404-1234";
        String array[] = phone.split("-");
        if((array[0]) != "010") {
        	System.out.println("핸드폰 번호를 변경해야 합니다.");
        }
        for(int i=0;i<array.length;++i) {	
        	if(array[1].length() == 3) {
        		array[1]="-xxx";
        	if(array[2].length() == 4) {
        		array[2]="-xxxx";
        	}
        	}
        	}
        //... 코드 작성 ...
		for(String str : array){
			System.out.print(str);
			
		}
2.
public static void main(String[] args) {
        String scores = "80, 70, 100, 31";
        String[] array = scores.split(",");
        int len = array.length; //과목 수
        int sum = 0;
        for(int i=0; i<array.length; i++) {
        	String temp = array[i].trim();
        	int num = Integer.parseInt(temp);
        	if(num==100) {
        		System.out.println("100점 만점에 100점");
        	}
        	sum += num;
        }
       System.out.print("총점 : "+sum);
       System.out.print("평균 : "+sum/len);

3.
못풀었음.
답안 예시)
public static void main(String[] args) {
        String query = "name=brian&addr=daejeon&age=30";
        String name = "";//  0			1			2
        String addr = "";
        int age = 0;
        String[] array = query.split("&");
        for(int i=0;i<array.length;i++) {
        	String temp[] = array[i].split("=");
        		if(i==0) {
        			name = temp[i+1];
        		}
        		if(i==1) {
        			addr = temp[i];
        		}
        		if(i==2) {
        			age = Integer.parseInt(temp[i-1]);
        		}
        		for(int j=0;j<temp.length;j++) {
        			String temp01[] = array[i].split("=");
        		
        		if(i == 0) {
        			name = temp01[j];
        			
        		}
        		if(i ==1) {
        			addr = temp01[j];
        		}
        		if(i==2) {
        			if(j==1) {
        				age = Integer.parseInt(temp01[i-1]);
        			}
        		}
        }
}
        
        System.out.print("name : "+name+" ");
        System.out.print("addr : "+addr+" ");
        System.out.print("age : "+age);