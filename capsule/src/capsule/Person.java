package capsule; //演習03 (カプセル化)

public class Person {
	private String name = null;
	private int age = 0;
	
	//演習①
	public Person (String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	//演習⑤ (年齢を取得・書き換え用)
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
