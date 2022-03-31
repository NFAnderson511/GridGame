import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int xSize = 20;
        int ySize = 20;
        int yCenter = ySize/2;
        int xCenter = xSize/2;
        System.out.print("Enter X Coordinate: ");
        int xPos = keyboard.nextInt();
        while(xPos > xSize)
        {
            System.out.print("Try Again: ");
            xPos = keyboard.nextInt();
        }
            System.out.print("Enter Y Coordinate: ");
        int yPos = keyboard.nextInt();
        while(yPos > ySize)
        {
            System.out.print("Try Again: ");
            yPos = keyboard.nextInt();
        }
        for(int y = 0; y <= ySize; y++)
        {
            for(int x = 0; x <= xSize; x++)
            {
                if(x == xCenter && y == yCenter)
                {
                    System.out.print("+ ");
                }
                else if(y == yCenter - yPos && x == xCenter + xPos)
                {
                    System.out.print("X ");
                }
                else if(x == xCenter)
                {
                    System.out.print("| ");
                }
                else if(y == yCenter)
                {
                    System.out.print("- ");
                }
                else
                {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
