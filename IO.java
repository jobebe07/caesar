/** 
*A short description : Class for simplified GUI Dialog  input of all variable types .....Getting GUI Dialog input 
*in java is a very tedious process ! This java
*class will help you to get all types of variables input from GUI Dialog with relatively ease. 
*All nine fundamental variable types are covered : byte, short,  int, long, float, double, char, String, and 
*boolean . It ignores appropiate input errors smartly. Copy this file to your project/java directory and 
*name it IO.java . Compile it using command : javac IO.java , and you are all done. In BlueJ
*Save the source file, then use the "Import Class" function in BlueJ to import this class into your project. 
*Then it can be used like any other class. Please see the use of this class and input methods in 
*testguinput.java class example below, if you enjoy my effort, let me know through e-mail !!!
* 
* Original Authors : Bruce Quig + Michael Kolling, version: 1.0, Date: 04.03.1999 
* @author (Modified and enhanced by Shirshasin Ghosh Of Naihati, West Bengal, India... shirsha@rediffmail.com )
* @author (Modified by Tino Hempel)
* @version (2.1: 6.3.2006)
*/

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.event.*;

public class IO {

/*    instance variables */
  private static final String FENSTER_TITEL = "Eingabe";
  private static final String STRING_TITLE = "Geben Sie eine Zeichenkette ein.";
  private static final String BYTE_TITLE = "Geben Sie eine ganze Zahl ein.";
  private static final String CHAR_TITLE = "Geben Sie ein Zeichen ein";
  private static final String SHORT_TITLE = "Geben Sie eine ganze Zahl ein";
  private static final String LONG_TITLE = "Geben Sie eine ganze Zahl ein";
  private static final String INT_TITLE = "Geben Sie eine ganze Zahl ein.";
  private static final String BOOLEAN_TITLE = "W?hlen Sie ja oder nein.";
  private static final String FLOAT_TITLE = "Geben Sie eine Dezimalzahl ein.";
  private static final String DOUBLE_TITLE = "Geben Sie eine Dezimalzahl ein";
  private static final String ERROR_TITLE = "Unzul?ssige Eingabe ";
  private static final String TRUE = "Ja";
  private static final String FALSE = "Nein";
  private static final String EMPTY_STRING = "";
  private static int i,  j ;
  private static String hold = "" ;
  private static boolean checkecc = false ;


/**
  * Eingabe vom Typ byte
  * @param prompt Hinweistext als String
  * @return byte Eingabe als Wert vom Typ byte
  */
public static byte getByte(String prompt)
{
  Object[] commentArray = {prompt, EMPTY_STRING, EMPTY_STRING};
  Object[] options = { "OK" };

  String inputValue = "";
  boolean validResponse = false;
  byte response = 0;
  while(!validResponse)
  {
    final JOptionPane optionPane = new JOptionPane(commentArray,
          JOptionPane.QUESTION_MESSAGE,
          JOptionPane.OK_CANCEL_OPTION,
          null,
          options,
          options[0]);

    optionPane.setWantsInput(true);
    final JDialog dialog = optionPane.createDialog(null, FENSTER_TITEL);

    dialog.pack();
    dialog.setVisible(true);

    String result = (String)optionPane.getInputValue();
    if ( checkecc ) result = convertwhole(result) ;
    try
    {
      response = Byte.parseByte(result);
      validResponse = true;
      dialog.dispose();
    }
    catch(NumberFormatException exception)
    {
      if(result.equals("uninitializedValue")) result = "";
      commentArray[1] = ERROR_TITLE+result;
      commentArray[2] = BYTE_TITLE;
    }
  }
  return response;
} /* End of getByte method */

/**
  * Eingabe vom Typ short
  * @param prompt Hinweistext als String
  * @return short Eingabe als Wert vom Typ short
  */
public static short getShort(String prompt)
{
  Object[] commentArray = {prompt, EMPTY_STRING, EMPTY_STRING};
  Object[] options = { "OK" };

  String inputValue = "";
  boolean validResponse = false;
  short response = 0;
  while(!validResponse)
  {
    final JOptionPane optionPane = new JOptionPane(commentArray,
          JOptionPane.QUESTION_MESSAGE,
          JOptionPane.OK_CANCEL_OPTION,
          null,
          options,
          options[0]);

    optionPane.setWantsInput(true);
    final JDialog dialog = optionPane.createDialog(null, FENSTER_TITEL);

    dialog.pack();
    dialog.setVisible(true);

    String result = (String)optionPane.getInputValue();
    if ( checkecc ) result = convertwhole(result) ;
    try
    {
      response = Short.parseShort(result);
      validResponse = true;
      dialog.dispose();
    }
    catch(NumberFormatException exception)
    {
      if(result.equals("uninitializedValue")) result = "";
      commentArray[1] = ERROR_TITLE+result;
      commentArray[2] = SHORT_TITLE;
    }
  }
  return response;
} /* End of getShort method */

/**
  * Eingabe vom Typ int
  * @param prompt Hinweistext als String
  * @return int Eingabe als Wert vom Typ int
  */
public static int getInt(String prompt)
{
  Object[] commentArray = {prompt, EMPTY_STRING, EMPTY_STRING};
  Object[] options = { "OK" };

  String inputValue = "";
  boolean validResponse = false;
  int response = 0;
  while(!validResponse)
  {
    final JOptionPane optionPane = new JOptionPane(commentArray,
          JOptionPane.QUESTION_MESSAGE,
          JOptionPane.OK_CANCEL_OPTION,
          null,
          options,
          options[0]);

    optionPane.setWantsInput(true);
    final JDialog dialog = optionPane.createDialog(null, FENSTER_TITEL);

    dialog.pack();
    dialog.setVisible(true);

    String result = (String)optionPane.getInputValue();
    if ( checkecc ) result = convertwhole(result) ;
    try
    {
      response = Integer.parseInt(result);
      validResponse = true;
      dialog.dispose();
    }
    catch(NumberFormatException exception)
    {
      if(result.equals("uninitializedValue")) result = "";
      commentArray[1] = ERROR_TITLE+result;
      commentArray[2] = INT_TITLE;
    }
  }
  return response;
} /* End of getInt method */

/**
  * Eingabe vom Typ long
  * @param prompt Hinweistext als String
  * @return long Eingabe als Wert vom Typ long
  */
public static long getLong(String prompt)
{
  Object[] commentArray = {prompt, EMPTY_STRING, EMPTY_STRING};
  Object[] options = { "OK" };

  String inputValue = "";
  boolean validResponse = false;
  long response = 0;
  while(!validResponse)
  {
    final JOptionPane optionPane = new JOptionPane(commentArray,
          JOptionPane.QUESTION_MESSAGE,
          JOptionPane.OK_CANCEL_OPTION,
          null,
          options,
          options[0]);

    optionPane.setWantsInput(true);
    final JDialog dialog = optionPane.createDialog(null, FENSTER_TITEL);

    dialog.pack();
    dialog.setVisible(true);

    String result = (String)optionPane.getInputValue();
    if ( checkecc ) result = convertwhole(result) ;
    try
    {
      response = Long.parseLong(result);
      validResponse = true;
      dialog.dispose();
    }
    catch(NumberFormatException exception)
    {
      if(result.equals("uninitializedValue")) result = "";
      commentArray[1] = ERROR_TITLE+result;
      commentArray[2] = LONG_TITLE;
    }
  }
    return response;
} /* End of getByte method */

/**
  * Eingabe vom Typ float
  * @param prompt Hinweistext als String
  * @return float Eingabe als Wert vom Typ float
  */
public static float getFloat(String prompt)
{
  Object[] commentArray = {prompt, EMPTY_STRING, EMPTY_STRING};
  Object[] options = { "OK" };

  String inputValue = "";
  boolean validResponse = false;
  float response = 0.0f;
  while(!validResponse)
  {
    final JOptionPane optionPane = new JOptionPane(commentArray,
          JOptionPane.QUESTION_MESSAGE,
          JOptionPane.OK_CANCEL_OPTION,
          null,
          options,
          options[0]);

    optionPane.setWantsInput(true);
    final JDialog dialog = optionPane.createDialog(null, FENSTER_TITEL);

    dialog.pack();
    dialog.setVisible(true);

    String result = (String)optionPane.getInputValue();
    if ( checkecc ) result = convertfrac(result) ;
    try
    {
      response = Float.parseFloat(result);
      validResponse = true;
      dialog.dispose();
    }
    catch(NumberFormatException exception)
    {
      if(result.equals("uninitializedValue")) result = "";
      commentArray[1] = ERROR_TITLE+result;
      commentArray[2] = FLOAT_TITLE;
    }
  }
  return response;
} /* End of getByte method */

/**
  * Eingabe vom Typ double
  * @param prompt Hinweistext als String
  * @return double Eingabe als Wert vom Typ double
  */
public static double getDouble(String prompt)
{
  Object[] commentArray = {prompt, EMPTY_STRING, EMPTY_STRING};
  Object[] options = { "OK" };

  String inputValue = "";
  boolean validResponse = false;
  double response = 0;
  while(!validResponse)
  {
    final JOptionPane optionPane = new JOptionPane(commentArray,
          JOptionPane.QUESTION_MESSAGE,
          JOptionPane.OK_CANCEL_OPTION,
          null,
          options,
          options[0]);

    optionPane.setWantsInput(true);
    final JDialog dialog = optionPane.createDialog(null, FENSTER_TITEL);

    dialog.pack();
    dialog.setVisible(true);

    String result = (String)optionPane.getInputValue();
    if ( checkecc ) result = convertfrac(result) ;
    try
    {
      response = Double.parseDouble(result);
      validResponse = true;
      dialog.dispose();
    }
    catch(NumberFormatException exception)
    {
      if(result.equals("uninitializedValue")) result = "";
      commentArray[1] = ERROR_TITLE+result;
      commentArray[2] = DOUBLE_TITLE;
    }
  }
  return response;
} /* End of getByte method */


/**
  * Eingabe vom Typ char
  * @param prompt Hinweistext als String
  * @return char Eingabe als Wert vom Typ char
  */
public static char getChar(String prompt)
{
  char response ='-';

  String result = null;

  Object[] commentArray = {prompt, EMPTY_STRING, EMPTY_STRING};
  Object[] options = { "OK" };

  String inputValue = "";
  boolean validResponse = false;

  while(!validResponse)
  {
    final JOptionPane optionPane = new JOptionPane(commentArray,
          JOptionPane.QUESTION_MESSAGE,
          JOptionPane.OK_CANCEL_OPTION,
          null,
          options,
          options[0]);

    optionPane.setWantsInput(true);
    final JDialog dialog = optionPane.createDialog(null, prompt);

    dialog.pack();
    dialog.setVisible(true);

    Object input = optionPane.getInputValue();
    if(input != JOptionPane.UNINITIALIZED_VALUE)
    {
      result = (String)input;
      if(result != null && result.length() == 1)
      {
        response = result.charAt(0);
        validResponse = true;
        dialog.dispose();
      }
      else
      {
        commentArray[1] = ERROR_TITLE + result;
        commentArray[2] = CHAR_TITLE;
      }
    }
    else
    {
      commentArray[1] = ERROR_TITLE + result;
      commentArray[2] = CHAR_TITLE;
    }
  }
  return response;
} /* End of getChar method */

/**
  * Eingabe vom Typ String
  * @param prompt Hinweistext als String
  * @return String Eingabe als Wert vom Typ String
  */
public static String getString(String prompt)
{
  Object[] commentArray = {prompt, EMPTY_STRING};
  Object[] options = { "OK" };

  String inputValue = "";
  boolean validResponse = false;

  String result = null;

  while(!validResponse)
  {
    final JOptionPane optionPane = new JOptionPane(commentArray,
          JOptionPane.QUESTION_MESSAGE,
          JOptionPane.OK_CANCEL_OPTION,
          null,
          options,
          options[0]);

    optionPane.setWantsInput(true);
    final JDialog dialog = optionPane.createDialog(null, FENSTER_TITEL);

    dialog.pack();
    dialog.setVisible(true);

    Object response = optionPane.getInputValue();

    if(response != JOptionPane.UNINITIALIZED_VALUE)
    {
      result = (String)response;
      validResponse = true;
      dialog.dispose();
    }
    else
    {
        commentArray[1] = ERROR_TITLE + result;
        commentArray[2] = STRING_TITLE;
    }
  }
  return result;
} /* End of getString method */

/**
  * Eingabe vom Typ boolean
  * @param prompt Hinweistext als String
  * @param trueText Text auf der True-Schaltfl?che
  * @param falseText Text auf der False-Schaltfl?che
  * @return boolean Eingabe als Wert vom Typ boolean
  */
public static boolean getBoolean(String prompt, String trueText, String falseText)
{
  Object[] commentArray = {prompt, EMPTY_STRING};
  boolean validResponse = false;
  int result = -1;

  while(!validResponse)
  {
    Object[] options = {trueText, falseText};
    result = JOptionPane.showOptionDialog(null,
             commentArray,
             FENSTER_TITEL,
             JOptionPane.YES_NO_OPTION,
             JOptionPane.QUESTION_MESSAGE,
             null, //don't use a custom Icon
             options, //the titles of buttons
             "Ja" ); //the title of the default button

    // check true or false buttons pressed
    if(result == 0 || result == 1) validResponse = true;
    else commentArray[1] = "unzul?ssige Auswahl: W?hlen Sie einen der beiden Schaltfl?chen.";
  }
  return (result == 0);
} /* End of getBoolean mehod */

/**
  * Eingabe vom Typ boolean
  * @param prompt Hinweistext als String
  * @return boolaen Eingabe als Wert vom Typ boolean
  */
public static boolean getBoolean(String prompt)
{ 
  return getBoolean(prompt, TRUE, FALSE);
} /* end of overloaded getBoolean method */


/* 10. A ECC-validate and triming/removing function */
   private static String convertfrac (String str1)
  {
    hold = "0" ;
    char t = ' ';
    str1 = str1.trim() ;
    i = str1.length() ;
    int count = 0 ;
    for ( j = 0 ; j < i ; j++ )
    {
      t = str1.charAt(j) ;
      if ( t == '.' ) count++ ;
      if ( ( Character.isDigit(t)  ||  ( t == '.') ) && ( count <= 1) ) hold = hold + t ;
    }
    return hold ;
  } /* End of convertfrac method */

  /* 11. Another ECC-validate and triming/removing function */
  private static String convertwhole (String str1)
  {
    str1 = str1.trim() ;
    i = str1.length() ;
    hold = "0" ;
    char t = ' ';
    for ( j = 0 ; j < i ; j++ )
    {
      t = str1.charAt(j) ;
      if ( Character.isDigit(t) ) hold = hold + t ;
      else if ( t == '.' ) return hold ;
    } return hold ;
  } /* End of convertwhole method */
                                        


/**
  * Festlegung des ECC-Mode
  * @param get (true or false) Standard: false
  */
public static void ecc( boolean get )
{ checkecc = get ; }

/**
  * Ausgabe einer Zeichenkette
  * @param prompt Hinweistext als String
  */
public static void show( String prompt )
{ JOptionPane.showMessageDialog(null, prompt) ; }

/**
  * Ausgabe einer Zeichenkette
  * @param prompt Hinweistext als String
  * @param heading Titel des Fensters als String
  */
public static void show( String prompt, String heading )
{ JOptionPane.showMessageDialog(null, prompt, heading, JOptionPane.INFORMATION_MESSAGE) ; }

} /* End of IO class */
