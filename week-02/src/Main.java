public class Main {

    public static void main(String[] args) {

        // Bir Class Nasıl Çalışır?
        CustomerManager customerManger = new CustomerManager();
        CustomerManager customerManger2 = new CustomerManager();

        customerManger = customerManger2;

        customerManger.Add();
        customerManger.Remove();
        customerManger.Update();

        // Değer ve Referans Tiplerini Anlamak
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);

        // ReCap Demo Classlarla Çalışmak
        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.Topla(3,4);
        System.out.println(sonuc);

        // Field ve Attribute ile Çalışmak
        Product product = new Product();
        product.id = 1;
        product.name = "Laptop";
        product.description = "Asus Laptop";
        product.price = 5000;
        product.stockAmount = 3;

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        // Encapsulation İhtiyacını Anlamak
        // Getter ve Setter İle Çalışmak
        ProductEncapsulation productEncapsulation = new ProductEncapsulation();
        productEncapsulation.setId(2);

        // Constructer
        ProductEncapsulation productEncapsulation2 = new ProductEncapsulation(
                3,
                "Laptop",
                "MSİ Laptop",
                5000,
                5);
        System.out.println(productEncapsulation2.getName());


        // Method Overloading İle Çalışmak
        DortIslemOverloading dortIslemOverloading = new DortIslemOverloading();
        System.out.println(dortIslemOverloading.Topla(4,3));
        System.out.println(dortIslemOverloading.Topla(4,3,8));

        // Inheritance Yapısını Anlamak
        Customer customer = new Customer();
        Employee employee = new Employee();
        customer.id = 1;
        employee.id = 1;

        // Inheritance Demo
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());
        krediUI.KrediHesapla(new TarimKrediManager());
        krediUI.KrediHesapla(new AskerKrediManager());

    }
}
