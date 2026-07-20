package enums;

public class Arithmetic {

	    // Function na nag-a-add ng kahit ilang integers
	    static int sum(int... numbers) {

	        int total = 0;

	        // Inuulit ang bawat number at idinadagdag sa total
	        for (int num : numbers) {
	            total += num;
	        }

	        // Ibinabalik ang kabuuang sum
	        return total;
	    }

	    public static void main(String[] args) {

	        // Puwedeng magpasa ng kahit ilang integers
	        int answer = sum(10, 20, 30, 40, 50);

	        System.out.println("Total: " + answer);
	    }
	
	
	

}
                                                    