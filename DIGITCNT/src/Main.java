import java.util.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner a = new Scanner(System.in);
        int t = a.nextInt();
        while(t-- > 0){
            StringBuilder s = a.next();
            System.out.println(s.length());
        }
    }
}