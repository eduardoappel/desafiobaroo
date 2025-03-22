package entitites;

public class Bill {

	public static final double BEER_PRICE = 5.0;
	public static final double BARBECUE_PRICE = 7.0;
	public static final double SOFTDRINK_PRICE = 3.0;
	public static final double COUVERT = 4.0;
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	/* 
		Em um bar, 
		o ingresso custa 10 reais para homens e 
		8 reais para mulheres. 
		Cada cerveja custa 5 reais, 
		cada refrigerante 3 reais e 
		cada espetinho custa 7 reais. 

		o bar cobra uma taxa de couvert artístico no valor de 4 reais, 
		porém, se o valor gasto com consumo for superior a 30 reais, o couvert 
		artístico não é cobrado.
	*/
	
	public double feeding() {
		return beer * BEER_PRICE + barbecue * BARBECUE_PRICE + softDrink * SOFTDRINK_PRICE;
	}

}
