/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     6/4/2018 3:14:36 PM                          */
/*==============================================================*/


drop table if exists BARANG;

drop table if exists DETAIL_PEMBELIAN;

drop table if exists KARYAWAN;

drop table if exists KATEGORI;

drop table if exists METODE_PEMBAYARAN;

drop table if exists METODE_PENGIRIMAN;

drop table if exists PELANGGAN;

drop table if exists PEMBELIAN;

drop table if exists REVIEW_BARANG;

drop table if exists TOKO;

/*==============================================================*/
/* Table: BARANG                                                */
/*==============================================================*/
create table BARANG
(
   ID_BARANG4           varchar(10) not null,
   ID_KATEGORI          varchar(15),
   NAMA                 varchar(20) not null,
   TIPE                 varchar(20) not null,
   HARGA_JUAL           float(8,2) not null,
   HARGA_POKOK          float(8,2) not null,
   STOK                 int not null,
   primary key (ID_BARANG4)
);

/*==============================================================*/
/* Table: DETAIL_PEMBELIAN                                      */
/*==============================================================*/
create table DETAIL_PEMBELIAN
(
   ID_BARANG4           varchar(10),
   ID_PEMBELIAN         varchar(10),
   JUMLAH_BARANG        int not null,
   DISCOUNT             int not null,
   SUB_TOTAL            int not null
);

/*==============================================================*/
/* Table: KARYAWAN                                              */
/*==============================================================*/
create table KARYAWAN
(
   ID_KARYAWAN          varchar(10) not null,
   ID_TOKO              varchar(10) not null,
   KAR_ID_KARYAWAN      varchar(10),
   NAMA_KARYAWAN        varchar(25),
   EMAIL                varchar(15),
   NO_TELFON            varchar(15),
   primary key (ID_KARYAWAN)
);

/*==============================================================*/
/* Table: KATEGORI                                              */
/*==============================================================*/
create table KATEGORI
(
   ID_KATEGORI          varchar(15) not null,
   NAMA_KATEGORI        varchar(25) not null,
   primary key (ID_KATEGORI)
);

/*==============================================================*/
/* Table: METODE_PEMBAYARAN                                     */
/*==============================================================*/
create table METODE_PEMBAYARAN
(
   ID_PEMBAYARAN        varchar(25) not null,
   NAMA_METODE_PEMBAYARAN varchar(25) not null,
   primary key (ID_PEMBAYARAN)
);

/*==============================================================*/
/* Table: METODE_PENGIRIMAN                                     */
/*==============================================================*/
create table METODE_PENGIRIMAN
(
   ID_PENGIRIMAN        varchar(25) not null,
   NAMA_METODE_PENGIRIMAN varchar(25),
   primary key (ID_PENGIRIMAN)
);

/*==============================================================*/
/* Table: PELANGGAN                                             */
/*==============================================================*/
create table PELANGGAN
(
   ID_PELANGGAN2        varchar(10) not null,
   NAMA_PELANGGAN       varchar(50) not null,
   USERNAME_PELANGGAN   varchar(20) not null,
   PASSWORD_PELANGGAN   varchar(25) not null,
   TANGGAL_LAHIR        date not null,
   JENIS_KELAMIN        bool not null,
   NOMOR_TELEPON_TOKO   numeric(20,0) not null,
   E_MAIL               varchar(200) not null,
   ALAMAT_PELANGGAN     varchar(200) not null,
   KOTA___PELANGGAN     varchar(25) not null,
   primary key (ID_PELANGGAN2)
);

/*==============================================================*/
/* Table: PEMBELIAN                                             */
/*==============================================================*/
create table PEMBELIAN
(
   ID_PEMBELIAN         varchar(10) not null,
   ID_PELANGGAN2        varchar(10),
   ID_KARYAWAN          varchar(10) not null,
   ID_PEMBAYARAN        varchar(25),
   ID_PENGIRIMAN        varchar(25),
   TANGGAL              datetime not null,
   TOTAL_HARGA          float(50,0) not null,
   primary key (ID_PEMBELIAN)
);

/*==============================================================*/
/* Table: REVIEW_BARANG                                         */
/*==============================================================*/
create table REVIEW_BARANG
(
   ID_PELANGGAN2        varchar(10),
   ID_BARANG4           varchar(10),
   RATING               char(15),
   DETAIL_PREVIEW       varchar(25)
);

/*==============================================================*/
/* Table: TOKO                                                  */
/*==============================================================*/
create table TOKO
(
   ID_TOKO              varchar(10) not null,
   NAMA_TOKO            varchar(50) not null,
   NOMOR_TELEPON_TOKO   numeric(20,0) not null,
   USERNAME_TOKO        varchar(20) not null,
   PASSWORD_TOKO        longtext not null,
   EMAIL_TOKO           varchar(200) not null,
   URL_TOKO             varchar(200) not null,
   NOMOR_REKENING_TOKO  numeric(50,0) not null,
   KOTA___TOKO          varchar(25) not null,
   ALAMAT_TOKO          varchar(200) not null,
   primary key (ID_TOKO)
);

alter table BARANG add constraint FK_PUNYA foreign key (ID_KATEGORI)
      references KATEGORI (ID_KATEGORI) on delete restrict on update restrict;

alter table DETAIL_PEMBELIAN add constraint FK_RELATIONSHIP_5 foreign key (ID_PEMBELIAN)
      references PEMBELIAN (ID_PEMBELIAN) on delete restrict on update restrict;

alter table DETAIL_PEMBELIAN add constraint FK_RELATIONSHIP_6 foreign key (ID_BARANG4)
      references BARANG (ID_BARANG4) on delete restrict on update restrict;

alter table KARYAWAN add constraint FK_KERJA foreign key (ID_TOKO)
      references TOKO (ID_TOKO) on delete restrict on update restrict;

alter table KARYAWAN add constraint FK_RELATIONSHIP_7 foreign key (KAR_ID_KARYAWAN)
      references KARYAWAN (ID_KARYAWAN) on delete restrict on update restrict;

alter table PEMBELIAN add constraint FK_BELI foreign key (ID_PELANGGAN2)
      references PELANGGAN (ID_PELANGGAN2) on delete restrict on update restrict;

alter table PEMBELIAN add constraint FK_MELAYANI foreign key (ID_KARYAWAN)
      references KARYAWAN (ID_KARYAWAN) on delete restrict on update restrict;

alter table PEMBELIAN add constraint FK_RELATIONSHIP_11 foreign key (ID_PENGIRIMAN)
      references METODE_PENGIRIMAN (ID_PENGIRIMAN) on delete restrict on update restrict;

alter table PEMBELIAN add constraint FK_RELATIONSHIP_12 foreign key (ID_PEMBAYARAN)
      references METODE_PEMBAYARAN (ID_PEMBAYARAN) on delete restrict on update restrict;

alter table REVIEW_BARANG add constraint FK_RELATIONSHIP_10 foreign key (ID_BARANG4)
      references BARANG (ID_BARANG4) on delete restrict on update restrict;

alter table REVIEW_BARANG add constraint FK_RELATIONSHIP_9 foreign key (ID_PELANGGAN2)
      references PELANGGAN (ID_PELANGGAN2) on delete restrict on update restrict;

