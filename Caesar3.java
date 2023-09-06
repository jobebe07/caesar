public class Caesar3 {
  
    public static void main(String[] args)  {
        String klartext = IO.getString("Bitte geben Sie den Klartext ein.");
    
        int k = IO.getInt("Bitte geben Sie den Schlüssel ein.");
    
        String text = Caesar3.encode(klartext, k);
        IO.show("Der Geheimtext lautet: " + text);
        IO.show("Der Klartext lautet: " + Caesar3.decode(text, k));
    }

    public static String encode(String text, int key) {
        
        String geheimtext = "";
    
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            int stelle = (int) c; // umwandlung des char in seinen ASCII code
            
            if (stelle + key > 90) { // wird über z hinaus verschoben --> -26 fängt wieder bei a an (ASCII großb 65 - 90)
                geheimtext = geheimtext + ((char) (((stelle + key) - 26)));
            } else {
                geheimtext = geheimtext + ((char) (stelle + key));
            }      
        }

        return geheimtext;
    }

    public static String decode(String text, int usedKey) {
        String klartext = "";
    
        for (int i = 0; i < text.length(); i++) { // durchlaufen jedes buchstaben im geheimtext
            char c = text.charAt(i); // aktueller buchstabe
            
            int stelle = (int) c; // umwandlung des char in seinen ASCII code

            
            if (stelle + (-usedKey) < 65) { // wird über a hinaus verschoben --> +26 fängt wieder bei z an (ASCII großb 65 - 90)
                
                // zurückumwandlung von ASCII code int in buchstabe
                klartext = klartext + ((char) ((/*zurückverschieben*/(stelle + (-usedKey)) + 26)));
                
            } else {
                klartext = klartext + ((char) (stelle + (-usedKey)));
            }      
        }

        return klartext;
    }
}