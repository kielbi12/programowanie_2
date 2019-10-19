package day2.rentCars;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter

public class Rental {

    private final List<Car> carList = new ArrayList<>();
    private final List<Client> clientList = new ArrayList<>();
    private final List<Renting> rentingList = new ArrayList<>();
    private final List<Reservation> reservationList = new ArrayList<>();


    public void addClient(Client client) {
        Optional<Client> any = clientList.stream()
                .filter(cl -> cl.getIdNumber().equals(client.getIdNumber()))
                .findAny();
        if (!any.isPresent()) {
            clientList.add(client);
        }
    }

    public void addCar(Car car) {
        Optional<Car> any = carList.stream()
                .filter(cl -> cl.getRegistrationCar().equals(car.getRegistrationCar()))
                .findAny();
        if (!any.isPresent()) {
            carList.add(car);
        }
    }

    public void addReservation(Reservation reservation) {
        Optional<Reservation> any = reservationList.stream()
                .filter(cl -> cl.getCar().equals(reservation.getCar())).
                        filter(cl -> (cl.getRentingBegin().getTime() > reservation.getRentingBegin().getTime())
                                && (cl.getRentingEnd().getTime() < reservation.getRentingEnd().getTime())

                                || (cl.getRentingBegin().getTime() <= reservation.getRentingBegin().getTime())
                                && (cl.getRentingEnd().getTime() >= reservation.getRentingBegin().getTime())

                                || (cl.getRentingBegin().getTime() <= reservation.getRentingEnd().getTime()
                                && cl.getRentingEnd().getTime() >= reservation.getRentingEnd().getTime()))
                .findAny();
        if (!any.isPresent()) {
            reservationList.add(reservation);
        } else {
            throw new IllegalStateException("Nie moge dokonać rezerwacji");
        }
    }


}
