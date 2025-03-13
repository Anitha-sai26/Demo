interface Payment {
    void pay(int amt);
  }
  
  class Creditcardpayment implements Payment {
    public void pay(int amt) {
      System.out.println("amount" + " " + amt + " " + "is paid using creditcard");
    }
  }
  
  class Upipayment implements Payment {
    public void pay(int amt) {
      System.out.println("amount" + " " + amt + " " + "is paid using upi");
    }
  }
  
  class Interface {
    public static void main(String args[]) {
      Payment p = new Creditcardpayment();
      p.pay(100);
      Payment p1 = new Upipayment();
      p1.pay(200);
  
    }
  }
  
