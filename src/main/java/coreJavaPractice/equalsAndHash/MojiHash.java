package coreJavaPractice.equalsAndHash;

/**
 * Created by Moji on 19-Oct-17.
 * mojtaba.nasehzadeh@gmail.com
 */
public class MojiHash {

    public static void main(String[] args) {
        Book book1 = new Book(10);
        Book book2 = new Book(20);
        Book book3 = book1;

        System.out.println("book1 " + book1.hashCode());
        System.out.println("book2 " + book2.hashCode());
        System.out.println("book3 " + book3.hashCode());
    }

}//end of MojiHash


class Book {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Book(int price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        return (price * 99) + (int) System.currentTimeMillis();
    }
}// end of Book

