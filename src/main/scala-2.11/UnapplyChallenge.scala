object UnapplyChallenge {
  class Book(private val title: String)
  object Book {
    def unapply(arg: Book): Option[String] = Some(arg.title)
  }
}

