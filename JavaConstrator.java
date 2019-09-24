
package javaconstrator;

public class JavaConstrator {

    public static void main(String[] args) {

        //Account bobAccount = new Account("52324", 200.0, "Bobs Martin", "bobs121@gmail.com", "(207) 645 9338");
        // Here Default Constractor is Working...
        
        Account bobAccount = new Account();

        bobAccount.diposit(100);

        System.out.println("Number is " + bobAccount.getNumber());
        System.out.println("Balance is " + bobAccount.getBalance());

        Account timsAccount = new Account("tims", "tims@mail.com", "93823923");

        System.out.println("New number is: " + timsAccount.getNumber());
        System.out.println("New Customer Balance is: " + timsAccount.getBalance());
        System.out.println("New Customer Name is: " + timsAccount.getCustomerName());
        System.out.println("New Customer Email is: " + timsAccount.getCustomerEmail());
        bobAccount.withdrawal(530.0);

        
        // Vip Person Class Iterration.........
        
//        VipPerson person1 = new VipPerson();
//        System.out.println("Person1 info : ");
//        System.out.println(">>" + person1.getVipName());
//        System.out.println(">>" + person1.getCraditLimit());
//        System.out.println(">>" + person1.getVipEmail());
//
//        VipPerson person2 = new VipPerson("Bobs", 3000.0);
//        System.out.println("Person2 info: ");
//        System.out.println(">>" + person2.getVipName());
//        System.out.println(">>" + person2.getCraditLimit());
//        System.out.println(">>" + person2.getVipEmail());
//
//        VipPerson person3 = new VipPerson("Tims", 6000.0, "tims@mail.com");
//        System.out.println(">>" + person3.getVipName());
//        System.out.println(">>" + person3.getCraditLimit());
//        System.out.println(">>" + person3.getVipEmail());


    }
    
}
