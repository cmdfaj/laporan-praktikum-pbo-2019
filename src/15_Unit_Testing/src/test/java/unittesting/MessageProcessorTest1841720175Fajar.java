package unittesting;

import org.junit.Assert;
import org.junit.Test;
import unittest.MessageProcessor1841720175Fajar;

public class MessageProcessorTest1841720175Fajar {

    MessageProcessor1841720175Fajar mProcessor;

    public MessageProcessorTest1841720175Fajar() {
        mProcessor = new MessageProcessor1841720175Fajar();
        mProcessor.setSender("Ronaldo");
        mProcessor.setRecipient("Rafael");
        mProcessor.setMessage("Whats up bro?");
    }
    @Test
    public void testShowMessageFajar(){
        String expectedResult = "Hai Rafael, you have message from Ronaldo.\nThe message as follows : Whats up bro?";
        Assert.assertEquals(expectedResult,mProcessor.messageFormat());
    }
}
