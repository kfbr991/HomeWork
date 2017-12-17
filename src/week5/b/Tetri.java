package week5.b;


import java.util.ArrayList;
import java.util.List;

public class Tetri implements Xurda
{

    List<String> mxareebi;

    public Tetri()
    {
        mxareebi = new ArrayList<>();

        mxareebi.add("arioli");
        mxareebi.add("reshka");
    }

    public Boolean IsTetri(Xurda a)
    {
        if(a.getClass() == this.getClass())
        {
            return true;
        }
        return  false;
    }

    @Override
    public String agdeba()
    {
        return mxareebi.get((int)(Math.round(Math.random()*10)) % 2);
    }

    public static void main(String[] args)
    {
        Tetri a = new Tetri();
        Centi b = new Centi();

        System.out.println(a.agdeba());

        System.out.println("Xurda a(Tetri) aris Tetri? " + a.IsTetri(a));

        System.out.println("Xurda b(Centi) aris Tetri? " + a.IsTetri(b));
    }
}
