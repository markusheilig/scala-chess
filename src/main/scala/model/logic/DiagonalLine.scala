package model.logic

import chess.api.{Action, Position}
import model.SeqExtensions._
import model.TupleUtils._
import model.logic.modifier.IsOnBoard
import model.{ActionFactory, History, Pattern}
import model.Pieces._

class DiagonalLine(val maxSteps: Option[Int] = None) extends DiagonalLineMixin with IsOnBoard

trait DiagonalLineMixin extends Logic {
  val maxSteps: Option[Int]

  override def getActions(field: Position, history: History): Seq[Action] =
    history.pieceAt(field) map {
      piece =>
        Seq(
          (t: Position) => t.up.right,
          (t: Position) => t.up.left,
          (t: Position) => t.down.right,
          (t: Position) => t.down.left
        ) flatMap {
          dir =>
            val maxStepsUnwrapped = maxSteps getOrElse history.maxBoardSize
            Pattern.line(dir, field, maxStepsUnwrapped) takeUntil (pos => history.pieceAt(pos).isDefined)
        } filter {
          target => history.pieceAt(target) forall {
            targetPiece => piece.isEnemy(targetPiece)
          }
        } map {
          target => ActionFactory.move(piece.id, field, target, history)
        }
    } getOrElse Seq()
}

