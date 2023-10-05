/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunia3_string4;

/**
 *
 * @author Kyrin
 */
public class Dunia3_String4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //method charAt();
	  String s = "Nama Saya Addin";
      char result = s.charAt(8);
      System.out.println(result);
	  System.out.println("---------------------------------");
	  
	  
	  //method compareTo();
	  System.out.println("Pengujian Method compareTo()");
	  String str1 = "Nama Saya Addin";
      String str2 = new String("Nama Saya Addin");
      String str3 = new String("Nama Saya bukan Addin");
      
      int result1 = str1.compareTo( str2 );
      System.out.println(result1);
      
      result1 = str2.compareTo( str3 );
      System.out.println(result1);
	  System.out.println("---------------------------------");
	  
	  //method compareToIgnoreCase()
	  System.out.println("method compareToIgnoreCase()");
	  int result2 = str1.compareToIgnoreCase( str2 );
      System.out.println(result2);

      result2 = str2.compareToIgnoreCase( str3 );
      System.out.println(result2);

      result2 = str3.compareToIgnoreCase( str1 );
      System.out.println(result2);
	  System.out.println("------------------------");
	  //method endsWith()
	  String x = new String("method endsWith()");
	  System.out.println(x);
	  String kata1 = new String("This is really not immutable!!");
      boolean retVal;

      retVal = kata1.endsWith( "immutable!!" );
      System.out.println("Returned Value = " + retVal );

      retVal = kata1.endsWith( "immu" );
      System.out.println("Returned Value = " + retVal );
	  System.out.println("------------------------");
	  
	  //method split()
	  String kata2 = new String("Selamat datang di Kampus STIKI");
      System.out.println("Return Value :" );      
      
      for (String retval1: kata2.split(" ")) {
         System.out.println(retval1);
      }
	}
}