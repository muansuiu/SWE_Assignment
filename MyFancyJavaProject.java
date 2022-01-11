public class MyFancyJavaProject {
    String phoneModel;
    String phoneBrand;
    double price;
    int ram;
    int Rom;

    MyFancyJavaProject(String phoneModel,String phoneBrand, double price,int  ram)
    {
        this.phoneModel = phoneModel;
        this.phoneBrand = phoneBrand;
        this.price = price;
        this.ram = ram;
        this.Rom = Rom;
    }

  MyProject(String pcModel,String pcBrand, double price)
    {
        this.pcModel = pcModel;
        this.pcBrand = pcBrand;
        this.price = price;
    }

    public static void main(String[] args) {

        MyFancyJavaProject newPhone = new MyFancyJavaProject("Galaxy S21 Ultra", "Samsung",110000,4);
        System.out.println(newPhone.phoneModel + " " + newPhone.phoneBrand + " "+ newPhone.price + " " + newPhone.ram);

        MyFancyJavaProject newPC = new MyProject("thinkpad_genaration_5", "Lenovo",500000);
        System.out.println(newPC.pcModel + " " + newPC.pcBrand + " "+ newPC.price);

    }
}
