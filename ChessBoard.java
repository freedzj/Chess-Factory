
public class ChessBoard
{
    public ChessPiece[][] board;
    public ChessPieceFactory cpf;
    
    public ChessBoard()
    {
        board = new ChessPiece[8][8];
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                board[i][j] = cpf.createPiece(" ", " ");

            }
        }
        
       
    }
    
    public void put(int i, int j, ChessPiece cp)
    {
        board[i][j].setColor(cp.color);
        board[i][j].setName(cp.name);

    }
    
    public ChessPiece get(int i, int j)
    {
        
        
        return board[i][j];
        
    }
    
    public String toString()
    {
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                System.out.print(board[i][j]);
            }
        }
        return null;
    }
    
}
