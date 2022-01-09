public class MyFancyJavaProject {
    String phoneModel;
    String phoneBrand;
    double price;
    int ram;

    MyFancyJavaProject(String phoneModel,String phoneBrand, double price,int  ram)
    {
        this.phoneModel = phoneModel;
        this.phoneBrand = phoneBrand;
        this.price = price;
        this.ram = ram;
    }

    public static void main(String[] args) {

        MyFancyJavaProject newPhone = new MyFancyJavaProject("Galaxy S21 Ultra", "Samsung",110000,4);
        System.out.println(newPhone.phoneModel + " " + newPhone.phoneBrand + " "+ newPhone.price + " " + newPhone.ram);

    }
}
