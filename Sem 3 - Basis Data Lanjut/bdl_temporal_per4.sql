/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     26/09/2018 09.04.13                          */
/*==============================================================*/


drop table if exists MS_CABANG;

drop table if exists MS_HARGA_MINGGUAN;

drop table if exists MS_KARYAWAN;

drop table if exists MS_KATEGORI;

drop table if exists MS_KOTA;

drop table if exists MS_PRODUK;

drop table if exists MS_PROVINSI;

/*==============================================================*/
/* Table: MS_CABANG                                             */
/*==============================================================*/
create table MS_CABANG
(
   KODE_CABANG          varchar(20) not null,
   KODE_KOTA            varchar(20),
   NAMA_CABANG          varchar(20),
   primary key (KODE_CABANG)
);

/*==============================================================*/
/* Table: MS_HARGA_MINGGUAN                                     */
/*==============================================================*/
create table MS_HARGA_MINGGUAN
(
   KODE_CABANG          varchar(20),
   KODE_PRODUK          varchar(20),
   HARGA_BERLAKU        varchar(20),
   START                datetime,
   END                  datetime
);

/*==============================================================*/
/* Table: MS_KARYAWAN                                           */
/*==============================================================*/
create table MS_KARYAWAN
(
   KODE_KARYAWAN        varchar(20) not null,
   KODE_CABANG          varchar(20),
   NAMA_DEPAN           varchar(20),
   NAMA_BELAKANG        varchar(20),
   JENIS_KELAMIN        varchar(20),
   primary key (KODE_KARYAWAN)
);

/*==============================================================*/
/* Table: MS_KATEGORI                                           */
/*==============================================================*/
create table MS_KATEGORI
(
   KODE_KATEGORI        varchar(20) not null,
   NAMA_KATEGORI        varchar(20),
   primary key (KODE_KATEGORI)
);

/*==============================================================*/
/* Table: MS_KOTA                                               */
/*==============================================================*/
create table MS_KOTA
(
   KODE_KOTA            varchar(20) not null,
   KODE_PROVINSI        varchar(20),
   NAMA_KOTA            varchar(20),
   primary key (KODE_KOTA)
);

/*==============================================================*/
/* Table: MS_PRODUK                                             */
/*==============================================================*/
create table MS_PRODUK
(
   KODE_PRODUK          varchar(20) not null,
   KODE_KATEGORI        varchar(20),
   NAMA_PRODUK          varchar(20),
   UNIT                 varchar(20),
   KODE_SATUAN          varchar(20),
   primary key (KODE_PRODUK)
);

/*==============================================================*/
/* Table: MS_PROVINSI                                           */
/*==============================================================*/
create table MS_PROVINSI
(
   KODE_PROVINSI        varchar(20) not null,
   NAMA_PROVINSI        varchar(20),
   primary key (KODE_PROVINSI)
);

alter table MS_CABANG add constraint FK_RELATIONSHIP_4 foreign key (KODE_KOTA)
      references MS_KOTA (KODE_KOTA) on delete restrict on update restrict;

alter table MS_HARGA_MINGGUAN add constraint FK_RELATIONSHIP_1 foreign key (KODE_PRODUK)
      references MS_PRODUK (KODE_PRODUK) on delete restrict on update restrict;

alter table MS_HARGA_MINGGUAN add constraint FK_RELATIONSHIP_2 foreign key (KODE_CABANG)
      references MS_CABANG (KODE_CABANG) on delete restrict on update restrict;

alter table MS_KARYAWAN add constraint FK_RELATIONSHIP_5 foreign key (KODE_CABANG)
      references MS_CABANG (KODE_CABANG) on delete restrict on update restrict;

alter table MS_KOTA add constraint FK_RELATIONSHIP_3 foreign key (KODE_PROVINSI)
      references MS_PROVINSI (KODE_PROVINSI) on delete restrict on update restrict;

alter table MS_PRODUK add constraint FK_RELATIONSHIP_6 foreign key (KODE_KATEGORI)
      references MS_KATEGORI (KODE_KATEGORI) on delete restrict on update restrict;

