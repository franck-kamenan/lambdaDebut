package be.intecbrussel.hoofdstuk18;

public class TextApp
{
    public static void main(String[] args)
    {
        TextPrinter tp = new TextPrinter("Je print.");
        tp.printFilteredWords((String s) -> s.contains("e"));
    }
}
