package Presentation.Pieces;

import Presentation.Square;

import java.util.ArrayList;
import java.util.List;

public class Knight implements IPiece
{
    private static short[] offset1 = new short[] { -1, 1 };
    private static short[] offset2 = new short[] { -2, 2 };

    @Override
    public List<Square> getAllLegalSquares(Square current)
    {
        List<Square> squares = new ArrayList<>();
        Square helper;

        for(short j: offset2)
        {
            for(short i: offset1)
            {
                helper = new Square((char)(current.getFile() + i), (short)(current.getRank() + j));

                if (helper.isValid())
                {
                    squares.add(new Square(helper.getFile(), helper.getRank()));
                }
            }
        }

        for(short i: offset2)
        {//switched i with j.
            for(short j: offset1)
            {
                helper = new Square((char)(current.getFile() + i), (short)(current.getRank() + j));

                if (helper.isValid())
                {
                    squares.add(new Square(helper.getFile(), helper.getRank()));
                }
            }
        }

        return squares;
    }

    @Override
    public String getPieceName() {
        return "Knight";
    }
}
