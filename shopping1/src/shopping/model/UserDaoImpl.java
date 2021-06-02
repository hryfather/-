package shopping.model;

import java.util.HashMap;
import java.util.Map;

public class UserDaoImpl {

	private Map<String,User> userMap;
	
	public UserDaoImpl(){
		init();
	}
	
	public UserDaoImpl(Map<String, User> userMap){
		if (userMap==null || userMap.isEmpty()){
			init();
		}
		this.userMap = userMap;
			
	}
	
	public void init(){
		userMap = new HashMap<String, User>();
		userMap.put("1", new User("1","1"));
	}
	
	public Map<String, User> getUserMap() {
		return userMap;
	}

	public void setUserMap(Map<String, User> userMap) {
		this.userMap = userMap;
	}

	public User isLogin(String userName, String password) {
		User user = userMap.get(userName);
		if (user == null || !user.getPassword().equals(password)){
			return null;
		}
		return user;
	}
}

