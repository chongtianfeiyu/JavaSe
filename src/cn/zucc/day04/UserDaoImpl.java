package cn.zucc.day04;

public class UserDaoImpl extends User implements UserDao {
	
	User[] users = new User[3000];
	User userz= new User();
	int i=0;
	@Override
	public void addU(User user) {
		// TODO Auto-generated method stub
		users[i]=user;
		i++;
		userz=user;

	}
	

	public UserDaoImpl() {
	
		userz.name = "admin";
		userz.pd = "admin";
		userz.gender = "male";
		
		// TODO Auto-generated constructor stub
	}


	public UserDaoImpl(User[] users, User userz, int i) {
		super();
		this.users = users;
		this.userz = userz;
		this.i = i;
	}


	@Override
	public void changeU(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchU(String uName) {
		// TODO Auto-generated method stub
		for (int j = 0; j < i; j++) {
			if (users[j].equals(uName)) {
				System.out.println("�ҵ����û���");
			}
			else {
				System.out.println("δ�ҵ����û�");
			}
		}

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("====�û���Ϣ====");
		System.out.print("�û���: "+userz.name);
		System.out.print("�û����룺 "+userz.pd);
		System.out.print("�Ա� "+userz.gender);

	}

}
