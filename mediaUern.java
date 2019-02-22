/*
exemplo de media da uern
*/

import javax.swing.JOptionPane;

public class Media{

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, media;

		nota1=Double.parseDouble(JOptionPane.showImputDialog("Digite a nota 1: "));
		nota2=Double.parseDouble(JOptionPane.showImputDialog("Digite a nota 2: "));
		nota3=Double.parseDouble(JOptionPane.showImputDialog("Digite a nota 3: "));

		media = (nota1*4 + nota2*5 + nota3*6)/15;

		JOptionPane.showMessageDialog(null, "Média: " + media);


	}

}