public class Library {
    private DynamicArray books;

    public Library() {
        books = new DynamicArray();
    }

    public void addBook(String bookTitle) {
        books.add(bookTitle);
    }

    public void insertBook(int index, String bookTitle) {
        try {
            books.insert(index, bookTitle);
        } catch (IndexOutOfBoundsException e) {
            // Handle exception in GUI layer
        }
    }

    public void removeBook(int index) {
        try {
            books.remove(index);
        } catch (IndexOutOfBoundsException e) {
            // Handle exception in GUI layer
        }
    }

    public String searchBook(int index) {
        try {
            return (String) books.get(index);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public int getTotalBooks() {
        return books.size();
    }

    public boolean isEmpty() {
        return books.isEmpty();
    }
}
