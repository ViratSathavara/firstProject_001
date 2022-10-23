package com.company;

public class a10_practice_set {
    public static void main(String[] args) {
//             1. Write a Java program to convert a string to lowercase.

       String name = "virat m s ";
       name = name.toLowerCase();
       System.out.println(name);

//             2. Write a Java program to replace spaces with underscores.

        String text = "To lower case";
        text = text.replace(" ", "_");
        System.out.println(text);

//            3. Write a Java program to fill in a letter template which looks like below:
//               letter = “Dear <|name|>, Thanks a lot”

//               Replace <|name|> with a string (some name)

        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "virat");
        System.out.println(letter);

//        Write a Java program to detect double, triple and forth spaces in a string.

        String mysting = "this string contains double and  triple   spacs";
        System.out.println(mysting.indexOf("  "));
        System.out.println(mysting.indexOf("   "));
        System.out.println(mysting.indexOf("    "));

//        Write a program to format the following letter using escape sequence characters.
//        Letter = “Dear Harry, This Java Course is nice. Thanks”

        String myescape = "\n dear virat,\n\t this cource is nice.\n\t thanks!";

        System.out.println(myescape);
    }
}
