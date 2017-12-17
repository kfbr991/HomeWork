package Presentation.Pieces;

import Presentation.Square;

import java.util.ArrayList;
import java.util.List;

public class King implements IPiece
{
    private static short[] offset1 = new short[]{ -1, 1 };
    private static short[] offset2 = new short[]{ -1, 0, 1 };

    @Override
    public List<Square> getAllLegalSquares(Square current) {
        List<Square> squares = new ArrayList<>();
        Square helper;

        if(//Castling situation.
            (current.getFile() == 'E') && (current.getRank() == (short)1)
            ||
            (current.getFile() == 'D') && (current.getRank() == (short)8)
          )
        {
            squares.add(new Square((char)(current.getFile() + 2), current.getRank()));
            squares.add(new Square((char)(current.getFile() - 2), current.getRank()));
        }

        for(short i: offset1)
        {//Front and back moves(6).
            for(short j: offset2)
            {
                helper = new Square((char)(current.getFile() + j), (short)(current.getRank() + i));

                if (helper.isValid())
                {
                    squares.add(new Square(helper.getFile(), helper.getRank()));
                }
            }
        }

        for(short i: offset1)
        {//Left and right(2).
            helper = new Square((char)(current.getFile() + i), current.getRank());

            if (helper.isValid())
            {
                squares.add(new Square(helper.getFile(), helper.getRank()));
            }
        }

        return squares;
    }

    @Override
    public String getPieceName() {
        return "King";
    }
}
