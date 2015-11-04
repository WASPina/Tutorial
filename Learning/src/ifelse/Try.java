package ifelse;


	import java.io.*;

	public class Try
	{
	    public static void main(String[] args) throws Exception
	    {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    String a = reader.readLine();
	    String b = reader.readLine();
	    String c = reader.readLine();
	   
	    int a1 = Integer.parseInt(a);
	    int b1 = Integer.parseInt(b);
	    int c1 = Integer.parseInt(c);
	    
	   // int m1, m2;
	    if (a1<=b1&&a1<=c1) { 
	    	System.out.print(a1+ " ");
	    	if (b1<=c1)
	    		System.out.print(b1 + " " +c1);
	    	else
	    		System.out.print(c1 + " " +b1);
	    }
	    else if (b1<=a1&&b1<=c1){
	    	System.out.print(b1+" ");
	    	if (a1<=c1)
	    		System.out.print(a1 + " " +c1);
	    	else
	    		System.out.print(c1 + " " +a1);
	    }
	    else if (c1<=a1&&c1<=b1){
	    	System.out.print(c1+ " ");
	    	if (b1<=a1)
	    		System.out.print(b1 + " " +a1);
	    	else
	    		System.out.print(a1 + " " +b1);
	    }
	    	    }
	}

