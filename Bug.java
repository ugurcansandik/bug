public class Bug
{
    int initX = 1;
    int initY = 1;
    String initDirection = "EAST";
    int width = 5;
    int height = 5;
    
    public Bug(int initX, int initY, String initDirection, int width, int height)
    {
        this.initX = initX;
        this.initY = initY;
        this.initDirection = initDirection.toUpperCase();
        this.width = width;
        this.height = height;
        System.out.println(String.format("BUG CREATED: (%d, %d, %s)",this.width, this.height, this.initDirection));
        printBugMessage();
    }
    
    public void move()
    {
        System.out.println(String.format("BUG WILL TRY TO MOVE: (%d, %d, %s)",this.initX, this.initY, this.initDirection));
        switch(this.initDirection)
        {
            case "EAST":
                if (this.initX < this.width)
                {
                    this.initX++;
                }
                else
                {
                    System.out.println(String.format("The Bug can't move %s direction since it is outside the plane",this.initDirection));
                }
                break;
            case "WEST":
                if (this.initX > 1)
                {
                    this.initX--;
                }
                else
                {
                    System.out.println(String.format("The Bug can't move %s direction since it is outside the plane",this.initDirection));
                }
                break;
            case "NORTH":
                if (this.initY < 1)
                {
                    this.initY--;
                }
                else
                {
                    System.out.println(String.format("The Bug can't move %s direction since it is outside the plane",this.initDirection));
                }
                break;
            case "SOUTH":
                if (this.initY < this.height)
                {
                    this.initY++;
                }
                else
                {
                    System.out.println(String.format("The Bug can't move %s direction since it is outside the plane",this.initDirection));
                }
                break;
        }
        printBugMessage();
    }
    
    public void jump(int newX, int newY)
    {
        System.out.println(String.format("BUG WILL TRY TO JUMP TO (%d, %d): (%d, %d, %s)", newX, newY, this.initX, this.initY, this.initDirection));
        if ((newX < width && newX > 0) && (newY < height && newY > 0))
        {
            this.initX = newX;
            this.initY = newY;
        }
        else
        {
            System.out.println(String.format("The Bug can't jump to the location (%d,%d) since it is outside the plane", newX, newY));
        }
        printBugMessage();
    }
    
    public int getX()
    {
        return this.initX;
    }
    
    public int getY()
    {
        return this.initY;
    }
    
    public String getDirection()
    {
        return this.initDirection;
    }
    
    public void turnLeft()
    {
        System.out.println(String.format("BUG WILL TRY TO TURN LEFT: (%d, %d, %s)", this.initX, this.initY, this.initDirection));
        switch(this.initDirection)
        {
            case "EAST":
                this.initDirection = "NORTH";
                break;
            case "WEST":
                this.initDirection = "SOUTH";
                break;
            case "NORTH":
                this.initDirection = "WEST";
                break;
            case "SOUTH":
                this.initDirection = "EAST";
                break;
        }
        printBugMessage();
    }
    
    public void turnRight()
    {
        System.out.println(String.format("BUG WILL TRY TO TURN RIGHT: (%d, %d, %s)", this.initX, this.initY, this.initDirection));
        switch(this.initDirection)
        {
            case "EAST":
                this.initDirection = "SOUTH";
                break;
            case "WEST":
                this.initDirection = "NORTH";
                break;
            case "NORTH":
                this.initDirection = "EAST";
                break;
            case "SOUTH":
                this.initDirection = "WEST";
                break;
        }
        printBugMessage();
    }
    
    public void turnBack()
    {
        System.out.println(String.format("BUG WILL TRY TO TURN BACK: (%d, %d, %s)", this.initX, this.initY, this.initDirection));
        switch(this.initDirection)
        {
            case "EAST":
                this.initDirection = "WEST";
                break;
            case "WEST":
                this.initDirection = "EAST";
                break;
            case "NORTH":
                this.initDirection = "SOUTH";
                break;
            case "SOUTH":
                this.initDirection = "NORTH";
                break;
        }
        printBugMessage();
    }
    
    public void printBugMessage()
    {
     System.out.println( "BUG STATE" + ": ("  + this.getX() + ", " + this.getY() + ", " + this.getDirection() + ")");
    } 
}
