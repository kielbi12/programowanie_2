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

    @Test
    public void testAddCourier() {
        //given
        Firm firm = new Firm();
        Courier courier = new Courier("Adam", "Mickiewicz", "532432532", 20L);

        //when
        firm.addCourier(courier);

        //then
        Courier courier1 = new Courier("Adam", "Mickiewicz", "532432532", 20L);
        firm.removeCourier(courier1);
        assertEquals(0, firm.getCourierList().size());

    }

    @Test
    public void testAddClient() {
        //given
        Firm firm = new Firm();
        Adress adressClient = new Adress("Lubartowska", "20-144", "Lublin", 66);
        Client client = new Client("Adam", "Mickiewicz", adressClient, "643624363", 20L);

        //when
        firm.addClient(client);

        //then
        Client client1 = new Client("Adam", "Mickiewicz", adressClient, "643624363", 20L);
        firm.removeClient(client);
        assertEquals(0, firm.getCourierList().size());


    }
}


