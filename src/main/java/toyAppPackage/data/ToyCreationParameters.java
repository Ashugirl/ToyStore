package toyAppPackage.data;

import org.springframework.util.Assert;

public class ToyCreationParameters {
    private final String NAME;
    private final String BRAND;
    private final Double PRICE;
    private String imageLocation;

    public ToyCreationParameters(String name,String brand, double price ){
        Assert.notNull(name, "Name should not be null.");
        Assert.notNull(brand, "Brand should not be null.");
        Assert.notNull(price, "Price should not be null.");
        NAME = name;
        BRAND = brand;
        PRICE = price;
    }

    public String getNAME(){
        return NAME;
    }
    public String getBRAND(){
        return BRAND;
    }
    public Double getPRICE(){
        return PRICE;
    }
}

