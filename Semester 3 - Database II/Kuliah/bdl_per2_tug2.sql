/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     17/09/2018 16.39.30                          */
/*==============================================================*/


drop table if exists BARANGHP;

drop table if exists KARYAWAN;

drop table if exists PELANGGAN;

drop table if exists TIPEHP;

drop table if exists TRANSJUAL;

/*==============================================================*/
/* Table: BARANGHP                                              */
/*==============================================================*/
create table BARANGHP
(
   NOSERI               varchar(20) not null,
   KD_MERK              varchar(20),
   WARNA                varchar(20),
   primary key (NOSERI)
);

/*==============================================================*/
/* Table: KARYAWAN                                              */
/*==============================================================*/
create table KARYAWAN
(
   KD_KARYAWAN          varchar(20) not null,
   NAMAKARYAWAN         varchar(20),
   JABATAN              varchar(20),
   ALAMATKARYAWAN       text,
   TELPKARYAWAN         varchar(20),
   primary key (KD_KARYAWAN)
);

/*==============================================================*/
/* Table: PELANGGAN                                             */
/*==============================================================*/
create table PELANGGAN
(
   KD_PELANGGAN         varchar(20) not null,
   NAMAPELANGGAN        varchar(20),
   ALAMATPELANGGAN      text,
   TELPONPELANGGAN      varchar(20),
   primary key (KD_PELANGGAN)
);

/*==============================================================*/
/* Table: TIPEHP                                                */
/*==============================================================*/
create table TIPEHP
(
   KD_MERK              varchar(20) not null,
   MERK                 varchar(20),
   TYPE                 varchar(20),
   HARGA                float(8,2),
   primary key (KD_MERK)
);

/*==============================================================*/
/* Table: TRANSJUAL                                             */
/*==============================================================*/
create table TRANSJUAL
(
   NOTA                 varchar(20) not null,
   KD_PELANGGAN         varchar(20),
   KD_KARYAWAN          varchar(20),
   NOSERI               varchar(20),
   KD_MERK              varchar(20),
   TANGGAL              date,
   TOTAL                float(8,2),
   primary key (NOTA)
);

alter table BARANGHP add constraint FK_RELATIONSHIP_1 foreign key (KD_MERK)
      references TIPEHP (KD_MERK) on delete restrict on update restrict;

alter table TRANSJUAL add constraint FK_RELATIONSHIP_2 foreign key (KD_MERK)
      references TIPEHP (KD_MERK) on delete restrict on update restrict;

alter table TRANSJUAL add constraint FK_RELATIONSHIP_3 foreign key (NOSERI)
      references BARANGHP (NOSERI) on delete restrict on update restrict;

alter table TRANSJUAL add constraint FK_RELATIONSHIP_4 foreign key (KD_KARYAWAN)
      references KARYAWAN (KD_KARYAWAN) on delete restrict on update restrict;

alter table TRANSJUAL add constraint FK_RELATIONSHIP_5 foreign key (KD_PELANGGAN)
      references PELANGGAN (KD_PELANGGAN) on delete restrict on update restrict;

