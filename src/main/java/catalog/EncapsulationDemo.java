package catalog;

public class EncapsulationDemo {

    public static void main(String[] args) {
        LibraryCatalog lc = new LibraryCatalog();
        lc.addBook("The Lord of the Rings", "J.R.R. Tolkien");
        lc.addBook("The Hobbit or There and Back Again","J.R.R. Tolkien");
        lc.addBook("The Kite Runner", "Khaled Hosseini");
        System.out.println("The catalog: ");
        System.out.println(lc);

        // What if we want to be able to load books from books.csv?
        // Where will you place this logic?

        // Go through the example below one by one (uncommenting and commenting as needed)
        /*
        List<Book> booksFromCatalog = lc.getBooks1();
		booksFromCatalog.clear(); // we erased all the books - why were we able to?
		System.out.println("The catalog: ");
		System.out.println(lc);
		*/

        /*
		List<Book> booksFromCatalog = lc.getBooks2(); // creates a shallow copy of the list
		//booksFromCatalog.clear(); // this will not clear the catalog now
		booksFromCatalog.get(0).checkout(); // why can we still do that?
		lc.printAvailableBooks();
         */

        /*
		List<Book> booksFromCatalog = lc.getBooks3(); // returns unmodifiable list
		// booksFromCatalog.clear(); // this will not clear the catalog now
        // Can still check out books
        Book b = booksFromCatalog.get(0);
        b.checkout(); // this will modify the catalog by checking out a book (note: we are able to do it without using lc -- not good)
        //System.out.println("Available books in the catalog: ");
        lc.printAvailableBooks();
         */

        // Option 4:
        /*
		Iterator<Book> it = lc.iterator();
		while (it.hasNext()) {
			Book b = it.next();
			System.out.println(b);
			b.checkout();
		}
		System.out.println("Available books in the catalog: ");
		lc.printAvailableBooks();
         */
    }


}