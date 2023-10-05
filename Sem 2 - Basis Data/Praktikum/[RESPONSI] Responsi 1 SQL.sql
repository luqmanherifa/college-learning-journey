/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     14/05/2018 16.06.05                          */
/*==============================================================*/


drop table if exists ANGGOTA;

drop table if exists BUKU;

drop table if exists DETAIL_PINJAM;

drop table if exists KATEGORI;

drop table if exists PEMINJAMAN;

drop table if exists PENERBIT;

drop table if exists PETUGAS;

/*==============================================================*/
/* Table: ANGGOTA                                               */
/*==============================================================*/
create table ANGGOTA
(
   IDANGGOTA            varchar(20) not null,
   KDPINJAM             varchar(20),
   KDPETUGAS            varchar(20),
   NAMA                 varchar(30) not null,
   ALAMAT               longtext not null,
   TELP                 varchar(15) not null,
   primary key (IDANGGOTA)
);

/*==============================================================*/
/* Table: BUKU                                                  */
/*==============================================================*/
create table BUKU
(
   KDBUKU               varchar(20) not null,
   KDKATEGORI           varchar(20),
   JUDUL                varchar(30) not null,
   THNTERBIT            date not null,
   JUMLAH               int not null,
   primary key (KDBUKU)
);

/*==============================================================*/
/* Table: DETAIL_PINJAM                                         */
/*==============================================================*/
create table DETAIL_PINJAM
(
   TGLKEMBALI           date not null,
   DENDA                int not null
);

/*==============================================================*/
/* Table: KATEGORI                                              */
/*==============================================================*/
create table KATEGORI
(
   KDKATEGORI           varchar(20) not null,
   KATEGORI             varchar(30) not null,
   primary key (KDKATEGORI)
);

/*==============================================================*/
/* Table: PEMINJAMAN                                            */
/*==============================================================*/
create table PEMINJAMAN
(
   KDPINJAM             varchar(20) not null,
   KDPENERBIT           varchar(20),
   TGLPINJAM            date not null,
   TGLHRSKEMBALI        date not null,
   primary key (KDPINJAM)
);

/*==============================================================*/
/* Table: PENERBIT                                              */
/*==============================================================*/
create table PENERBIT
(
   KDPENERBIT           varchar(20) not null,
   KDBUKU               varchar(20),
   NAMAPENERBIT         varchar(25) not null,
   ALAMATPENERBIT       longtext not null,
   TELPPENERBITAN       varchar(15) not null,
   primary key (KDPENERBIT)
);

/*==============================================================*/
/* Table: PETUGAS                                               */
/*==============================================================*/
create table PETUGAS
(
   KDPETUGAS            varchar(20) not null,
   NAMAPETUGAS          varchar(25) not null,
   primary key (KDPETUGAS)
);

alter table ANGGOTA add constraint FK_REFERENCE_1 foreign key (KDPINJAM)
      references PEMINJAMAN (KDPINJAM) on delete restrict on update restrict;

alter table ANGGOTA add constraint FK_REFERENCE_7 foreign key (KDPETUGAS)
      references PETUGAS (KDPETUGAS) on delete restrict on update restrict;

alter table BUKU add constraint FK_REFERENCE_4 foreign key ()
      references DETAIL_PINJAM on delete restrict on update restrict;

alter table BUKU add constraint FK_REFERENCE_5 foreign key (KDKATEGORI)
      references KATEGORI (KDKATEGORI) on delete restrict on update restrict;

alter table PEMINJAMAN add constraint FK_REFERENCE_2 foreign key (KDPENERBIT)
      references PENERBIT (KDPENERBIT) on delete restrict on update restrict;

alter table PENERBIT add constraint FK_REFERENCE_3 foreign key (KDBUKU)
      references BUKU (KDBUKU) on delete restrict on update restrict;

alter table PETUGAS add constraint FK_REFERENCE_6 foreign key ()
      references DETAIL_PINJAM on delete restrict on update restrict;

