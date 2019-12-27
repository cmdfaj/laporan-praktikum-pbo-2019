package unittest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import unittesting.MessageProcessorTest1841720175Fajar;

public class TestRunner1841720175Fajar {

    public static void main(String[] args) {
        Result mResult = new JUnitCore().runClasses(MessageProcessorTest1841720175Fajar.class);
        showMessageResult(mResult,MessageProcessorTest1841720175Fajar.class.getSimpleName());
        
        mResult = new JUnitCore().runClasses(Kategori1841720175FajarTest.class);
        showMessageResult(mResult, Kategori1841720175FajarTest.class.getSimpleName());
    }
    private static void showMessageResult(Result mResult, String className){
        if (mResult.wasSuccessful()) {
            System.out.printf("The Result Test From %s: %s\n",className,mResult.wasSuccessful());
        }else{
            for(Failure failure : mResult.getFailures()){
                System.out.println(failure);
            }
        }
    }
}
