package objective;

class SomeThrowable extends Throwable { }
class MyThrowable extends SomeThrowable { }
public class TestClass102{
   public static void main(String args[]) throws SomeThrowable{
      try{
         m1();
      }catch(SomeThrowable e){
         throw e;
      }finally{
         System.out.println("Done");
      }
   }
   public static void m1() throws MyThrowable{
      throw new MyThrowable();
   }
}

