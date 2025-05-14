package ru.semyon.market.sort;

import java.util.Comparator;
import java.util.List;

public interface Sortable<T> {
    default List<T> sort(Comparator<T> comparator) {
        return sort(comparator, true);
    }
    List<T> sort(Comparator<T> comparator, boolean ascending);
}
