package scopes;

public class ScopeOfVariable {

	    int instanceVar = 100;
	    static int staticVar = 200;

	    public static void main(String[] args) {
	        ScopeOfVariable obj = new ScopeOfVariable();
	        obj.showScope();
	    }

	    void showScope() {
	        int localVar = 300;

	        System.out.println("Instance var: " + instanceVar);
	        System.out.println("Static var: " + staticVar);
	        System.out.println("Local var: " + localVar);

	        {
	            int blockVar = 400;
	            System.out.println("Block var: " + blockVar);
	        }
	    }
	}
// wala kayong magagawa, mahal ko na

