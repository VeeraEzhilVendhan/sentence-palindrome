import java.util.*;
class sentencepalindrome
{
	public static void main(String[] args)
	{
		Scanner ip=new Scanner(System.in);
		String k=ip.nextLine();
		k=k.replaceAll("\\s","").toLowerCase();
		String r="";
		for(int i=k.length()-1;i>=0;i--)
		{
			r=r+k.charAt(i);
		}
		if(r.equals(k)) System.out.println("Palindrome");
		else System.out.println("Not Palindrome");
	}
}