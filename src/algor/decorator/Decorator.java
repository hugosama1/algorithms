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
public class Decorator {
   
    public static void main(String[] args) {
        Message message = new SMSMessageDecorator(new MailMessage());
        message = new ServiceMessageDecorator(message);
        message.send("THIS IS THE MESSAGE");
    }
    
}
