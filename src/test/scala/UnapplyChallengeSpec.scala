import org.scalatest._

class UnapplyChallengeSpec extends FlatSpec with DiagrammedAssertions {
  import UnapplyChallenge._
  
  "Book Class unapplyメソッッド" should "パターンマッチでtitleを取り出せる" in {
    new Book("吾輩は猫である") match {
      case Book(title) => assert(title == "吾輩は猫である")
      case _ => assert(false)
    }
  }
}