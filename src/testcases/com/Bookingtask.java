package testcases.com;

import org.testng.annotations.Test;

public class Bookingtask 
{
	@Test
	public void task()
	{
Onlineshopping os=new Onlineshopping();
os.entersearchelement();

Nokiakeypadmobile nkm=new Nokiakeypadmobile();
nkm.clickonnokiamobile();


Nokia105 n=new Nokia105();
n.addtocart();

Shoppingcart sc=new Shoppingcart();
sc.clickonplaceorder();

nkm.amountconfirmation();


}
}