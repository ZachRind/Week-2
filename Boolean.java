
public class Boolean {

	public static void main(String[] args) {
		
		//part 1
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(false && false);
		System.out.println(true && (false || true));
		System.out.println(false || true && false);
		System.out.println(false || 1 < 5);
		System.out.println(5 <= 4 && 1 > 3);
		System.out.println(10 < 4 || 1 > 4);
		System.out.println(12 >= 2 && 1 < 24);
		System.out.println("Hello".charAt(0) == 'h');
		
		//part 2
		boolean isHotOutside = true;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = false;
		
		//part 3
		double costOfMilk = 2.50;
		double moneyInWallet = 20;
		byte thirstLevel = 3;
		
		System.out.println("---Part 4---");
		//part 4
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		System.out.println(shouldBuyIcecream);
		
		boolean WillGoSwimming = isHotOutside && !isWeekday; 
		System.out.println(WillGoSwimming);
		
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		System.out.println(isAGoodDay);
		
		boolean WillBuyMilk = isHotOutside && thirstLevel > 3 && moneyInWallet >= (costOfMilk * 2);
		System.out.println(WillBuyMilk);
	}

}
