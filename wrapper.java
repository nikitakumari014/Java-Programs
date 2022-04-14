import java.util.*;
public class wrapper {
    public static void main(String[]args)
    {
        String s;
        int d=0,l=0,sp=0,v=0;
        Scanner ob = new Scanner(System.in);
        s = ob.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            switch(ch)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U': ++v;
            }
            
            boolean b1,b2;
            b1 = Character.isDigit(ch);
            b2 = Character.isLetter(ch);
            if(b1)
            ++d;
            if(b2)
            ++l;
            if(!b1 && !b2)
            ++sp;
            

        }
        System.out.println("Number of digits: "+d);
        System.out.println("Number of alphabets: "+l);
        System.out.println("Number of special character: "+sp);
        System.out.println("Number of Vowels "+v);
        // System.out.println("Number of Words "+w);
        int w=1;
        for (int j = 0; j < s.length() - 1; j++)
        {
            if ((s.charAt(j) == ' ') && (s.charAt(j + 1) != ' '))
            {
                w++;
            }
        }
        System.out.println("Number of words: "+ w);
        
    }
}
