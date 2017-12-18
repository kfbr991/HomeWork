package Presentation.Pieces;

import Presentation.PieceName;
import Presentation.Square;

import java.util.ArrayList;
import java.util.List;

public class Pawn implements IPiece
{
    private static short[] fileOffset = new short[]{ -1, 0 ,1 };
    private static short[] rankOffset = new short[]{-1, 1};

    @Override
    public List<Square> getAllLegalSquares(Square current)
    {
        List<Square> squares = new ArrayList<>();
        Square helper;

        if(current.getRank() == 2 || current.getRank() == 7)
        {
            for(short r: rankOffset)
            {
                helper = new Square(current.getFile(), (short)(current.getRank() + 2 * r));

                if(helper.isValid())
                {
                    squares.add(new Square(helper.getFile(), helper.getRank()));
                }
            }
        }

        for (short r: rankOffset)
        {
            for(short f: fileOffset)
            {
                helper = new Square((char)(current.getFile() + f), (short)(current.getRank() + r));

                if(helper.isValid())
                {
                    squares.add(new Square(helper.getFile(), helper.getRank()));
                }
            }
        }

        return  squares;
    }

    @Override
    public PieceName getPieceName() {
        return PieceName.Pawn;
    }
}
