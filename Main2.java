class User {
    private String name;
    private int score;
    private static int count;
    
    static {
        User.count = 0;
        System.out.println("Static Initializer");
    }
    
    {
        System.out.println("Instance Initializer");
    }
    
    public User(String name, int score){
        this.name = name;
        this.score = score;
        User.count++;
    }
    
    public static void printCount(){
        System.out.println("Instances = "+User.count);
    }
    
    public int getScore(){
        return this.score;
    }
    
    public void setScore(int score){
        if (score > 0){
            this.score = score;
        }
    }
}

public class Main2 {
	public static void main(String[] args) {
	    User.printCount();
		User tom = new User("tom", 38);
		tom.setScore(85);
		tom.setScore(-22);
		System.out.println(tom.getScore());
		User.printCount();
		User bob = new User("bob", 40);
		User.printCount();
	}
}
