package com.restfulApi.mongo.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// Mongo database annotation.
@Document(collection= "buku")
public class Buku {
    @Id
    public ObjectId _id;
    private String penulis;
    private String judul;
    private String kota;
    private String penerbit;
    private Integer tahun;

    // Constructors
    public Buku() {}

    public Buku(ObjectId _id, String penulis, String judul, String kota, String penerbit, Integer tahun) {
        this._id = _id;
        this.penulis = penulis;
        this.judul = judul;
        this.kota = kota;
        this.penerbit=penerbit;
        this.tahun=tahun;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public Integer getTahun() {
        return tahun;
    }

    public void setTahun(Integer tahun) {
        this.tahun = tahun;
    }
}
