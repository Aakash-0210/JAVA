package file.com;

import java.io.*;

class ShoppingCart {
	void addItem(int price, String name) throws InterruptedException, IOException{
		FileOutputStream fos = new FileOutputStream("playlist.txt", true);	 // true
		 String data = price + " " + name + System.lineSeparator();
//		fos.wait(price);
		
		fos.write(data.getBytes());
		fos.flush();
		fos.close();
	}
}
public class FileDemo {
	static File file;
public static void main(String[] args) {
//	 file = new File("playlist.txt");
//	 try {
//		file.createNewFile();
//		FileWriter fw = new FileWriter("playlist.txt");
//		String s = "Hi, my name is solider boy...";
//		fw.write(s);
//		fw.flush();
//        fw.close();
//       
//        
//		
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//	 
//	 try {
//		FileReader fr = new FileReader("playlist.txt");
//		int x;
//		while ((x = fr.read()) != -1) {
//			System.out.print( (char)x );
//		}
////		System.out.println(fr);
//	} catch (Exception e) {
//		// TODO: handle exception
//	}
	
	 try {
		 ShoppingCart cart1 = new ShoppingCart();
		cart1.addItem(324323, " Mackbook");
		cart1.addItem(453, " book");
		cart1.addItem(2342, " tables");

		FileInputStream fis = new FileInputStream("playlist.txt");
		int x;
		while((x = fis.read()) != -1) {
			
			System.out.print((char)x);
		}
		
	} catch (InterruptedException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
