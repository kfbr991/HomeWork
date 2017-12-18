package Presentation;

import Presentation.Pieces.*;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class Generator
{
    public static void generate()
    {
        List<IPiece> pieces = new ArrayList<>();

        pieces.add(new Bishop());
        pieces.add(new King());
        pieces.add(new Knight());
        pieces.add(new Pawn());
        pieces.add(new Queen());
        pieces.add(new Rook());

        try
        {
            PrintWriter writer = new PrintWriter("src/Presentation/GeneratorResult.txt", "UTF-8");

            for (IPiece piece: pieces)
            {
                for (short i = 0; i < 64; i++)
                {
                    Square square = new Square(i);
                    writer.println(piece.getPieceName().name() + square.toString() + piece.getAllLegalSquares(square).toString());
                }
            }

            writer.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
    }
}
