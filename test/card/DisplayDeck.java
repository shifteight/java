public class DisplayDeck {
    public static void main(String[] args) {
        Deck deck = new Deck(); // 创建一个Deck对象
        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
            for (int number = Card.ACE; number <= Card.KING; number++) {
                Card card = deck.getCard(suit, number); // 获取一个card
                System.out.println(card.numberToString(card.getNumber())
                                   + " of " 
                                   + card.suitToString(card.getSuit()));
            }
        }
    }
}
