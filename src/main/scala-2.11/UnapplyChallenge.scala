object UnapplyChallenge {
  class Book(private val title: String)
  object Book {
    def unapply(user: Book): Option[(String)] = Some(user.title)
  }

}

