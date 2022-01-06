public class MyFancyJavaProject {
    String phoneModel;
    String phoneBrand;
    double price;

    MyFancyJavaProject(String phoneModel,String phoneBrand, double price)
    {
        this.phoneModel = phoneModel;
        this.phoneBrand = phoneBrand;
        this.price = price;
    }

    public static void main(String[] args) {

        MyFancyJavaProject newPhone = new MyFancyJavaProject("Galaxy S21 Ultra", "Samsung",110000);
        System.out.println(newPhone.phoneModel + " " + newPhone.phoneBrand + " "+ newPhone.price);

    }
}
