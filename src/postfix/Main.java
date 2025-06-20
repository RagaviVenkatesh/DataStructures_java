package postfix;

import java.util.Scanner;

public class Main {

	// 6 4 1 / 3 + *
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Stack stack = new Stack();
	    String s = sc.nextLine();
	    for(int i=0;i<s.length();i++)
	    {
	        if(s.charAt(i)>='0' && s.charAt(i)<='9')
	        {
	            int ch = (int)(s.charAt(i))-48;
	            stack.push(ch);
	        }
	        else
	        {
	            int p1 = stack.pop();
	            int p2 = stack.pop();
	            switch(s.charAt(i))
	            {
	                case '+': stack.push(p1+p2);break;
	                case '-': stack.push(p2-p1);break;
	                case '*': stack.push(p1*p2);break;
	                case '/': stack.push(p2/p1);break;
	            }
	        }
	    }
	    System.out.print(stack.pop());

	}

}
