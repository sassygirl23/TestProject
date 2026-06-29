package objective;

interface House{
	  public default void lockTheGates(){
	     System.out.println("Locking House");
	  }
	}

	interface Office {
	  public void lockTheGates();
	}

	class HomeOffice implements House, Office{ //1
	  public void lockTheGates(){
	     System.out.println("Locking HomeOffice");
	  }
	}

public class TestClass101 {

	  public static void main(String[] args) { 
	     Office off = new HomeOffice();  //2
	     off.lockTheGates();
	  }
	}