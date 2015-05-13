package listator;

import java.io.File;

import javax.swing.JOptionPane;

public class BuscaPasta {
	static String diretorio; 
	public static void main(String[] args) {
		
		diretorio= JOptionPane.showInputDialog(null,"Coloque o diretorio aqui");
		
		
	File file = new File(diretorio); 
		File files[] = file.listFiles(); 
		int i = 0; 
		
		
		for (int j = files.length; i < j; i++) { 
		File arquivos = files[i]; 
		//JOptionPane.showMessageDialog(null, arquivos.getName());
		System.out.println(arquivos.getName());
		}
	
	}
}
