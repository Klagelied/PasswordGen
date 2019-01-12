package sample;

public class Password {
    //Replace Zahlen mit Ziffern zb. Zehn == 10;

    private String usPW;

    public Password(String usPW) {
        this.usPW = usPW;
    }

    public String getUsPW() {
        return usPW;
    }

    public void setUsPW(String usPW) {
        this.usPW = usPW;
    }

    public String acronymGenerator(String unshortenedPW) {

        //Erster Buchstabe von beginnendem Wort
        //Bei Leerzeichen ist das Wort zu ende
        //Regel: Erster Char des ersten Wortes und jeder erster Char nach einem Leerzeichen.

        //char[] array = unshortenedPW.toCharArray();

        String correctPW = "";
        String[] banana = unshortenedPW.split(" ");

        for (int i = 0; banana.length > i; i++) {
            char[] shortened = new char[banana.length];

            shortened[i] = banana[i].charAt(0);
            correctPW = correctPW + new String(shortened);
        }
        return correctPW;


    }

}
