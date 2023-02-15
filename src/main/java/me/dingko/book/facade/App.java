package me.dingko.book.facade;

import me.dingko.book.facade.pagemaker.PageMaker;

public class App {
    public static void main(String[] args) {
        PageMaker.makeLinkPage("linkpage.html");
//        PageMaker.makeWelcomePage("dingko_@example.com", "welcome.html");

//        String html = """
//                <!DOCTYPE html>
//                <html>
//                    <head>
//                        <title>Welcome!</title>
//                    </head>
//                    <body>
//                        <h1 style="text-align:center">Hello, world!</h1>
//                    </body>
//                </html>
//                """;
//        System.out.println(html);
    }
}
