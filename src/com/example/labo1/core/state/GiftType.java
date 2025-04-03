package com.example.labo1.core.state;

/*
*    Contiene la modalidad de regalos posibles para un evento
*    de cumpleanios
*/
public enum GiftType {
    PHYSICAL("Regalo fisico"),
    CASH("Regalo en efectivo"),
    GIFT_CARD("Tarjeta de regalo");

    private final String giftType;

    GiftType(String giftType) {
        this.giftType = giftType;
    }

    public String getGiftType() {
        return giftType;
    }
}
