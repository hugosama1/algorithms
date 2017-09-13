/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algor.decorator;

/**
 *
 * @author hugo
 */
public class SMSMessageDecorator extends MessageDecorator{

    public SMSMessageDecorator(Message message) {
        super(message);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("SEND BY SMS " + message);
    }
    
}
