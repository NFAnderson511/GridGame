import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int size = 20;
        System.out.print("Enter X Coordinate: ");
        int xPos = keyboard.nextInt();
        while(xPos > size)
        {
            System.out.print("Try Again: ");
            xPos = keyboard.nextInt();
        }
        int yPos = keyboard.nextInt();
        while(yPos > size)
        {
            System.out.print("Try Again: ");
            yPos = keyboard.nextInt();
        }
        for(int y = 0; y <= size; y++)
        {
            for(int x = 0; x <= size; x++)
            {
                if(x == size/2 && y == size/2)
                {
                    System.out.print("+");
                }
                else if(x == size/2)
                {
                    System.out.print("|");
                }
                else if(y == size/2)
                {
                    System.out.print("-");
                }
                else if(y == yPos && x == xPos)
                {
                    System.out.print("X");
                }
                else
                {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
