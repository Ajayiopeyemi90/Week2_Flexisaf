import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

// Class representing a library item (Date, Title, Author)
class LibraryItem<T, K, E> {
    private T date;
    private K title;
    private E author;

    public LibraryItem(T date, K title, E author) {
        this.date = date;
        this.title = title;
        this.author = author;
    }

    public T getDate() {
        return date;
    }

    public K getTitle() {
        return title;
    }

    public E getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "date=" + date +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

// Generic Library class
public class Library<T, K, E> {

    private List<LibraryItem<T, K, E>> items;

    // Constructor
    public Library() {
        items = new ArrayList<>();
    }

    // Add an item to the library
    public void addItem(T date, K title, E author) {
        items.add(new LibraryItem<>(date, title, author));
    }

    // Remove items that match a given condition (using a Predicate)
    public void removeIf(Predicate<LibraryItem<T, K, E>> condition) {
        Iterator<LibraryItem<T, K, E>> iterator = items.iterator();
        while (iterator.hasNext()) {
            LibraryItem<T, K, E> item = iterator.next();
            if (condition.test(item)) {
                iterator.remove();
            }
        }
    }

    // Print the items
    public void printItems() {
        for (LibraryItem<T, K, E> item : items) {
            System.out.println(item);
        }
    }
}
