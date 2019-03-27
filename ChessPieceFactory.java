
public class ChessPieceFactory extends PieceFactory
{
    public ChessPiece createPiece(String color, String type)
    {
        
        if(type.equals("Rook"))
        {
            return new Rook(color);
        }
        else if(type.equals("Queen"))
        {
            return new Queen(color);
        }
        else if(type.equals("Knight"))
        {
            return new Knight(color);
        }
        else if(type.equals("Bishop"))
        {
            return new Bishop(color);
        }
        else if(type.equals("Pawn"))
        {
            return new Pawn(color);
        }
        else if(type.equals("King"))
        {
            return new King(color);
        }
        else
        {
            return null;
        }
    }
}
