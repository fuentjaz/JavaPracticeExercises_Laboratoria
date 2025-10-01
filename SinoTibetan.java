class SinoTibetanEj extends LanguageEj {
  SinoTibetanEj(String name, int numSpeakers) {
    super(name, numSpeakers, "Asia", "verb-object-subject");
    if (name.contains("Chinese")) { 
      wordOrder = "subject-verb-object";
    }
  }
}

public class SinoTibetan {
  public static void main(String[] args) {
    SinoTibetanEj chinese = new SinoTibetanEj("Mandarin Chinese", 6654573);
    SinoTibetanEj nonChinese = new SinoTibetanEj("Burmese", 4563784);
    chinese.getInfo();
    nonChinese.getInfo(); /* 
    Mandarin Chinese is spoken by 6654573 people mainly in Asia.
    The language follows the word order: subject-verb-object.
    Burmese is spoken by 4563784 people mainly in Asia.
    The language follows the word order: verb-object-subject.*/
  }
}