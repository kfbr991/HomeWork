package Presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("This program will tell you all possible squares for a chess piece to move to, given that the current square is provided.");

        System.out.println("Acceptable Pieces: King, Knight, Queen, Rook, Bishop, Pawn.");

        System.out.println("Acceptable Square format: A1, A2, ..., G6, ..., H8.");

        System.out.println("Full input example on next line:");

        System.out.println("Knight B3");

        System.out.println("Please input the piece name and current square:");

        String[] input = scanner.nextLine().split(" ");

        if(input.length != 2)
        {
            System.out.println("Unacceptable!!! Input must contain 1 space.");
        }
        else if(!input[0].equals("King") && !input[0].equals("Knight") && !input[0].equals("Queen") && !input[0].equals("Bishop") && !input[0].equals("Rook") && !input[0].equals("Pawn"))
        {
            System.out.println("Unacceptable!!! First word must be one of supported Piece names.");
        }
        else if(!new Square(input[1].charAt(0), (short)(input[1].charAt(1) - '0')).isValid())
        {
            System.out.println("Unacceptable!!!  Second word must be in supported Square format.");
        }
        else
        {
            /*reading from the txt file
            try
            {
                List<String> genRes = Files.readAllLines(Paths.get("src/Presentation", "GeneratorResult.txt"));

                Square square = new Square(input[1].charAt(0), (short)(input[1].charAt(1) - '0'));

                int i = (PieceName.valueOf(input[0]).ordinal() * 64) + square.toInt();

                String res = genRes.get(i);

                System.out.println(res.substring(input[0].length() + input[1].length()));
            } catch (IOException e)
            {
                e.printStackTrace();
            }*/

            GenResStrArr a = new GenResStrArr();
            Square square = new Square(input[1].charAt(0), (short)(input[1].charAt(1) - '0'));


            System.out.println(a.getAtId((PieceName.valueOf(input[0]).ordinal() * 64) + square.toInt()));
        }
    }
}
