package Presentation;

public class Square
{
    private char file;
    private short rank;

    public Square()
    {
        this.file = 'A';
        this.rank = 1;
    }

    public Square(char file, short rank)
    {
        this.file = file;
        this.rank = rank;
    }

    public Square(short n)
    {
        this.file = (char)('A' + (n % 8));
        this.rank = (short)(1 + (n / 8));
    }

    @Override
    public String toString()
    {
        return (this.file + "" + this.rank);
    }

    public char getFile()
    {
        return file;
    }

    public void setFile(char file)
    {
        this.file = file;
    }

    public short getRank()
    {
        return rank;
    }

    public void setRank(short rank)
    {
        this.rank = rank;
    }

    public boolean isValid()
    {
        return((this.file >= 'A' && this.file <= 'H') && (this.rank >= (short)1 && this.rank <= (short)8));
    }

    public boolean equals(Square a)
    {
        return  (this.file == a.file && this.rank == a.rank);
    }

    public int toInt()
    {
        return((this.file - 'A') + ((this.rank - 1) * 8));
    }
}
