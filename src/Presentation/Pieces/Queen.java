package Presentation.Pieces;

import Presentation.PieceName;
import Presentation.Square;

import java.util.List;

public class Queen implements IPiece
{

    @Override
    public List<Square> getAllLegalSquares(Square current)
    {
        Rook r = new Rook();
        Bishop b = new Bishop();

        List<Square> queenSquares = r.getAllLegalSquares(current);
        queenSquares.addAll(b.getAllLegalSquares(current));

        return queenSquares;
    }

    @Override
    public PieceName getPieceName() {
        return PieceName.Queen;
    }
}
