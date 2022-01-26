UML문제

1. UserVO

public class UserVO {
private int id;
private String name;
private String emanil;
private String phone;
private boolean isLogin;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmanil() {
	return emanil;
}
public void setEmanil(String emanil) {
	this.emanil = emanil;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public boolean isLogin() {
	return isLogin;
}
public void setLogin(boolean isLogin) {
	this.isLogin = isLogin;
}

2.  MainService
public void setUser(UserVO vo) {

	}
	public UserVO getUser(int id) {
		UserVO vo = new UserVO();
		// 파라미터 데이터가 => int id
		// UserVO 필드변수 id에 대입.
		//vo.id = id; 대입을 해야하는데 오류남.
		//이유는 UserVO의 필드변수가 private
		//그래서 set메소드를 이용해서 대입
		vo.setId(id);
		vo.setName("홍길동");
		vo.setEmail("네이버");
		vo.setLogin(true);
		vo.setPhone("010");
		return vo;
	}

3. MainController
public static void main(String[] args) {
		UserVO vo = new UserVO();
		MainService service = new MainService();
		int id = 30;
		if (id >= 1 && id <= 100) {
			vo = service.getUser(id);
		}
		System.out.println(vo.getId);
		System.out.println(vo.getName);
	}