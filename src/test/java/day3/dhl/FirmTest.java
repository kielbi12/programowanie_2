package day3.dhl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirmTest {

    @Test
    public void testAddWarehouse() {
        //given
        Firm firm = new Firm();
        Adress adressWarehouse = new Adress("Lubartowska", "20-144", "Lublin", 66);
        Warehouse warehouse = new Warehouse(1L, adressWarehouse);

        //when
        firm.addWarehouse(warehouse);

        //then
        Warehouse warehouse1 = new Warehouse(1L, adressWarehouse);
        firm.removeWarehouse(warehouse1);
        assertEquals(0, firm.getWarehouseList().size());

    }


}