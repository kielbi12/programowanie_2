package day3.dhl;

import java.util.List;
import java.util.Optional;

public class FirmHelper<T extends FirmTypes<T>> {
    public void remove(List<T> list, T toRemove) {
        Optional<T> isExist = list.stream()
                .filter(a -> a.compareType(toRemove))
                .findAny();
        if (!isExist.isPresent()) {
            throw new IllegalArgumentException("Nie ma takiego magazynu");
        } else {
            list.remove(isExist.get());
        }
    }

    public void add(List<T> list, T toAdd) {
        boolean isExist = list.stream()
                .anyMatch(a -> a.compareType(toAdd));
        if (!isExist) {
            list.add(toAdd);
        }
    }
}
