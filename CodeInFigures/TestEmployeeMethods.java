public class TestEmployeeMethods
{
   public static void main(String[] args)
   {
      Ch4Employee aWorker = new Ch4Employee();
      aWorker.setValues();
      aWorker.methodThatUsesInstanceAttributes();
      aWorker.methodThatUsesLocalVariables();
   }
}
