public class Book {

  private final String title;
  private final double price;
  private int edition;

  public Book(String bookTitle, double bookPrice) {
    title = bookTitle;
    price = bookPrice;
  }

  public Book(String bookTitle, double bookPrice, int ed) {
    title = bookTitle;
    price = bookPrice;
    edition = ed;
  }

  public boolean canSubstituteFor(Book b) {
    if (this.title.equals(b.title)) {
      return this.edition >= b.edition;
    }

    return false;
  }

  // getter methods
  public String getTitle() {
    return title;
  }

  public String getBookInfo() {
    return title + "-" + price + "-" + edition;
  }

  public int getEdition() {
    return edition;
  }

}