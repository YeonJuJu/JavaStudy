

class Card extends Object{
	// 카드의 무늬 수
	static final int KIND_MAX = 4;
	// 무늬별 카드 수
	static final int NUM_MAX = 13;
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	public Card() {
		this(SPADE, 1);
	}
	public Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	@Override
	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK";
		return "kind : " + kinds[this.kind] + 
				   ", number : " + numbers.charAt(this.number);
	}
}
class Deck{
	// 카드의 개수
	final int CARD_NUM = 52;
	Card[] arrCard = new Card[CARD_NUM];
	
	// Deck에 들어있는 Card 초기화하기
	public Deck() {
		int i = 0;
		for(int k = Card.KIND_MAX; k > 0; k--) {
			for(int n = 0; n < Card.NUM_MAX; n++) {
				arrCard[i++] = new Card(k, n+1);
			}
		}
	} // 기본 생성자
	
	// 지정된 위치(index)에 있는 Card 하나 꺼내기
	public Card pick(int index) {
		 return arrCard[index];
	}
	// Deck에서 Card 하나 선택하기
	public Card pick() {
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}
	// Card 순서 섞기
	public void shuffle() {
		for(int i = 0; i < arrCard.length; i++) {
			int rd = (int)(Math.random() * CARD_NUM);
			
			// swapping
			Card cup = arrCard[i];
			arrCard[i] = arrCard[rd];
			arrCard[rd] = cup;
		}
	}
}

public class Ex01 {
  public static void main(String[] args) {
  	// Card 한 벌 만들기
  	Deck deck = new Deck();
  	
  	// Card 섞기 전에 맨 위에 있는 Card 뽑기
  	Card card = deck.pick(0);
  	System.out.println("card [" + card + "]");
  	
  	// Card 섞기
  	deck.shuffle();
  	
    // Card 섞은 다음 맨 위에 있는 Card 뽑기
   	card = deck.pick(0);
   	System.out.println("card [" + card + "]");
   	
  	
  }
}








