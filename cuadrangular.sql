/*==============================================================*/
/* DBMS name:      PostgreSQL 9.x                               */
/* Created on:     26/5/2021 22:27:19                           */
/*==============================================================*/


drop index MATCHTOURNAMENT_FK;

drop index MATCH_PK;

drop table MATCH;

drop index TEAMPOINTS_FK;

drop index TABLETOURNAMENT_FK;

drop index TABLEPOINTS_PK;

drop table TABLEPOINTS;

drop index TEAMS_PK;

drop table TEAMS;

drop index TOURNAMENT_PK;

drop table TOURNAMENT;

/*==============================================================*/
/* Table: MATCH                                                 */
/*==============================================================*/
create table MATCH (
   ID_MATCH             SERIAL                 not null,
   ID_TOURNAMENT        INT4                 not null,
   ID_LOCAL_TEAM        INT4                 not null,
   ID_VISITOR_TEAM      INT4                 not null,
   DATE_MATCH           DATE                 not null,
   GOALS_LOCAL          INT4                 not null,
   GOALS_VISITOR        INT4                 not null,
   constraint PK_MATCH primary key (ID_MATCH)
);

/*==============================================================*/
/* Index: MATCH_PK                                              */
/*==============================================================*/
create unique index MATCH_PK on MATCH (
ID_MATCH
);

/*==============================================================*/
/* Index: MATCHTOURNAMENT_FK                                    */
/*==============================================================*/
create  index MATCHTOURNAMENT_FK on MATCH (
ID_TOURNAMENT
);

/*==============================================================*/
/* Table: TABLEPOINTS                                           */
/*==============================================================*/
create table TABLEPOINTS (
   ID_TABLE             SERIAL                 not null,
   ID_TOURNAMENT        INT4                 not null,
   ID_TEAM              INT4                 not null,
   POINTS               INT4                 not null,
   PLAYED               INT4                 not null,
   WIN                  INT4                 not null,
   DRAW                 INT4                 not null,
   LOSE                 INT4                 not null,
   GOALS_F              INT4                 not null,
   GOALS_A              INT4                 not null,
   DIFFERENCE           INT4                 not null,
   constraint PK_TABLEPOINTS primary key (ID_TABLE)
);

/*==============================================================*/
/* Index: TABLEPOINTS_PK                                        */
/*==============================================================*/
create unique index TABLEPOINTS_PK on TABLEPOINTS (
ID_TABLE
);

/*==============================================================*/
/* Index: TABLETOURNAMENT_FK                                    */
/*==============================================================*/
create  index TABLETOURNAMENT_FK on TABLEPOINTS (
ID_TOURNAMENT
);

/*==============================================================*/
/* Index: TEAMPOINTS_FK                                         */
/*==============================================================*/
create  index TEAMPOINTS_FK on TABLEPOINTS (
ID_TEAM
);

/*==============================================================*/
/* Table: TEAMS                                                 */
/*==============================================================*/
create table TEAMS (
   ID_TEAM              SERIAL                 not null,
   NAME_TEAM            VARCHAR(100)         not null,
   DATE_TEAM            DATE                 not null,
   COUNTRY_TEAM         VARCHAR(100)         not null,
   CITY_TEAM            VARCHAR(100)         not null,
   constraint PK_TEAMS primary key (ID_TEAM)
);

/*==============================================================*/
/* Index: TEAMS_PK                                              */
/*==============================================================*/
create unique index TEAMS_PK on TEAMS (
ID_TEAM
);

/*==============================================================*/
/* Table: TOURNAMENT                                            */
/*==============================================================*/
create table TOURNAMENT (
   ID_TOURNAMENT        SERIAL                 not null,
   NAME_TOURNAMENT      VARCHAR(100)         not null,
   DATE_START_TOURNAMENT DATE                 not null,
   DATE_END_TOURNAMENT  DATE                 null,
   constraint PK_TOURNAMENT primary key (ID_TOURNAMENT)
);

/*==============================================================*/
/* Index: TOURNAMENT_PK                                         */
/*==============================================================*/
create unique index TOURNAMENT_PK on TOURNAMENT (
ID_TOURNAMENT
);

alter table MATCH
   add constraint FK_MATCH_MATCHTOUR_TOURNAME foreign key (ID_TOURNAMENT)
      references TOURNAMENT (ID_TOURNAMENT)
      on delete restrict on update restrict;

alter table TABLEPOINTS
   add constraint FK_TABLEPOI_TABLETOUR_TOURNAME foreign key (ID_TOURNAMENT)
      references TOURNAMENT (ID_TOURNAMENT)
      on delete restrict on update restrict;

alter table TABLEPOINTS
   add constraint FK_TABLEPOI_TEAMPOINT_TEAMS foreign key (ID_TEAM)
      references TEAMS (ID_TEAM)
      on delete restrict on update restrict;

alter table TEAMS
   add constraint UQ_NAME_TEAM
   unique (NAME_TEAM);