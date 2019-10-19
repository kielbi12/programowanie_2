package day3.dhl;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter

public class Warehouse {

    private final List<Package> PACKAGE_LIST = new ArrayList<>();
    private Long idWarehouse;
    private Adress adressWarehouse;

    public Warehouse(Long idWarehouse, Adress adressWarehouse) {
        this.idWarehouse = idWarehouse;
        this.adressWarehouse = adressWarehouse;
    }


    public void addPackage(Package newPackage) {

    }

    public void sendPackage(Package newPackage) {

    }

}
