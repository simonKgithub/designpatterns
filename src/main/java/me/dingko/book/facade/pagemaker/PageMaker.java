package me.dingko.book.facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    public PageMaker() {
    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title(username + "'s web page");
            writer.paragraph("Welcome to " + username + "'s web page!");
            writer.paragraph("Nice to meet you!");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeLinkPage(String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Link Page");
            /* 답지 */
            for (String mailaddr : mailprop.stringPropertyNames()) {
                String username = mailprop.getProperty(mailaddr, "(unknown)");
                writer.mailto(mailaddr, username);
            }
            /* 나의 해답
            for (Map.Entry<Object, Object> mail : mailprop.entrySet()) {
                writer.mailto((String)mail.getKey(),(String)mail.getValue());
            }
             */
            writer.close();
            System.out.println(filename + " is created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
