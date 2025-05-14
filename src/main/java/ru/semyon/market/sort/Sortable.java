package ru.semyon.market.sort;

import java.util.Comparator;
import java.util.List;

public interface Sortable<T> {
    ///
    /// Интерфейс для сортировки коллекций объектов типа T.
    /// По сути создаем единый механизм управления сортировкой
    /// Таким образом можно комбинировать способы сортировки вместе
    ///

    default List<T> sort(Comparator<T> comparator) {
        return sort(comparator, true);
    }
    List<T> sort(Comparator<T> comparator, boolean ascending);
}
