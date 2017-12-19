public class Deck {

    public static int numSuits = 4;
    public static int numCardsPerSuit = 13;
    public static int numCards = numSuits * numCardsPerSuit;

    private Card[][] cards; // 声明一个二维数组

    public Deck() {
        cards = new Card[numSuits][numCardsPerSuit]; // 创建4x13数组对象
        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
            for (int number = Card.ACE; number <= Card.KING; number++) {
                cards[suit-1][number-1] = new Card(number, suit); // 赋值
            }
        }
    }
    public Card getCard(int suit, int number) {
        return cards[suit-1][number-1]; // 获取数组元素
    }
}
