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
public abstract class MessageDecorator implements Message{
    
    Message messageSender;
    
    public MessageDecorator( Message message) {
        this.messageSender = message;
    } 

    @Override
    public void send(String message) {
        this.messageSender.send(message);
    }
    
}
