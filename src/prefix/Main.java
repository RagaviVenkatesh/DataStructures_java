package prefix;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Stack stack = new Stack();
	    String s = sc.nextLine();
	    String s1="";
	    for(int i=s.length()-1;i>=0;i--)
	    {
	        s1+=s.charAt(i);
	    }
	    System.out.println(s1);
	    for(int i=0;i<s1.length();i++)
	    {
	        if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
	        {
	            double ch = (double)(s1.charAt(i))-48;
	            System.out.println(ch);
	            stack.push(ch);
	        }
	        else
	        {
	            double p1 = stack.pop();
	            double p2 = stack.pop();
	            switch(s1.charAt(i))
	            {
	                case '+': stack.push(p1+p2);break;
	                case '-': stack.push(p2-p1);break;
	                case '*': stack.push(p1*p2);break;
	                case '/': stack.push(p2/p1);break;
	            }
	        }
	    }
	}

}
