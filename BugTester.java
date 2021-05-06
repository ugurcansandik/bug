import java.util.Scanner;

public class BugTester
{
    public static void main(String[] args)
	{
	    String choice = "";
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Please create a bug.(e.g, create EAST 4 7)");
	    scanner.next();
	    Bug bug = new Bug(1, 1, scanner.next(), scanner.nextInt(), scanner.nextInt());
		while(true)
		{
		    choice = scanner.next();
		    switch(choice)
		    {
	            case "move":
                    bug.move();
	                break;
                case "jump":
                    bug.jump(scanner.nextInt(), scanner.nextInt());
	                break;
                case "turnRight":
                    bug.turnRight();
                    break;
                case "turnLeft":
                    bug.turnLeft();
                    break;
                case "turnBack":
                    bug.turnBack();
                    break;
		    }
		}
	}
}
