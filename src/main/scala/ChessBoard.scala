import model.Board
import model.pieces._
import chess.api.Color

object ChessBoard {
    def apply() = new Board()
    .set((4, 0), Some(King(Color.Black)))
    .set((4, 7), Some(King(Color.White)))
    .set((1, 0), Some(Knight(Color.Black)))
    .set((6, 0), Some(Knight(Color.Black)))
    .set((1, 7), Some(Knight(Color.White)))
    .set((6, 7), Some(Knight(Color.White)))
    .set((0, 0), Some(Rook(Color.Black)))
    .set((7, 0), Some(Rook(Color.Black)))
    .set((0, 7), Some(Rook(Color.White)))
    .set((7, 7), Some(Rook(Color.White)))
    .set((2, 0), Some(Bishop(Color.Black)))
    .set((5, 0), Some(Bishop(Color.Black)))
    .set((2, 7), Some(Bishop(Color.White)))
    .set((5, 7), Some(Bishop(Color.White)))
    .set((3, 0), Some(Queen(Color.Black)))
    .set((3, 7), Some(Queen(Color.White)))
    .set((0, 1), Some(Pawn(Color.Black)))
    .set((1, 1), Some(Pawn(Color.Black)))
    .set((2, 1), Some(Pawn(Color.Black)))
    .set((3, 1), Some(Pawn(Color.Black)))
    .set((4, 1), Some(Pawn(Color.Black)))
    .set((5, 1), Some(Pawn(Color.Black)))
    .set((6, 1), Some(Pawn(Color.Black)))
    .set((7, 1), Some(Pawn(Color.Black)))
    .set((0, 6), Some(Pawn(Color.White)))
    .set((1, 6), Some(Pawn(Color.Black)))
    .set((2, 6), Some(Pawn(Color.White)))
    .set((3, 6), Some(Pawn(Color.White)))
    .set((4, 6), Some(Pawn(Color.White)))
    .set((5, 6), Some(Pawn(Color.White)))
    .set((6, 6), Some(Pawn(Color.White)))
    .set((7, 6), Some(Pawn(Color.White)))
}