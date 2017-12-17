package week5.b;


import java.util.ArrayList;
import java.util.List;

public class Centi implements Xurda
{

    List<String> mxareebi;

    public Centi()
    {
        mxareebi = new ArrayList<>();

        mxareebi.add("Heads");
        mxareebi.add("Tales");
    }

    public Boolean IsCenti(Xurda a)
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
}
