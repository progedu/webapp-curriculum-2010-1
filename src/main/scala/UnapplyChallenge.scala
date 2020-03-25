object UnapplyChallenge {
  class Book(private val title: String)

  object Book {
    def unapply(book: Book): Option[(String)] = Some(book.title)
  }
}

/* REPL
import UnapplyChallenge._
new Book("吾輩は猫である") match {case Book(title) => println(title)}
 */
