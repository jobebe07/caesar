public class Caesar1 {
  
    public static void main(String[] args) {
        String klartext = IO.getString("Bitte geben Sie den Klartext ohne Sonderlaute in GROßBUCHSTABEN ein.");
        
        int k = IO.getInt("Bitte geben Sie die Schlüssellänge an.");
        
        String geheimtext = Caesar1.encode(klartext, k);
        
        IO.show(geheimtext); 
        IO.show("Der Klartext lautet: " + Caesar1.decode(geheimtext, k));  
    }

    public static String encode(String text, int key) {
        String klartextalphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        String geheimtextalphabet = klartextalphabet.substring(key) + klartextalphabet.substring(0, key);
        
        String geheimtext = "";
        
        for (int i=0; i < text.length(); i++) {
            char buchstabe = text.charAt(i);
            int stelle = klartextalphabet.indexOf(buchstabe);
            geheimtext = geheimtext + geheimtextalphabet.charAt(stelle);
        }

        return geheimtext;
    }

    public static String decode(String geheimText, int usedKey) {
        String klartextalphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int index = klartextalphabet.length()-(usedKey);

        String geheimtextalphabet = klartextalphabet.substring(index) + klartextalphabet.substring(0, index);

        System.out.println(geheimtextalphabet);
        
        String geheimtext = "";
        
        for (int i=0; i < geheimText.length(); i++) {
            char buchstabe = geheimText.charAt(i);
            int stelle = klartextalphabet.indexOf(buchstabe);
            geheimtext = geheimtext + geheimtextalphabet.charAt(stelle);
        }

        return geheimtext;
    }
}
