import java.util.*;
class binaryexception extends Exception{
	binaryexception(String str)
	{
		super(str);
	}
}
class patterns
{
	public int check_patterns(String str)
	{
		char start = str.charAt(0);
		int count=0;
		int i=1;
		try{
			char ch;
			for(int j=0;j<str.length();j++)
			{
				ch = str.charAt(j);
				if(!(ch=='0' || ch=='1'))
				throw new binaryexception("Number should be binary!");
			}
		while(i<str.length())
		{
			if(str.charAt(i)=='1' && start=='0')
			{
				while(str.charAt(i)=='1')
				i++;
				if(str.charAt(i)=='0')
				{
					count++;
					start = str.charAt(i);
					i++;
				}
			}
			else{
				start = str.charAt(i);
				i++;
			}
		}
		return count;
	}
	catch(binaryexception b)
	{
		System.out.println(b.getMessage());
		return -1;
	}
	}
	public static void main(String[]args)
	{
		patterns p = new patterns();
		String num;
		System.out.println("Enter a binary string: ");
		Scanner s = new Scanner(System.in);
		num = s.next();
		int count = p.check_patterns(num);
		System.out.println("Count = "+ count);
	}
}