import java.io.*;
public class ShowText{
	public static void main(String[] args) {
<<<<<<< HEAD
		String fileName = args[0];
=======
		String fileName=args[0];
>>>>>>> origin/master
		FileReader fr = null;
		BufferedReader in = null;

		System.out.println(fileName);
		try{
			fr = new FileReader(fileName);
			in = new BufferedReader(fr);
			while(true){
				String data =in.readLine();
				if(data==null)break;
				System.out.println(data);
			}
		}catch(IOException e){
			System.out.println("IO ERROR");
		}
		}
	   }
