class Example_throw {
    public void testMethod(int a) throws Exception1, Exception2 {
      if (a < 10) {
        throw new Exception1("Exception1: Value is too low");
      } else if (a > 20) {
        throw new Exception2("Exception2: Value is too high");
      }
    }
  }
  
  class Exception1 extends Exception {
    public Exception1(String message) {
      super(message);
    }
  }
  
  class Exception2 extends Exception {
    public Exception2(String message) {
      super(message);
    }
  }
  
  public class ExceptionHandle {
    public static void main(String[] args) {
      Example_throw obj = new Example_throw();
      try {
        obj.testMethod(1);
      } catch (Exception1 e1) {
        System.out.println(e1.getMessage());
      } catch (Exception2 e2) {
        System.out.println(e2.getMessage());
      }
    }
  }
  