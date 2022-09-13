package toyAppPackage.services.interfaces;

import toyAppPackage.data.Toy;
import toyAppPackage.data.ToyCreationParameters;

import java.util.List;

public interface ToyService {

    Toy getOneById(int id);
    List<Toy> getAllToys();
    void createToy(Toy toy);

    //void setToyCreationParameters(ToyCreationParameters toyCreationParameters);
}
