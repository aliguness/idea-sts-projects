package com.aligunes.v1;

public class JenerikSinifOrnegi <T>{ // Burası normal class
                    // sadece T'tipini bıraktığımızda durumlar değişiyor.

    T nesne;

        public JenerikSinifOrnegi(T nesne) {
            this.nesne = nesne;
        }


    public T getNesne() {
        return nesne;
    }

    public void setNesne(T nesne) {
        this.nesne = nesne;
    }

    @Override
    public String toString() {
        return "JenerikSinifOrnegi{" +
                "nesne=" + nesne +
                '}';
    }


}
