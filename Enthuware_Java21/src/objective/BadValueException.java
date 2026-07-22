package objective;

public class BadValueException extends Exception {
	public static void main(String[] args) throws BadValueException{
		String [] sa = {"bob", null, "charlie"};
		
		String concatenated = "";
			try {
				try {
					for(String s : sa) {
						if(s == null) throw new BadValueException ();
						else concatenated = concatenated + s;
					}
				}catch(BadValueException bve) {
					throw new BadValueException();
				}
			}catch(Exception e) {
				System.out.print("Exception caught : "+e.getMessage()+" ");
			}
				System.out.print(concatenated);
			
		}


}
