package be.intecbrussel.hoofdstuk18;

public class TextPrinter
{
    private String phrase;

    public TextPrinter(String phraseParam)
    {
        this.phrase = phraseParam;
    }

    public void printFilteredWords(WordFilter filter)
    {
        for (String w: phrase.split(" "))
        {
          if (filter.isValid(w))
          {
              System.out.println(w);
          }
        }
    }
}
