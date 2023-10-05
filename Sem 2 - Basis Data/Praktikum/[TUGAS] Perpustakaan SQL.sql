/*==============================================================*/
/* DBMS name:      Sybase SQL Anywhere 12                       */
/* Created on:     09/04/2018 21.41.13                          */
/*==============================================================*/


if exists(select 1 from sys.sysforeignkey where role='FK_PEMINJAM_RELATIONS_MEMBER_P') then
    alter table PEMINJAMAN_BUKU
       delete foreign key FK_PEMINJAM_RELATIONS_MEMBER_P
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_PEMINJAM_RELATIONS_PETUGAS_') then
    alter table PEMINJAMAN_BUKU
       delete foreign key FK_PEMINJAM_RELATIONS_PETUGAS_
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_PETUGAS__RELATIONS_PEMINJAM') then
    alter table PETUGAS_PERPUSTAKAAN
       delete foreign key FK_PETUGAS__RELATIONS_PEMINJAM
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_RELATION_RELATIONS_BUKU') then
    alter table RELATIONSHIP_1
       delete foreign key FK_RELATION_RELATIONS_BUKU
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_RELATION_RELATIONS_PERPUSTA') then
    alter table RELATIONSHIP_1
       delete foreign key FK_RELATION_RELATIONS_PERPUSTA
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_RELATION_RELATIONS_PETUGAS_') then
    alter table RELATIONSHIP_2
       delete foreign key FK_RELATION_RELATIONS_PETUGAS_
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_RELATION_RELATIONS_PERPUSTA') then
    alter table RELATIONSHIP_2
       delete foreign key FK_RELATION_RELATIONS_PERPUSTA
end if;

drop index if exists BUKU.BUKU_PK;

drop table if exists BUKU;

drop index if exists MEMBER_PERPUSTAKAAN.MEMBER_PERPUSTAKAAN_PK;

drop table if exists MEMBER_PERPUSTAKAAN;

drop index if exists PEMINJAMAN_BUKU.RELATIONSHIP_4_FK;

drop index if exists PEMINJAMAN_BUKU.RELATIONSHIP_7_FK;

drop index if exists PEMINJAMAN_BUKU.PEMINJAMAN_BUKU_PK;

drop table if exists PEMINJAMAN_BUKU;

drop index if exists PERPUSTAKAAN.PERPUSTAKAAN_PK;

drop table if exists PERPUSTAKAAN;

drop index if exists PETUGAS_PERPUSTAKAAN.RELATIONSHIP_3_FK;

drop index if exists PETUGAS_PERPUSTAKAAN.PETUGAS_PERPUSTAKAAN_PK;

drop table if exists PETUGAS_PERPUSTAKAAN;

drop index if exists RELATIONSHIP_1.RELATIONSHIP_1_FK;

drop index if exists RELATIONSHIP_1.RELATIONSHIP_5_FK;

drop index if exists RELATIONSHIP_1.RELATIONSHIP_1_PK;

drop table if exists RELATIONSHIP_1;

drop index if exists RELATIONSHIP_2.RELATIONSHIP_2_FK;

drop index if exists RELATIONSHIP_2.RELATIONSHIP_6_FK;

drop index if exists RELATIONSHIP_2.RELATIONSHIP_2_PK;

drop table if exists RELATIONSHIP_2;

/*==============================================================*/
/* Table: BUKU                                                  */
/*==============================================================*/
create table BUKU 
(
   NO_BUKU              char(5)                        not null,
   JUDUL_BUKU           varchar(10)                    null,
   PENGARANG            varchar(10)                    null,
   PENERBIT             varchar(10)                    null,
   constraint PK_BUKU primary key (NO_BUKU)
);

/*==============================================================*/
/* Index: BUKU_PK                                               */
/*==============================================================*/
create unique index BUKU_PK on BUKU (
NO_BUKU ASC
);

/*==============================================================*/
/* Table: MEMBER_PERPUSTAKAAN                                   */
/*==============================================================*/
create table MEMBER_PERPUSTAKAAN 
(
   NO_MEMBER            char(5)                        not null,
   NAMA_MEMBER          varchar(10)                    null,
   NO_TELEPON_MEMBER    varchar(10)                    null,
   ALAMAT_MEMBER        varchar(10)                    null,
   constraint PK_MEMBER_PERPUSTAKAAN primary key (NO_MEMBER)
);

/*==============================================================*/
/* Index: MEMBER_PERPUSTAKAAN_PK                                */
/*==============================================================*/
create unique index MEMBER_PERPUSTAKAAN_PK on MEMBER_PERPUSTAKAAN (
NO_MEMBER ASC
);

/*==============================================================*/
/* Table: PEMINJAMAN_BUKU                                       */
/*==============================================================*/
create table PEMINJAMAN_BUKU 
(
   NO_PEMINJAMAN        char(5)                        not null,
   NO_PETUGAS           char(5)                        null,
   NO_MEMBER            char(5)                        null,
   TANGGAL_PEMINJAMAN   date                           null,
   JUMLAH_BUKU          integer                        null,
   constraint PK_PEMINJAMAN_BUKU primary key (NO_PEMINJAMAN)
);

