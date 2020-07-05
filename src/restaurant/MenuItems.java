package restaurant;

public class MenuItems {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double aPrice){
        price = aPrice;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String aDescription){
        description = aDescription;
    }

    public String getCategory(){
        return this.category;
    }

    public void setCategory(String aCategory){
        category = aCategory;
    }

    public boolean getNewStatus(){
        return isNew;
    }

    public void setNew(boolean trueOrFalse){
        isNew = trueOrFalse;
    }
}
