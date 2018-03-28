package loesungJannesAlbers;

public class SpieleAusgabe extends Game {
	//Spielfeld ausgeben. Dies wird nach jedem Spielzug gemacht.
	   public static void feldausgeben() {
	      int temp = 0 ;
		   for (int reihe = 0; reihe < Game.feldgroesse+1; ++reihe) {
	         
	          for (int spaltel = 0; spaltel < feldgroesse; ++spaltel) {
	             if (spaltel <= feldgroesse) {
	             	System.out.print("----"); //Horizontale Linien zeichnen.
	             }
	          }
	          System.out.println();    	  
	    	  
	    	  for (int spalte = 0; spalte < feldgroesse; ++spalte) {
	        	if(temp < (feldgroesse)) {
	        		zelleninhalt(feld[reihe][spalte]); //Je nach Belegung im Array,  richtige Bezeichnung ausgeben. 
	                if (spalte < feldgroesse -1) {
	                   System.out.print("|");   // Vertikale Linien zeichnen.
	                }
	        	}
	    		
	         }
	         System.out.println();
	         temp ++ ; 
	      }
	      System.out.println();
	   }
	 
	   
	   
	   //Zelleninhalt für Spieler definieren. 
	   public static void zelleninhalt(int inhalt) {
	      switch (inhalt) {
	         case keinspieler:  System.out.print("   "); 
	         break;
	         case spieler2: System.out.print(" O "); 
	         break;
	         case spieler1:  System.out.print(" X "); 
	         break;
	      }
	   }
}
