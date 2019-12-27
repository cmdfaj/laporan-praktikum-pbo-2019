package unittesting;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner1841720175Fajar {

    public static void main(String[] args) {
        Result mResult = new JUnitCore().runClasses(MessageProcessorTest1841720175Fajar.class);
        showMessageResult(mResult,MessageProcessorTest1841720175Fajar.class.getSimpleName());
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
