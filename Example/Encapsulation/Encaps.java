class Customer {
    String name;
    String address;
    int phoneNum;

    public Customer(String name, String address, int phoneNum) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }
}

public class Encaps {
    public static void main(String args[]) {
        Customer a = new Customer("ani", "theni", 978977899);
        System.out.println("customer name is" + a.getName());
        System.out.println("customer phonenum is" + a.getPhoneNum());
        a.setPhoneNum(89008899);

        System.out.println("customer's updated phonenum is" + a.getPhoneNum());
    }
}

