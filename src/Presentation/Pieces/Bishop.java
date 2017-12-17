package Presentation.Pieces;

import Presentation.Square;
import java.util.ArrayList;
import java.util.List;

public class Bishop implements IPiece
{
    private static short[] offset = new short[]{-1, -2, -3, -4, -5, -6, -7, 1, 2, 3, 4, 5, 6, 7};

    @Override
    public List<Square> getAllLegalSquares(Square current)
    {
        List<Square> squares = new ArrayList<>();
        Square helper;

        for(short i = 0; i < 7; i++)
        {//left down from piece
            helper = new Square((char)(current.getFile() + offset[i]), (short)(current.getRank() + offset[i]));

            if(helper.isValid())
            {
                squares.add(new Square(helper.getFile(), helper.getRank()));
                continue;
            }
            break;
        }

        for(short i = 0; i < 7; i++)
        {//left up from piece.
            helper = new Square((char)(current.getFile() + offset[i]), (short)(current.getRank() - offset[i]));

            if(helper.isValid())
            {
                squares.add(new Square(helper.getFile(), helper.getRank()));
                continue;
            }
            break;
        }

        for(short i = 7; i < 14; i++)
        {//Right up from piece.
            helper = new Square((char)(current.getFile() + offset[i]), (short)(current.getRank() + offset[i]));

            if(helper.isValid())
            {
                squares.add(new Square(helper.getFile(), helper.getRank()));
                continue;
            }
            break;
        }

        for(short i = 7; i < 14; i++)
        {//Right down from piece.
            helper = new Square((char)(current.getFile() + offset[i]), (short)(current.getRank() - offset[i]));

            if(helper.isValid())
            {
                squares.add(new Square(helper.getFile(), helper.getRank()));
                continue;
            }
            break;
        }

        return squares;
    }

    @Override
    public String getPieceName()
    {
        return "Bishop";
    }
}
