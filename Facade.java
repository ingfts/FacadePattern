public class Facade {
    private BrowseProducts browseProducts;
    private AddToCart addToCart;


    public Facade (){
        browseProducts = new BrowseProducts();
        addToCart = new AddToCart();

    }

    public void FacadeOperation (String item){
        browseProducts.showProductCategories();;
        addToCart.addItems(item);

    }
}
