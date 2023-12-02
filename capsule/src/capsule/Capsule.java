package capsule;

public class Capsule {
	public static void main(String[]agrs) {
		Person taro = new Person("山田太郎",20);
		
		//演習④ (隠蔽して取得・書き換え)
		System.out.println(taro.getName()); //name → getNameに変更で読み取りが可能
		
		taro.setName("花子"); // "花子"に書き換え
		
		System.out.println(taro.getName()); // 書き換え後の値を表示
		
		
		
		//演習⑤ (年齢を取得して30に書き換え)
		System.out.println(taro.getAge());
		taro.setAge(30);
		System.out.println(taro.getAge());
	}

}
