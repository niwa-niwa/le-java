// 列挙型
enum Result{
    SUCCESS,
    ERROR,
}


interface Printable{
    // 定数
    double VERSION = 1.2;
    
    // 抽象メソッド
    void print();
    
    // defaultメソッド
    public default void getInfo(){
        System.out.println("I/F ver. " + Printable.VERSION);
    }
}
abstract class User {
    public abstract void sayHi(); //抽象メソッド
}

class JapaneseUser extends User implements Printable{
    @Override
    public void sayHi(){
        System.out.println("こんにちは");
    }
    
    @Override
    public void print(){
        System.out.println("Now Printig User Profile...");
    }
}

class AmericanUser extends User {
    @Override
    public void sayHi(){
        System.out.println("Hi How are you");
    }
}

public class Main3 {
	public static void main(String[] args) {
		JapaneseUser sato = new JapaneseUser();
		AmericanUser mash = new AmericanUser();
		sato.sayHi();
		sato.print();
		sato.getInfo();
		mash.sayHi();
		
		
		Result res;
		res = Result.ERROR;
		
		switch(res){
		    case SUCCESS:
		        System.out.println("OK!");
		        System.out.println(res.ordinal());
		        break;
	        case ERROR:
	            System.out.println("NG!");
	            System.out.println(res.ordinal());
	            break;
		}
	}
}
