/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     12/09/2018 09.21.30                          */
/*==============================================================*/


drop table if exists DEPARTEMENT;

drop table if exists EMPLOYEE;

/*==============================================================*/
/* Table: DEPARTEMENT                                           */
/*==============================================================*/
create table DEPARTEMENT
(
   DNUMBER              varchar(20) not null,
   SSN                  varchar(20),
   DNAME                varchar(20),
   primary key (DNUMBER)
);

/*==============================================================*/
/* Table: EMPLOYEE                                              */
/*==============================================================*/
create table EMPLOYEE
(
   SSN                  varchar(20) not null,
   DNUMBER              varchar(20),
   ENAME                varchar(20),
   SALARY               float(20,0),
   SUPERSSN             varchar(20),
   primary key (SSN)
);

alter table DEPARTEMENT add constraint FK_RELATIONSHIP_2 foreign key (SSN)
      references EMPLOYEE (SSN) on delete restrict on update restrict;

alter table EMPLOYEE add constraint FK_RELATIONSHIP_1 foreign key (DNUMBER)
      references DEPARTEMENT (DNUMBER) on delete restrict on update restrict;

