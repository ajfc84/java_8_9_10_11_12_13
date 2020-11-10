package com.modernjava.java13improvements;

public class MultiLineTextBlockExample {
    public static void main(String[] args) {
        String st1 = """
                Hello World
                using
                TextBlocks !
                """;
        System.out.println("st1 = " + st1);

        String phrase = """
                {
                employee : "Mike",
                employeeId: 10001,
                employeeType: FT
                }
                """;
        System.out.println("phrase = " + phrase);

        String html = """
                <html>
                    <body>
                        <p>"Java, Programming</p>
                    </body>
                </html>
                """;
        System.out.println(html);

        String st2 = st1.concat("This is my first text block");
        System.out.println("st2 = " + st2);
    }
}
