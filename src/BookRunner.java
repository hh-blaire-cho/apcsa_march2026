public class BookRunner {

  public static void main(String[] args) {
    Book bio2015 = new Book("Biology", 49.75, 2);
    Book bio2019 = new Book("Biology", 39.75, 3);
    Book chem2020 = new Book("Chemistry", 39.75, 9);

    System.out.println(bio2019.getEdition());
    System.out.println(bio2019.getBookInfo());
    System.out.println(bio2019.canSubstituteFor(bio2015));
    System.out.println(bio2015.canSubstituteFor(bio2019));
    System.out.println(chem2020.canSubstituteFor(bio2019));
  }

}
