public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.name = "Laptop";
        product.id=1;
        product.description="Asus Laptop";
        product.price=5000;
        product.stockAmount=3;
        product.renk="";

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

/*
        productManager.Add2(1,"","",2,200);
        productManager.Add2(1,"","",2,200);
        productManager.Add2(1,"","",2,200);
        productManager.Add2(1,"","",2,200);
        productManager.Add2(1,"","",2,200);
        productManager.Add2(1,"","",2,200);
*/


    }
}

