import java.io.*;
public class CopyByteImage{
	public static void main(String[] args) {
		
FileInputStream inFile=null;
try{
	FileOutputStream outFile=new FileOutputStream("test.jpg");
	inFile =new FileInputStream("stock-photo-freedom-motorbike-under-sky-290736494.jpg");
	int data;
	while(( data=inFile.read())!=-1){
	outFile.write(data);
	//System.out.println(data);
}
	inFile.close();


}catch(IOException e){
	System.err.println("Error");
	System.exit(1);
}
}
}

