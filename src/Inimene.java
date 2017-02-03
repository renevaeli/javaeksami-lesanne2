/**
 * Created by revali on 03.02.2017.
 */
public class Inimene {

    String _name;
    String _destination;
    int _price;

    public Inimene(String name, String dest, int price) {
        _name = name;
        _destination = dest;
        _price = price;
    }


    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_destination() {
        return _destination;
    }

    public void set_destination(String _destination) {
        this._destination = _destination;
    }

    public int get_price() {
        return _price;
    }

    public void set_price(int _price) {
        this._price = _price;
    }



}
