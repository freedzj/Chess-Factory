
public class SimpleFactory
{
    public ChessBoard b;
    
    public ChessBoard createBoard()
    {
        b = new ChessBoard();
        String s = "RkBKQkR";
        Character c;
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                b.board[i][j].color = "B";
                c = s.charAt(j);
                b.board[i][j].name = c.toString();
            }
            for(int x = 6; x < 8; x++)
            {
                for(int y = 0; y < 8; y++)
                {
                    b.board[x][y].color = "W";
                    c = s.charAt(y);
                    b.board[x][y].name = c.toString();
                }
            }
        }
        return b;
    }
}
