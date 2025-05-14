package ru.semyon.market.filter;

import java.util.List;
import java.util.function.Predicate;

public interface Filterable<T> {

    ///
    ///  Интерфейс для фильтрации.
    ///  Работает по аналогии с сортировкой
    ///  Принцип: Open-Closed Principle
    ///     Можем спокойно унаследовать интерфейс, добавить свою логику,
    ///     и ничего не поломается при внедерении интерфейсов
    ///     так как код реализации будет работать по базовой схеме
    ///
    ///  Принцип: Interface Segregation Principle
    ///     Мог занести под один интерфейс Фильтрацию и Сортировку
    ///     Но с точки зрения слабой связанности это глупо, так как логика может быть совершенна
    ///     разная

    List<T> filter(Predicate<T> condition);
}
