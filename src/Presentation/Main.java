package Presentation;

import java.io.File;
import java.io.FileNotFoundException;
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
        else if(!input[0].equalsIgnoreCase("King") && !input[0].equalsIgnoreCase("Knight") && !input[0].equalsIgnoreCase("Queen") && !input[0].equalsIgnoreCase("Bishop") && !input[0].equalsIgnoreCase("Rook") && !input[0].equalsIgnoreCase("Pawn"))
        {
            System.out.println("Unacceptable!!! First word must be one of supported Piece names.");
        }
        else if(!new Square(input[1].charAt(0), (short)(input[1].charAt(1) - '0')).isValid())
        {
            System.out.println("Unacceptable!!!  Second word must be in supported Square format.");
        }
        else
        {
            File file = new File("src/Presentation/GeneratorResult.txt");
            try
            {
                Scanner scanner = new Scanner(file);

                while (scanner.hasNext())
                {
                    String line = scanner.nextLine();

                    if(line.contains(input[0] + input[1]))
                    {
                        System.out.println(line.substring(input[0].length() + input[1].length()));
                    }
                }
            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
        }

    }
}
