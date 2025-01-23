public class Main{
   public static void main(String[] args) {
        // instantiating the Library to create an Object
        Library<String, String, String> library = new Library<>();
        
        // Adding items to the library
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
}