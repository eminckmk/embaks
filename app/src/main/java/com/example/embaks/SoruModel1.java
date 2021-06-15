package com.example.embaks;

public class SoruModel1 {
    private String soru,cevapA,cevapB,cevapC,cevapD,cevapE, dogrucevap;
    private Boolean dogrulukKontrolu,fotografliSoru;
    private String imageSoru,secilensecenek;


    public SoruModel1(String soru, String cevapA, String cevapB, String cevapC, String cevapD,String cevapE, String dogrucevap, Boolean dogrulukKontrolu, Boolean fotografliSoru, String imageSoru, String secilensecenek) {
        this.soru = soru;
        this.cevapA = cevapA;
        this.cevapB = cevapB;
        this.cevapC = cevapC;
        this.cevapD = cevapD;
        this.cevapE = cevapE;
        this.dogrucevap = dogrucevap;
        this.dogrulukKontrolu = dogrulukKontrolu;
        this.fotografliSoru = fotografliSoru;
        this.imageSoru = imageSoru;
        this.secilensecenek = secilensecenek;
    }
    public String getSecilensecenek() { return secilensecenek; }

    public void setSecilensecenek(String secilensecenek) { this.secilensecenek = secilensecenek; }

    public String getImageSoru() {
        return imageSoru;
    }

    public void setImageSoru(String imageSoru) {
        this.imageSoru = imageSoru;
    }

    public Boolean getFotografliSoru() { return fotografliSoru; }

    public void setFotografliSoru(Boolean fotografliSoru) { this.fotografliSoru = fotografliSoru; }

    public Boolean getDogrulukKontrolu() {return dogrulukKontrolu;}

    public void setDogrulukKontrolu(Boolean dogrulukKontrolu) { this.dogrulukKontrolu = dogrulukKontrolu;}

    public String getSoru() {
        return soru;
    }

    public void setSoru(String soru) {
        this.soru = soru;
    }

    public String getCevapA() {
        return cevapA;
    }

    public void setCevapA(String cevapA) {
        this.cevapA = cevapA;
    }

    public String getCevapB() {
        return cevapB;
    }

    public void setCevapB(String cevapB) {
        this.cevapB = cevapB;
    }

    public String getCevapC() {
        return cevapC;
    }

    public void setCevapC(String cevapC) {
        this.cevapC = cevapC;
    }

    public String getCevapD() {
        return cevapD;
    }

    public void setCevapD(String cevapD) {
        this.cevapD = cevapD;
    }

    public String getCevapE() {
        return cevapE;
    }

    public void setCevapE(String cevapE) {
        this.cevapE = cevapE;
    }

    public String getDogrucevap() {
        return dogrucevap;
    }

    public void setDogrucevap(String dogrucevap) {
        this.dogrucevap = dogrucevap;
    }
}
