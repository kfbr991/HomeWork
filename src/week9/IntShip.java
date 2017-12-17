package week9;

public class IntShip
{
    private int curInt;

    public IntShip()
    {
        curInt = 0;
    }

    public IntShip(int i)
    {
        curInt = i;
    }

    public int getCurInt()
    {
        return curInt;
    }

    public void setCurInt(int curInt)
    {
        this.curInt = curInt;
    }

    public Boolean gotHit(int i)
    {
        return curInt == i;
    }
}
