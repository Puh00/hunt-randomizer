package net.puh.springboot.dao;

import java.util.List;

public interface ItemDao<T> {
    List<T> getRandomItems();
}
