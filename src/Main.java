public class Main {
    public static void main(String[] args) {
        Author author = new Author();
        Author authorOne = new Author("Марсель ", "Пруст");
        System.out.println(authorOne);
        Author authorTwo = new Author("Владимир ", "Набоков");
        System.out.println(authorTwo);

        Book book = new Book();
        Book bookOne = new Book("В поисках утраченного времени", 2024, authorOne);
        System.out.println(bookOne);
        Book bookTwo = new Book("Лолита", 2024, authorTwo);
        System.out.println(bookTwo);
        bookOne.setPublicationYear(2021);
        System.out.println("Год публикации изменен на " + bookOne.getPublicationYear());

        Author authorThree = new Author("Лев", "Толстой");
        Author authorFour = new Author("Александр", "Пушкин");
        System.out.println(authorThree.equals(authorFour));

        Book bookThree = new Book("В поисках утраченного времени", 2024, authorOne);
        Book bookFour = new Book("Лолита", 2024, authorOne);
        System.out.println(bookThree.equals(bookFour));

    }
}