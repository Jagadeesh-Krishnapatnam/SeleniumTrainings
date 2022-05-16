
import java.util.*;

public class Demo {
	//boolean flag = false;
	//int i;
	public static void main(String[] args)
	{
		//System.out.println("Hello");
		String primeno = " ";		
		System.out.println("Enter the Input");		
		Scanner sc = new Scanner(System.in);
		//int input = sc.nextInt();
		//chk_prime(input);
		//Findmissingno();
		//prime_All(input);
		String sip = sc.nextLine();
		sc.close();
		//splitstring(sip);
		//String_reverse(sip);
		//sum(input);
		//Fibanocci(input);
		//Factorial(input);
		//Swapping();
		//collections();
		//StringReverse_usingCharAt(sip);
		//StringReverse_usingStringBuilder(sip);
		//String_OnlyAlpha(sip);
		//DuplicateChar(sip);
		DuplicateWords(sip);
		
	}
	
	public static void chk_prime(int ip)
	{
		int number,i;
		boolean flag = false;
		number = ip;
		
		for(i=2; i<= number/2; ++i)
		{
			
			if(number%2==0)
				flag = true;
				break;
		}
		
		if(!flag)
		{
			System.out.println("Entered no is a Prime Number");
		} else 
			System.out.println("Entered no "+number+" is NOT a Prime Number");
	}

   public static void Findmissingno()
   {
	   int a[] = {1,5,3,6,2,4,8,7,10,9,12};
	   
	   System.out.println("Entered Numbers in the Array are\n");
	   for(int op : a)
		   System.out.println(op);
	   
	   
	   int n = a.length;
	   
	  int sum1 = ((n+1) * (n+2))/2;
	  System.out.println(sum1); 
	  
	  for(int i=0;i<n;i++)
	  {
		  sum1 = sum1-a[i]; 
	  }
	  
	  System.out.println("Missing number is \n"+sum1);
	   
   }
   
   public static void prime_All(int ip)
   {
	   int range = ip;

	   int i =0;
	   int num =0;
	   String primeno = " ";
	  
	  // System.out.println(range);
	   
	   
	   for(i=1;i<= range; i++)
	   {
		   int counter = 0;
		   
		   for(num=i;num>=1;num--)
		   {
			   
			   if(i%num == 0)
			   {
				   counter = counter + 1;
			   }
				   
		   }   
		   
		   if(counter == 2)
		   {			   			 
			primeno = primeno + i + " ";			   			   
		   }
	   }
	   
	 //  System.out.println(counter);
	   System.out.println("Prime numbers are\n");
	   System.out.println(primeno);
	   
   }
   
   public static void splitstring(String ip)
   {
	   String txt = ip;
	   
	   String[] a = txt.split(" ");
	   for(String op : a)
		   System.out.println(op);
	   
   }
   
   public static void String_reverse(String ip)
   {
	   String txt = ip;
	   char rev[] = txt.toCharArray();
	   
//	   for(char o : rev)
	   System.out.println(rev.length);
	   
	   for(int i = rev.length-1;i>=0;i--)
	   System.out.println(rev[i]);
   }
   
   public static void sum(int ip)
   {
	   int value = ip;
	   int sum = 0;
	  // System.out.println(value);
	   
	   //for(int i =0;i<=value; i++)
		while(value!=0)   
	   {
		   sum = sum + (value%10);
		   value = value/10;
				   
		 //  sum = sum + i;
		   //System.out.println(i);
	   }
	   
	   System.out.println("Sum of numbers entered are  > "+sum);
   }

   public static void Fibanocci(int ip)   
   {
	   int v1=ip;
	   int n1 =0, n2 = 1,n3=0,i;
	   System.out.println(+n1+" "+n2);	   
	   for(i=2;i<v1;i++) 
	   {
		   	n3 = n1+n2;
	   		n1 = n2;
	   		n2 = n3;
	   		
	   		System.out.println("  "+n3);
	   }				   	   
   }

   public static void Factorial(int ip)
   {
	   int v1 = ip,fact =1,tab=1;
	   System.out.println(v1);
	   
	   for(int i=1;i<=ip;i++)
	   {
		   fact = fact*i;	 // Factorial
		 
		   
		  /* tab = v1 * i; // Tables
		   System.out.println(tab); 
		   */	   
	   }
	   
	   System.out.println(fact); // printing factorial
   }

   public static void Swapping()
   {
	   int x = 7, y = 9, temp =0;
	   
	   //Using Temp Variable
	   temp = x;
	   x=y;
	   y=temp;
	   
	   // Without using any TEMP Variable
//	   x = x+y;
//	   y = x-y;
//	   x = x-y;
	   
	   System.out.println("X >"+x);
	   System.out.println("Y >"+y);
   }
   
   public static void collections()
   {
	  List<String> li = new ArrayList<String>();
	  li.add("jag");
	  li.add("sruja");
	  li.add("Navi");
	  
	  //System.out.println(li);
	  
	  Iterator op= li.iterator();  
	  	while(op.hasNext())
		  System.out.println(op.next());
		  
	  
   }
   
   public static void StringReverse_usingCharAt(String sc)
   {
	   String input = sc;
	   char ch;
	   String nstr =" ";
	   for(int i=0;i<input.length();i++)
	   {
		    ch = input.charAt(i);
		    nstr = ch+nstr;
	   }
		System.out.println(nstr);	   
			   
   }
   
   public static void StringReverse_usingStringBuilder(String sc)
   {
	   String input = sc;
	   StringBuilder ip = new StringBuilder();
	   ip.append(input);
	   ip.reverse();
	   
	   System.out.println(ip);	   
			   
   }
   
   public static void String_OnlyAlpha(String sc)

   {
	   String input = sc;
	   //String op = input.replaceAll("[^A-za-z]",""); //if we want only ALPHABETS from A-Z & a-z
	   String op = input.replaceAll("[^0-9]","");  // if we want only Numbers
	   
	   
	   System.out.println(op);	   
			   
   }
   
   public static void DuplicateChar(String sc)

   {
	   String input = sc;
	  int i,j = 0;
	  int count ;
	  char ch = ' ';
	  
	  char[] str = input.toCharArray();
	  
	  for(i=0;i<str.length;i++)
	  {
		  count = 1;
		  
		   //ch = input.charAt(i);
		  for(j=i+1;j<str.length;j++)
		  {
			if(str[i]==str[j] && str[i]!=' ')
			{
				
				count++;
				str[j] = 'O';
			}
			
		  }
		  
		  if(count > 1 && str[i]!='O')
			 
			  System.out.println("Duplicate characters are "+str[i]+"\t count :"+count);
		  
		   
		   System.out.println("");	
	  }
	   
	     
			   
   }

   public static void DuplicateWords(String sc)
   {
	   
	   String input = sc;
	   int i, j;
	   char c;
	   int count = 0;
	   
	   input = sc.toLowerCase();
	   String str[] = input.split(" ");
	   
	   
	   for(i=0;i<str.length;i++)
	   {
		   count =1;
	   
	   	for(j=i+1;j<str.length;j++)
	   	{
	   		if(str[i].equals(str[j]))
	   		{
	   			count++;
	   			str[j]="Z";
	   		}
	   	}
	   
	   	if(count>1 && str[i]!="Z")
	   		System.out.println("Repeated Words are : "+str[i]+"\n Count :"+count);
	   }
   } 
   
   
   
   
   
   
}


