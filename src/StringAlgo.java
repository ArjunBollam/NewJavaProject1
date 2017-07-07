import java.util.Scanner;

public class StringAlgo {
  public static void main(String[] args)
  {
	  Scanner sc = new Scanner(System.in);
	  String s1 = sc.nextLine();
	  String s2 = sc.nextLine();
	  int max = Math.max(s1.length(), s2.length());
	  char[] carr = new char[max];
	  int index = 0;
	  boolean found = false;
	  for(int i = 0;i<=s1.length()-1;i++)
	  {
		  
		 for(int j =0;j<=s2.length()-1;j++)
		 {
			 if(s1.charAt(i) == s2.charAt(j))
			 {
				 for(int z=0;z<=carr.length-1;z++)
				 {
					 if(s1.charAt(i)== carr[z])
					 {
						 found = true;
					 }
				 }
				 if(found == true)
				 {
					 break;
				 }
				 else{
					 carr[index++] = s1.charAt(i);
				 }
				// carr[index++] = s1.charAt(i);
			 }
		 }
	  }
	  for(int i = 0;i<carr.length-1;i++)
	  {
	  System.out.print(carr[i]);
	  }
	  
  }
}
