package com;


public class Bin2DecAppication {
	
	public static void main( String[] args ) {
		
		 String bin = javax.swing.JOptionPane.showInputDialog(
                 "Informe um número em binário (Exemplo: 010101...): ");
		 try {
          		javax.swing.JOptionPane.showMessageDialog( null, bin + " ==> " + String.valueOf( Integer.parseInt(bin, 2) ) );
		 }
		 catch ( NumberFormatException e ) {
         		 javax.swing.JOptionPane.showMessageDialog( null, bin + " Este não é um número binário..." );
		 }
		 System.exit( 0 );
		
	}

}
