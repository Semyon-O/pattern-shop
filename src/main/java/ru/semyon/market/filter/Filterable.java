package ru.semyon.market.filter;

import java.util.List;
import java.util.function.Predicate;

public interface Filterable<T> {
    List<T> filter(Predicate<T> condition);
}
