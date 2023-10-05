/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     02/12/2018 17.53.41                          */
/*==============================================================*/


drop table if exists BUKU;

drop table if exists KARYAWAN;

drop table if exists PELANGGAN;

drop table if exists PENERBIT;

drop table if exists TRANSJUAL;

/*==============================================================*/
/* Table: BUKU                                                  */
/*==============================================================*/
create table BUKU
(
   KDBUKU               varchar(100) not null,
   KDPENERBIT           varchar(100),
   JUDULBUKU            varchar(100),
   STOKBUKU             int,
   HARGABUKU            float,
   primary key (KDBUKU)
);

/*==============================================================*/
/* Table: KARYAWAN                                              */
/*==============================================================*/
create table KARYAWAN
(
   KDKARYAWAN           varchar(100) not null,
   NAMAKAR              varchar(100),
   KOTAKAR              varchar(100),
   TELPONKAR            varchar(100),
   primary key (KDKARYAWAN)
);

/*==============================================================*/
/* Table: PELANGGAN                                             */
/*==============================================================*/
create table PELANGGAN
(
   KDPELANGGAN          varchar(100) not null,
   NAMAPEL              varchar(100),
   KOTAPEL              varchar(100),
   TELPONPEL            varchar(100),
   primary key (KDPELANGGAN)
);

/*==============================================================*/
/* Table: PENERBIT                                              */
/*==============================================================*/
create table PENERBIT
(
   KDPENERBIT           varchar(100) not null,
   NAMAPENER            varchar(100),
   KOTAPENER            varchar(100),
   TELPONPENER          varchar(100),
   primary key (KDPENERBIT)
);

/*==============================================================*/
/* Table: TRANSJUAL                                             */
/*==============================================================*/
create table TRANSJUAL
(
   KDNOTA               varchar(100) not null,
   KDKARYAWAN           varchar(100),
   KDPENERBIT           varchar(100),
   KDBUKU               varchar(100),
   KDPELANGGAN          varchar(100),
   TANGGAL              date,
   JUMLAH               int,
   TOTAL                float,
   primary key (KDNOTA)
);

alter table BUKU add constraint FK_RELATIONSHIP_5 foreign key (KDPENERBIT)
      references PENERBIT (KDPENERBIT) on delete restrict on update restrict;

alter table TRANSJUAL add constraint FK_RELATIONSHIP_1 foreign key (KDKARYAWAN)
      references KARYAWAN (KDKARYAWAN) on delete restrict on update restrict;

alter table TRANSJUAL add constraint FK_RELATIONSHIP_2 foreign key (KDPELANGGAN)
      references PELANGGAN (KDPELANGGAN) on delete restrict on update restrict;

alter table TRANSJUAL add constraint FK_RELATIONSHIP_4 foreign key (KDBUKU)
      references BUKU (KDBUKU) on delete restrict on update restrict;

alter table TRANSJUAL add constraint FK_RELATIONSHIP_6 foreign key (KDPENERBIT)
      references PENERBIT (KDPENERBIT) on delete restrict on update restrict;

