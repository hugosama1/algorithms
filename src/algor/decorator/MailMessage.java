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
public class MailMessage implements Message{

    @Override
    public void send(String message) {
        System.out.println("SEND BY EMAIL " +  message);
    }
    
    
}
