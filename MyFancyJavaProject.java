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

  MyProject(String pcModel,String pcBrand, double price)
    {
        this.pcModel = pcModel;
        this.pcBrand = pcBrand;
        this.price = price;
    }

    public static void main(String[] args) {

        MyFancyJavaProject newPhone = new MyFancyJavaProject("Galaxy S21 Ultra", "Samsung",110000);
        System.out.println(newPhone.phoneModel + " " + newPhone.phoneBrand + " "+ newPhone.price);

        MyFancyJavaProject newPC = new MyProject("thinkpad_genaration_5", "Lenovo",500000);
        System.out.println(newPC.pcModel + " " + newPC.pcBrand + " "+ newPC.price);

    }
}
