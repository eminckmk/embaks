package com.example.embaks;

public class Card_Ozellikleri {
    public static final int UST_BASLIK = 0;
    public static final int ALT_BOLUM = 1;
    public static final int IKILI_BASLIK= 2;
    public static final int EN_UST_BOLUM= 3;

    private String mName;
    private String mDescription;
    private int mType;

    public Card_Ozellikleri(String Baslik, String Aciklama, int type) {
        this.mName = Baslik;
        this.mDescription = Aciklama;
        this.mType = type;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public int getType() {
        return mType;
    }

    public void setType(int type) {
        this.mType = type;
    }
}
