package Day9.mcq;
// output??
public class Example3 {
	public static void main(String args[]) 
    {        
         int x = 2;
         int y = 0;
         for ( ; y < 10; ++y) 
         {
             if (y % x == 0) 
                 continue;  
             else if (y == 8)
                  break;
             else
                System.out.print(y + " ");
         }
    } 
}
