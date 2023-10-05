/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     11/09/2018 13.27.27                          */
/*==============================================================*/


drop table if exists BILLING;

drop table if exists DETAIL_BAYAR;

drop table if exists DETAIL_SERVIS;

drop table if exists KENDARAAN;

drop table if exists MEKANIK;

drop table if exists PELANGGAN;

drop table if exists PETUGAS;

drop table if exists SERVIS;

drop table if exists SPAREPART;

/*==============================================================*/
/* Table: BILLING                                               */
/*==============================================================*/
create table BILLING
(
   IDBAYAR              varchar(20) not null,
   IDSERVIS             varchar(20),
   TOTALBAYAR           float(8,2),
   TANGGALBAYAR         date,
   primary key (IDBAYAR)
);

/*==============================================================*/
/* Table: DETAIL_BAYAR                                          */
/*==============================================================*/
create table DETAIL_BAYAR
(
   IDBAYAR              varchar(20) not null,
   IDSPAREPART          varchar(20) not null,
   primary key (IDBAYAR, IDSPAREPART)
);

/*==============================================================*/
/* Table: DETAIL_SERVIS                                         */
/*==============================================================*/
create table DETAIL_SERVIS
(
   IDSERVIS             varchar(20) not null,
   IDMEKANIK            varchar(20) not null,
   primary key (IDSERVIS, IDMEKANIK)
);

/*==============================================================*/
/* Table: KENDARAAN                                             */
/*==============================================================*/
create table KENDARAAN
(
   IDKENDARAAN          varchar(20) not null,
   IDPELANGGAN          varchar(20),
   MERKKENDARAAN        varchar(20),
   NOPOLKENDARAAN       varchar(20),
   primary key (IDKENDARAAN)
);

/*==============================================================*/
/* Table: MEKANIK                                               */
/*==============================================================*/
create table MEKANIK
(
   IDMEKANIK            varchar(20) not null,
   NAMAMEKANIK          varchar(20),
   primary key (IDMEKANIK)
);

/*==============================================================*/
/* Table: PELANGGAN                                             */
/*==============================================================*/
create table PELANGGAN
(
   IDPELANGGAN          varchar(20) not null,
   NAMAPELANGGAN        varchar(20),
   ALAMATPELANGGAN      text,
   TELPONPELANGGAN      varchar(20),
   primary key (IDPELANGGAN)
);

/*==============================================================*/
/* Table: PETUGAS                                               */
/*==============================================================*/
create table PETUGAS
(
   IDPETUGAS            varchar(20) not null,
   NAMAPETUGAS          varchar(20),
   primary key (IDPETUGAS)
);

/*==============================================================*/
/* Table: SERVIS                                                */
/*==============================================================*/
create table SERVIS
(
   IDSERVIS             varchar(20) not null,
   IDKENDARAAN          varchar(20),
   IDPETUGAS            varchar(20),
   IDBAYAR              varchar(20),
   KELUHAN              text,
   TANGGALSERVIS        date,
   primary key (IDSERVIS)
);

/*==============================================================*/
/* Table: SPAREPART                                             */
/*==============================================================*/
create table SPAREPART
(
   IDSPAREPART          varchar(20) not null,
   NAMASPAREPART        varchar(20),
   HARGASPAREPART       float(8,2),
   STOKSPAREPART        int,
   primary key (IDSPAREPART)
);

alter table BILLING add constraint FK_RELATIONSHIP_7 foreign key (IDSERVIS)
      references SERVIS (IDSERVIS) on delete restrict on update restrict;

alter table DETAIL_BAYAR add constraint FK_DETAIL_BAYAR foreign key (IDBAYAR)
      references BILLING (IDBAYAR) on delete restrict on update restrict;

alter table DETAIL_BAYAR add constraint FK_DETAIL_BAYAR2 foreign key (IDSPAREPART)
      references SPAREPART (IDSPAREPART) on delete restrict on update restrict;

alter table DETAIL_SERVIS add constraint FK_DETAIL_SERVIS foreign key (IDSERVIS)
      references SERVIS (IDSERVIS) on delete restrict on update restrict;

alter table DETAIL_SERVIS add constraint FK_DETAIL_SERVIS2 foreign key (IDMEKANIK)
      references MEKANIK (IDMEKANIK) on delete restrict on update restrict;

alter table KENDARAAN add constraint FK_RELATIONSHIP_1 foreign key (IDPELANGGAN)
      references PELANGGAN (IDPELANGGAN) on delete restrict on update restrict;

alter table SERVIS add constraint FK_RELATIONSHIP_2 foreign key (IDKENDARAAN)
      references KENDARAAN (IDKENDARAAN) on delete restrict on update restrict;

alter table SERVIS add constraint FK_RELATIONSHIP_3 foreign key (IDPETUGAS)
      references PETUGAS (IDPETUGAS) on delete restrict on update restrict;

alter table SERVIS add constraint FK_RELATIONSHIP_6 foreign key (IDBAYAR)
      references BILLING (IDBAYAR) on delete restrict on update restrict;

