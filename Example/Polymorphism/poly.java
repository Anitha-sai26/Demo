package Polymorphism;


 class Payment
{
void pay(int amt)
{
System.out.println("payment of amt "+amt+"is processed");
}
}
class Creditcardpayment extends Payment
{
void pay(int amt )
{
System.out.println("amount"+amt+"is paid using creditcard");
}
void pay(int amt,int tip)
{
System.out.println("amtis"+amt+"tip is"+tip);
}

}
class Upipayment extends Payment
{
void pay(int amt )
{
System.out.println("amount"+amt+"is paid using upi");
}}
class poly
{
public static void main(String args[])
{
Payment p=new Creditcardpayment();
Creditcardpayment a=new Creditcardpayment();
p.pay(100);
Payment p1=new Upipayment();
p1.pay(200);
a.pay(100,20);
}
}
