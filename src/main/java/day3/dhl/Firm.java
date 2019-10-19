package day3.dhl;


import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Getter
public class Firm {

    private final List<Warehouse> warehouseList = new ArrayList<>();
    private final List<Client> clientList = new ArrayList<>();
    private final List<Courier> courierList = new ArrayList<>();


    public void addWarehouse(Warehouse warehouse) {
        boolean isWarehouseExist = warehouseList.stream()
                .filter(a -> a.getAdressWarehouse().equals(warehouse.getAdressWarehouse()))
                .findAny()
                .isPresent();
        if (!isWarehouseExist) {
            warehouseList.add(warehouse);
        }
    }

    public void addClient(Client client) {
        boolean isClientExist = clientList.stream()
                .filter(a -> a.getIdClient().equals(client.getIdClient()))
                .findAny()
                .isPresent();
        if (!isClientExist) {
            clientList.add(client);

        }
    }

    public void addCourier(Courier courier) {
        boolean isCourierExist = courierList.stream()
                .filter(a -> a.getIdCourier().equals(courier.getIdCourier()))
                .findAny()
                .isPresent();
        if (!isCourierExist) {
            courierList.add(courier);
        }
    }

    public void removeWarehouse(Warehouse warehouse) {

        Optional<Warehouse> isWarehouseExist = warehouseList.stream()
                .filter(a -> a.getAdressWarehouse().equals(warehouse.getAdressWarehouse()))
                .findAny();
        if (!isWarehouseExist.isPresent()) {
            throw new IllegalArgumentException("Nie ma takiego magazynu");
        } else {
            warehouseList.remove(isWarehouseExist.get());
        }
    }

    public void removeClient(Client client) {
        Optional<Client> isClientExist = clientList.stream()
                .filter(a -> a.getIdClient().equals(client.getIdClient()))
                .findAny();
        if (!isClientExist.isPresent()) {
            throw new IllegalArgumentException("Nie ma takiego klienta");
        } else {
            clientList.remove(isClientExist.get());
        }


    }

    public void removeCourier(Courier courier) {
        Optional<Courier> isCourierExist = courierList.stream()
                .filter(a -> a.getIdCourier().equals(courier.getIdCourier()))
                .findAny();
        if (!isCourierExist.isPresent()) {
            throw new IllegalArgumentException("Nie ma takiego kuriera");
        } else {
            courierList.remove(isCourierExist.get());
        }
    }

}
