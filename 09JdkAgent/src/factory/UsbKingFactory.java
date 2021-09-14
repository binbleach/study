package factory;

import service.USB;

public class UsbKingFactory implements USB {
    @Override
    public int price(int i) {

        return 40;
    }
}
