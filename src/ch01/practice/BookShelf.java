package ch01.practice;

public class BookShelf {
    private Book[] books; // 배열 선언 (배열일 때는 변수이름 복수로 주기)
    private int last = 0; // 책의 마지막 위치

    public BookShelf(int maxsize) {
        // 배열 생성
        this.books = new Book[maxsize];
    }
    
    // 책을 꽂는 메소드
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    // 책을 꺼내오는 메소드
    public Book getBookAt(int index) {
        return books[index];
    }

    // 책 개수를 리턴하는 메소드
}
