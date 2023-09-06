public class Caesar2 {
  
    public static void main(String[] args)  {
        String klartext = IO.getString("Bitte geben Sie den Klartext ein.");

        int k = IO.getInt("Bitte geben Sie den Schlüssel ein.");

        String geheimtext = Caesar2.encode(klartext, k);
        IO.show("Der Geheimtext lautet: " + geheimtext);
        IO.show("Der Klartext lautet: " + Caesar2.decode(geheimtext, k));
    }

    public static String encode(String text, int key) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String geheimtext = "";

        for (int i = 0; i < text.length(); i++){
            char buchstabe = text.charAt(i);
            
            int stelle = alphabet.indexOf(buchstabe);
            
            geheimtext = geheimtext + alphabet.charAt((stelle + key) % 26);
            
        }

        return geheimtext;
    }

    public static String decode(String geheimtext, int key) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String text = "";

        for (int i = 0; i < geheimtext.length(); i++){ // durchlaufen jedes buchstaben im geheimtext
            char buchstabe = geheimtext.charAt(i); // aktueller buchstabe
            
            int stelle = alphabet.indexOf(buchstabe); // index des buchstaben im alphabet

            if(stelle - key < 0) stelle += 26; // wenn über das alphabet hinaus (vor a) => index += 26
            
            text = text + alphabet.charAt(stelle - key); // dem text wird der entschlüsselte Buchstabe hinzugefügt
            
        }

        return text;
    }
}