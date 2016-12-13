public class Aloha{
	public static void main(String[] args) {
		while(true){
			// System.out.println("input data>");
			System.out.println("input name >");
			String name=new java.util.Scanner(System.in).nextLine();
			
			if(name.equals("exit")){
				System.out.println("おわりました");
				break;
			}
			System.out.println(name);
	}
	}
  }
  