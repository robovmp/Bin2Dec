package com;


public class Bin2DecAppication {
	
	public static void main(String[] args ) {
		
		 String bin = javax.swing.JOptionPane.showInputDialog(
                 "Informe um numero em binario (somente 1s e 0s)");
		 try {
          javax.swing.JOptionPane.showMessageDialog( null, bin + " ==> " + String.valueOf( Integer.parseInt(bin, 2) ) );
		 }
		 catch (NumberFormatException e) {
          javax.swing.JOptionPane.showMessageDialog( null, bin + " nao eh binario nao..." );
		 }
		 System.exit(0);
		
	}

}
