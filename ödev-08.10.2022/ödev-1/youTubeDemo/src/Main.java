public class Main {
    public static void main(String[] args) {
/*

        CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Save();

        Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("Ankara");

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();

        Company company = new Company();
        company.setTaxNumber("100000");
        company.setCompanyName("Arçelik");
        company.setId(100);

        CustomerManager customerManager2 = new CustomerManager(new Person());

*/
        //IoC Container
        CustomerManager customerManager = new CustomerManager(new Customer(),new MilitaryCreditManager());



    }
}