/*==============================================================*/
/* Index: PEMINJAMAN_BUKU_PK                                    */
/*==============================================================*/
create unique index PEMINJAMAN_BUKU_PK on PEMINJAMAN_BUKU (
NO_PEMINJAMAN ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_7_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_7_FK on PEMINJAMAN_BUKU (
NO_PETUGAS ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_4_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_4_FK on PEMINJAMAN_BUKU (
NO_MEMBER ASC
);

/*==============================================================*/
/* Table: PERPUSTAKAAN                                          */
/*==============================================================*/
create table PERPUSTAKAAN 
(
   NAMA_PERPUSTAKAAN    varchar(10)                    not null,
   ALAMAT_PERPUSTAKAAN  varchar(10)                    null,
   constraint PK_PERPUSTAKAAN primary key (NAMA_PERPUSTAKAAN)
);

/*==============================================================*/
/* Index: PERPUSTAKAAN_PK                                       */
/*==============================================================*/
create unique index PERPUSTAKAAN_PK on PERPUSTAKAAN (
NAMA_PERPUSTAKAAN ASC
);

/*==============================================================*/
/* Table: PETUGAS_PERPUSTAKAAN                                  */
/*==============================================================*/
create table PETUGAS_PERPUSTAKAAN 
(
   NO_PETUGAS           char(5)                        not null,
   NO_PEMINJAMAN        char(5)                        null,
   NAMA_PETUGAS         varchar(10)                    null,
   NO_TELEPON_PETUGAS   varchar(10)                    null,
   ALAMAT_PETUGAS       varchar(10)                    null,
   constraint PK_PETUGAS_PERPUSTAKAAN primary key (NO_PETUGAS)
);

/*==============================================================*/
/* Index: PETUGAS_PERPUSTAKAAN_PK                               */
/*==============================================================*/
create unique index PETUGAS_PERPUSTAKAAN_PK on PETUGAS_PERPUSTAKAAN (
NO_PETUGAS ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_3_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_3_FK on PETUGAS_PERPUSTAKAAN (
NO_PEMINJAMAN ASC
);

/*==============================================================*/
/* Table: RELATIONSHIP_1                                        */
/*==============================================================*/
create table RELATIONSHIP_1 
(
   NO_BUKU              char(5)                        not null,
   NAMA_PERPUSTAKAAN    varchar(10)                    not null,
   constraint PK_RELATIONSHIP_1 primary key (NO_BUKU, NAMA_PERPUSTAKAAN)
);

/*==============================================================*/
/* Index: RELATIONSHIP_1_PK                                     */
/*==============================================================*/
create unique index RELATIONSHIP_1_PK on RELATIONSHIP_1 (
NO_BUKU ASC,
NAMA_PERPUSTAKAAN ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_5_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_5_FK on RELATIONSHIP_1 (
NAMA_PERPUSTAKAAN ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_1_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_1_FK on RELATIONSHIP_1 (
NO_BUKU ASC
);

/*==============================================================*/
/* Table: RELATIONSHIP_2                                        */
/*==============================================================*/
create table RELATIONSHIP_2 
(
   NO_PETUGAS           char(5)                        not null,
   NAMA_PERPUSTAKAAN    varchar(10)                    not null,
   constraint PK_RELATIONSHIP_2 primary key (NO_PETUGAS, NAMA_PERPUSTAKAAN)
);

/*==============================================================*/
/* Index: RELATIONSHIP_2_PK                                     */
/*==============================================================*/
create unique index RELATIONSHIP_2_PK on RELATIONSHIP_2 (
NO_PETUGAS ASC,
NAMA_PERPUSTAKAAN ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_6_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_6_FK on RELATIONSHIP_2 (
NAMA_PERPUSTAKAAN ASC
);

/*==============================================================*/
/* Index: RELATIONSHIP_2_FK                                     */
/*==============================================================*/
create index RELATIONSHIP_2_FK on RELATIONSHIP_2 (
NO_PETUGAS ASC
);

alter table PEMINJAMAN_BUKU
   add constraint FK_PEMINJAM_RELATIONS_MEMBER_P foreign key (NO_MEMBER)
      references MEMBER_PERPUSTAKAAN (NO_MEMBER)
      on update restrict
      on delete restrict;

alter table PEMINJAMAN_BUKU
   add constraint FK_PEMINJAM_RELATIONS_PETUGAS_ foreign key (NO_PETUGAS)
      references PETUGAS_PERPUSTAKAAN (NO_PETUGAS)
      on update restrict
      on delete restrict;

alter table PETUGAS_PERPUSTAKAAN
   add constraint FK_PETUGAS__RELATIONS_PEMINJAM foreign key (NO_PEMINJAMAN)
      references PEMINJAMAN_BUKU (NO_PEMINJAMAN)
      on update restrict
      on delete restrict;

alter table RELATIONSHIP_1
   add constraint FK_RELATION_RELATIONS_BUKU foreign key (NO_BUKU)
      references BUKU (NO_BUKU)
      on update restrict
      on delete restrict;

alter table RELATIONSHIP_1
   add constraint FK_RELATION_RELATIONS_PERPUSTA foreign key (NAMA_PERPUSTAKAAN)
      references PERPUSTAKAAN (NAMA_PERPUSTAKAAN)
      on update restrict
      on delete restrict;

alter table RELATIONSHIP_2
   add constraint FK_RELATION_RELATIONS_PETUGAS_ foreign key (NO_PETUGAS)
      references PETUGAS_PERPUSTAKAAN (NO_PETUGAS)
      on update restrict
      on delete restrict;

alter table RELATIONSHIP_2
   add constraint FK_RELATION_RELATIONS_PERPUSTA foreign key (NAMA_PERPUSTAKAAN)
      references PERPUSTAKAAN (NAMA_PERPUSTAKAAN)
      on update restrict
      on delete restrict;

