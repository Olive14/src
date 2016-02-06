package myProg;

public class Hello {
	private String str;

	//コンストラクタ
	Hello(String str) {
		this.str = str;
	}

	public void show() {
		System.out.println(this.str);
	}
}
