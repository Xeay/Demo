package baseall;
/**
 * Java ֵ����
 * @author ZHANG Song
 * 
 */
public class PassByValue {
	public static void main(String[] args) {
		testFirst();
		testSecond();
		testThird();
		testForth();
	}
	
	private static void testFirst() {
		int num = 1;
		System.out.println("��������������������Test1��������������������");
		System.out.println("��ʼnum=" + num);
		changeFirst(num);
		System.out.println("����num=" + num);
		System.out.println("��������������������Test1��������������������");
	}
	
	private static void changeFirst(int num) {
		num ++;
		System.out.println(">�޸�num=" + num);
	}
	
	private static void testSecond() {
		User user = new User();
		System.out.println("��������������������Test2��������������������");
		System.out.println("��ʼuserName=" + user.getUserName() + "|" + "��ʼuserAge=" + user.getUserAge());
		changeSecond(user);
		System.out.println("����userName=" + user.getUserName() + "|" + "����userAge=" + user.getUserAge());
		System.out.println("��������������������Test2��������������������");
	}
	
	private static void changeSecond(User user) {
		user.setUserName("Change Name");
		user.setUserAge(1);
		System.out.println(">�޸�userName=" + user.getUserName() + "|" + "�޸�userAge=" + user.getUserAge());
	}
	
	private static void testThird() {
		User user = new User();
		System.out.println("��������������������Test3��������������������");
		System.out.println("��ʼuserName=" + user.getUserName() + "|" + "��ʼuserAge=" + user.getUserAge());
		changeThird(user);
		System.out.println("����userName=" + user.getUserName() + "|" + "����userAge=" + user.getUserAge());
		System.out.println("��������������������Test3��������������������");
	}
	
	private static void changeThird(User user) {
		user = new User();
		user.setUserName("Change Name");
		user.setUserAge(1);
		System.out.println(">�޸�userName=" + user.getUserName() + "|" + "�޸�userAge=" + user.getUserAge());
	}
	
	private static void testForth() {
		String str = "Forth";
		System.out.println("��������������������Test4��������������������");
		System.out.println("��ʼstr=" + str);
		changeForth(str);
		System.out.println("����str=" + str);
		System.out.println("��������������������Test4��������������������");
	}
	
	private static void changeForth(String str) {
		str = "ChangeForth";
		System.out.println(">�޸�str=" + str);
	}
}
class User {
	String userName;
	Integer userAge;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
}
