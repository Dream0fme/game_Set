public class Main {
    public static void main(String[] args) {
        Card c1 = new Card(3, 2, 1, 3);
        Card c2 = new Card(3, 2, 1, 3);
        System.out.println(c1.equals(c2));
        Card c3 = new Card(1, 2, 3, 1);
        Card c4 = new Card(2, 3, 1, 2);
        Card c5 = c3.getThird(c4);

        System.out.println("Если разные: " + '\n' + c5.toString());
        Card c6 = new Card(1, 1, 2, 3);
        Card c7 = new Card(1, 2, 2, 3);
        Card c8 = c6.getThird(c7);
        System.out.println("Если одинаковые: " + '\n' + c8.toString());
    }
}
