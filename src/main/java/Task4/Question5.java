package Task4;

public class Question5 {

	public static void main(String[] args) {
   
 int a;
 int b=0;
 int c=7;   
 int flag=0;      
 b=c/2;      
if(c==0||c==1)
{  
  System.out.println(c+" is not prime number");      
}
else
{  
 for(a=2;a<=b;a++)
 {      
 if(c%a==0)
 {      
  System.out.println(c+" is not prime number");      
  flag=1;      
 break;      
}      
}      
if(flag==0)  
{ 
	System.out.println(c+" is prime number"); 
	}  
}  
			
	}    
	
}
