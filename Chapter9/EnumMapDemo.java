import java.util.Map;
import java.util.EnumMap;

public class EnumMapDemo{
	public static void main(String[] args){
		Map<Coin, Integer> map = new EnumMap<Coin, Integer>(Coin.class);
		map.put(Coin.PENNY, 1);
		map.put(Coin.NICKEL, 5);
		map.put(Coin.DIME, 10);
		map.put(Coin.QUARTER, 25);
		System.out.println(map);
		
		Map<Coin, Integer> mapCopy = new EnumMap<Coin, Integer>(map);
		System.out.println(mapCopy);
	}
}

enum Coin{
	PENNY, NICKEL, DIME, QUARTER
}