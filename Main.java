public class Main {
	public static void main(String[] args) {
	    
	    int[] sales;
        sales = new int[3];
        sales[0] = 100;
        sales[1] = 200;
        sales[2] = 300;
        System.out.println(sales[1]);
        
        // int[] sales;
        // sales = new int[] {100,200,300};
        
        // int[] sales = {100, 200, 300};
	    
	    for (int co=0; co < sales.length; co++){
	        System.out.println("Sales index = " + sales[co]);
	    }
	    
	    for (int sale : sales){
	        System.out.println("Sales value one line = " + sale);
	    }
	    
	    int score = 45;
	    if (score>80){
	        System.out.println("Great!");
	    }else if (score > 60) {
	        System.out.println("Good!");
	    }else {
	        System.out.println("so so ...!");
	    }
	    // String msg = score > 80 ? "Great!" : "soso...!";
		System.out.println("hello, world!");
		
		
		String signal = "green";
		switch (signal){
		    case "red":
		        System.out.println("STOP!");
		        break;
		    case "green":
		    case "blue":
		        System.out.println("GO!");
		        break;
		    case "yellow":
		        System.out.println("Caution!");
		        break;
		    default:
		        System.out.println("Signal is nothing");
		        break;
		}
		
		
		int i = 0;
		while (i < 10){
		    System.out.println("while number = " + i);
		    i++;
		}
		
		i = 10;
		do {
		    System.out.println("do while number = " + i);
		    i++;
		} while (i<20);
		
		
		for (int j = 0; j < 10; j++){
		    if (j == 5){
		        System.out.println("Countinue 5");
		        continue;
		    }else if (j == 7){
		        System.out.println("Breake 7");
		        break;
		    }
		    System.out.println("for number = " + j);
		}
	}
}