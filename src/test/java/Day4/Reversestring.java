package Day4;

public class Reversestring {
	public static void main(String[] args) {
		
		String origstring="I like Java";
		String revstring="";
		for (int i=0;i<origstring.length();i++)
		{
			revstring=origstring.charAt(i)+revstring;
	
		}
		System.out.println("reversed string: "+revstring);
		String x = "Hello";
		String x1 = new String("Hello");
		x.equals(x1);
	}

}
