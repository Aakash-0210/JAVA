package OppsAssginments2;

/*

Compile-time polymorphism = Overloading
Same method name, but different parameters.
The compiler determines which method to use based on the arguments.

void pay(int amount) {
    System.out.println("Paying " + amount);
}

void pay(int amount, String upiId) {
    System.out.println("Paying through UPI");
}

void pay(int amount, String upiId, String note) {
    System.out.println("Paying through UPI with note");
}

Runtime polymorphism = Overriding
Here the method signature stays the same:
but different classes provide different implementations.
The reference type is PaymentMethod, but the actual object decides which overridden method executes.
It means Java looks at what object is actually stored in the reference, not just what the variable is declared as.

*/
class PaymentMethod {
	void topUp(double amount) {
		
	}
static void processWalletTopUp(PaymentMethod method, double amount){
		method.topUp(amount);
	}

	
}
class CardPayment extends PaymentMethod{
	@Override
	void topUp(double amount) {
		if(amount >=1000)
		{
			System.out.println("paid through Upi..." + amount);
	        System.out.println("Congratulations! You received cashback.");

		}else {
			System.out.println("paid through Card..." + amount);
	
		}
	}

	
}
class UpiPayment extends PaymentMethod{
	@Override
	void topUp(double amount) {
		System.out.println("paid through Upi..." + amount);

	}
}
class CryptoPayment extends PaymentMethod{
	@Override
	void topUp(double amount) {
		System.out.println("paid through crypto..." + amount);
	}

}
public class OppsAssginment_10 {
public static void main(String[] args) {
	CardPayment payment1 = new CardPayment();
	UpiPayment payment2 = new UpiPayment();
	CryptoPayment payment3 = new CryptoPayment();
	
	PaymentMethod.processWalletTopUp(payment1,3333);
//
//	PaymentMethod[] PaymentMethods ={payment1,payment2,payment3};
//	for(int i=0; i <PaymentMethods.length; i++) {
//		PaymentMethods[i].topUp(500);
//	}
}
}
