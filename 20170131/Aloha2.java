import java.io.*;

public class Aloha2 {
	public static void main(String[] args) {
		
		String[] data = new String[100];
		Dataman dataman = new Dataman();
		Fileman fileman = new Fileman();

		dataman.inputData();
		dataman.saveData(data);

		fileman.writeFile(data);
	}
}


class Dataman {
	public Dataman(){
		System.out.println("Aloha,Dataman!");
		}
	}
	


class Fileman {
	public Fileman(){
		System.out.println("Aloha,Fileman");
	}

}