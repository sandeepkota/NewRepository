object Additions {
  def total(list: List[Int]) = {
    list.foldLeft(0) { (carryOver, e) =>
      carryOver + e
    }
  }
}
