import java.util.ArrayList;

/**
 * Created by revali on 03.02.2017.
 */
public class ViewModel {

    ArrayList<Destination> destinations;

    public ViewModel() {
        destinations = new  ArrayList<Destination>();
    }


    public void AddDest(String dest, int price) {
        Destination d = new Destination(dest, price);
        destinations.add(d);

    }


}
