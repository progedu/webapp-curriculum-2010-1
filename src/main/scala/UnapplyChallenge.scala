object UnapplyChallenge {
  class Book(private val title: String)

  object Book {
    def unapply(obj: Any): Option[String] = obj match {
      case book: Book => Some(book.title)
      case _ => None
    }
  }
}
