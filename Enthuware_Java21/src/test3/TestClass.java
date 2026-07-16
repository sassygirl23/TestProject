package test3;

public class TestClass {
	
	void crazyLoop(){
		   var c = 0;
		   JACK: while (c < 8){
			   System.out.println(c);
			   if (c > 3) break JACK; else c++;
		   }
		}

}
