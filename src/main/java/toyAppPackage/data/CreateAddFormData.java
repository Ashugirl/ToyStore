package toyAppPackage.data;

import org.springframework.lang.NonNull;

public class CreateAddFormData {
    @NonNull
    private String name;

    @NonNull
    private String brand;

    @NonNull
    private Double price;

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public String getBrand() {
        return brand;
    }

    public void setBrand(@NonNull String brand) {
        this.brand = brand;
    }

    @NonNull
    public Double getPrice() {
        return price;
    }

    public void setPrice(@NonNull Double price) {
        this.price = price;
    }

    public ToyCreationParameters toParameters(){
        return new ToyCreationParameters(name, brand, price);
    }
}
