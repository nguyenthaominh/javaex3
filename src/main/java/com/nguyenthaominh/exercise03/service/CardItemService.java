package com.nguyenthaominh.exercise03.service;

import java.util.List;
import com.nguyenthaominh.exercise03.entity.CardItem;

public interface CardItemService {
    CardItem createCardItem(CardItem cardItem);
    CardItem getCardItemById(String cardItemId);
    List<CardItem> getAllCardItems();
    CardItem updateCardItem(CardItem cardItem);
    void deleteCardItem(String cardItemId);
}