/**
 * Created by revali on 03.02.2017.
 */
public class Destination {
    String _destination;
    int _price;

    public Destination(String dest, int price) {
        _destination = dest;
        _price = price;
    }

    public String getDestination() {
        return _destination;
    }

    public void setDestination(String destination) {
        this._destination = destination;
    }

    public int getPrice() {
        return _price;
    }

    public void setPrice(int price) {
        this._price = price;
    }




}
