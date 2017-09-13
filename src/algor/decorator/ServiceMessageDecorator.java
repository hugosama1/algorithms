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
public class ServiceMessageDecorator  extends MessageDecorator{
    public ServiceMessageDecorator(Message message) {
        super(message);
    }

    @Override
    public void send(String message) {
        super.send(message); 
        System.out.println("SEND TO MESSAGE SERVICE " + message);
    }
    
    
    
}
