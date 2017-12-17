package Presentation.Pieces;

import Presentation.Square;
import java.util.List;

public interface IPiece
{
    List<Square> getAllLegalSquares(Square current);

    String getPieceName();
}
