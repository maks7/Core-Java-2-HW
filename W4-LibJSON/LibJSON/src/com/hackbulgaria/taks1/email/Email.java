package com.hackbulgaria.taks1.email;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class Email {

    public void send() {
        
        // Create the attachment
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath(".\\res\\HorseBite.gif");
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Picture horse bite a man");
        attachment.setName("HorseBite");
        
        // Create the email message
        MultiPartEmail email = new MultiPartEmail();
        try {
        email.setHostName("smtp.googlemail.com");
        email.setAuthentication("username", "pass");
        email.setTLS(true);
        email.addTo("max2@gmail.com", "Max M");
        email.setFrom("max1@gmail.com");
        email.setSubject("The picture");
        email.setMsg("Hello, this is the picture you must see.");
        
        // add the attachment
        email.attach(attachment);
        
        // send the e-mail
        email.send();
        
        } catch (EmailException e) {
            e.printStackTrace();
        }
    }
}
