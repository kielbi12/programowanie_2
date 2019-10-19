package day3.dhl;


import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


@Getter
public class Firm {

    private final List<Warehouse> warehouseList = new ArrayList<>();
    private final List<Client> clientList = new ArrayList<>();
    private final List<Courier> courierList = new ArrayList<>();
    private final FirmHelper<Warehouse> firmHelper = new FirmHelper<>();
    private final FirmHelper<Client> firmHelper1 = new FirmHelper<>();
    private final FirmHelper<Courier> firmHelper2 = new FirmHelper<>();


    public void addWarehouse(Warehouse warehouse) {

        firmHelper.add(warehouseList, warehouse);
    }

    public void addClient(Client client) {

        firmHelper1.add(clientList, client);
    }

    public void addCourier(Courier courier) {

        firmHelper2.add(courierList, courier);
    }

    public void removeWarehouse(Warehouse warehouse) {

        firmHelper.remove(warehouseList, warehouse);

    }

    public void removeClient(Client client) {
        firmHelper1.remove(clientList, client);

    }

    public void removeCourier(Courier courier) {

        firmHelper2.remove(courierList, courier);
    }

}
