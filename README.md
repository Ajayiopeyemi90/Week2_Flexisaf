# Week2_Flexisaf

# Library Program

This project implements a generic `Library` class in Java to manage a collection of library items. Each item consists of three attributes: `Date`, `Title`, and `Author`. The program demonstrates the usage of generics, iterators, and functional programming concepts like `Predicate` to handle dynamic data and perform operations on the library collection.

## Features

1. **Add Items**: Add a new library item with attributes `Date`, `Title`, and `Author`.
2. **Remove Items**: Remove library items based on specific conditions using `Predicate`.
3. **Print Items**: Display all items currently in the library.
4. **Generic Design**: The program is designed to handle any type of data for the `Date`, `Title`, and `Author` fields.

## How It Works

### Components
1. **`LibraryItem` Class**:
   - Represents a single item in the library.
   - Attributes: `Date`, `Title`, `Author`.
   - Includes getter methods and a `toString` method for display purposes.

2. **`Library` Class**:
   - A generic class that manages a list of `LibraryItem` objects.
   - Methods:
     - `addItem(T date, K title, E author)`: Adds a new item to the library.
     - `removeIf(Predicate<LibraryItem<T, K, E>> condition)`: Removes items that match a given condition.
     - `printItems()`: Prints all items in the library.

### Example Usage

```java
public static void main(String[] args) {
    Library<String, String, String> library = new Library<>();

    // Add items to the library
    library.addItem("2023-01-01", "Java Programming", "Ajayi Opeyemi");
        library.addItem("2022-12-25", "Mastery Programming", "Joseph Olusegun");
        library.addItem("2024-01-15", "Effective coaching", "Eric Ten Hang");

        System.out.println("Original Library:");
        library.printItems();

        // Removing items with a specific title
        library.removeIf(item -> item.getTitle().equals("Effective coaching"));
        System.out.println("\nLibrary after removing 'Effective coaching':");
        library.printItems();

        // Remove items authored by a specific person
        library.removeIf(item -> item.getAuthor().equals("Joseph Olusegun"));
        System.out.println("\nLibrary after removing items by 'Joseph Olusegun':");
        library.printItems();
}
```

### Sample Output
```
Original Library:
LibraryItem{date=2023-01-01, title='Java Programming', author='Ajayi Opeyemi'}
LibraryItem{date=2022-12-25, title='Mastery Programming', author='Joseph Olusegun'}
LibraryItem{date=2024-01-15, title='Effective coaching', author='Eric Ten Hang'}

Library after removing 'Effective coaching':
LibraryItem{date=2023-01-01, title='Java Programming', author='Ajayi Opeyemi'}
LibraryItem{date=2022-12-25, title='Mastery Programming', author='Joseph Olusegun'}

Library after removing items by 'Joseph Olusegun':
LibraryItem{date=2023-01-01, title='Java Programming', author='Ajayi Opeyemi'}}
```

## Installation and Setup

1. Clone the repository or copy the code into your Java IDE.
2. Compile and run the `Library` class.

## Author
- **Ajayi Opeyemi**

