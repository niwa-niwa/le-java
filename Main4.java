// generics
class MyData<T, S>{
    public void getThree(T x, S s){
        for(int i = 0; i<3; i++){
            System.out.println(x);
        }
        print(s);
    }
    public void print(S s){
        System.out.println(s);
    }
}

// 例外
class MyException extends Exception {
    public MyException(String s){
        super(s);
    }
}

public class Main {
    
    public static void div(int a, int b){
        try{
            if( b < 0 ){
                throw new MyException("not minus");
            }
            System.out.println(a / b);
        }catch(ArithmeticException e){
            System.err.println(e.getMessage());
        }catch(MyException e){
            System.err.println(e.getMessage());    
        }finally{
            System.out.println(" -- end -- ");
        }
    }
    
	public static void main4(String[] args) {
		div(3,0);
		div(5,-2);
		
		MyData<Integer, String> i = new MyData<>();
		i.getThree(33, "comp");
		MyData<String, String> s = new MyData<>();
		s.getThree("hello", "world");
	} 
	
}
