
public class TestChessBoard
{
    public static void main(String[]args)
    {
        ChessBoard c = new ChessBoard();
        SimpleFactory sf = new SimpleFactory();
        c = sf.createBoard();
        System.out.print(c);
    }
}
