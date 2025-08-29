  /*
   [Simple test table]   
   this sql is for test.
  */
-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!

--シーケンス作成--
create sequence seq_fortune_code cache 1;
create sequence seq_omikuji_code cache 1;

--運勢マスタテーブルの作成--
create table fortune_master(
fortune_code integer primary key,
fortune_name varchar(10) not null,
updated_by varchar(20) not null,
updated_date date,
created_by varchar(20) not null,
created_date date
);

--おみくじテーブルの作成--
create table omikuji(
omikuji_code integer primary key,
fortune_code integer references fortune_master(fortune_code),
negaigoto varchar(30),
akinai varchar(30),
gakumon varchar(30),
updated_by varchar(20) not null,
updated_date date,
created_by varchar(20) not null,
created_date date
);

--結果テーブルの作成--
create table result(
result_code serial primary key,
fortune_telling_date date,
birthday date,
omikuji_code integer references omikuji(omikuji_code),
updated_by varchar(20) not null,
updated_date date,
created_by varchar(20) not null,
created_date date
);

--送付先テーブル作成--
create table shipping(
post_code integer,
address varchar(100),
name varchar(20)
);

--csvファイルを読み込むテーブル作成--
create table omikuji_csv(
number serial,
unsei varchar(10),
negaigoto varchar(30),
akinai varchar(30),
gakumon varchar(30));

--レコード登録--
insert into fortune_master values
(nextval('seq_fortune_code'), '大吉', '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_fortune_code'), '中吉', '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_fortune_code'), '小吉', '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_fortune_code'), '末吉', '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_fortune_code'), '吉', '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_fortune_code'), '凶', '蓮田', '2025/07/09', '蓮田', '2025/07/09');


insert into omikuji (omikuji_code, fortune_code, negaigoto, akinai, gakumon, updated_by, updated_date, created_by, created_date) values
(nextval('seq_omikuji_code'),'1',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'1',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'1',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'1',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'1',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'1',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'1',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'2',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'2',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'2',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'2',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'2',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'2',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'2',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'3',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'3',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'3',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'3',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'3',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'3',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'3',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'4',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'4',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'4',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'4',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'4',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'4',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'4',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'5',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'5',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'5',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'5',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'5',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'5',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'5',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'6',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'6',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'6',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'6',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'6',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'6',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09'),
(nextval('seq_omikuji_code'),'6',null, null, null, '蓮田', '2025/07/09', '蓮田', '2025/07/09');


--願い事、商い、学問を追加--
--csvの読み込みが多分一番最後だから一旦手作業 あとで別のクラスで
update omikuji as t1
set negaigoto = t2.negaigoto,
    akinai = t2.akinai,
    gakumon = t2.gakumon
from omikuji_csv as t2
where t1.omikuji_code = t2.number;

--郵便番号テーブルを作成--
create table post_code_data(
id serial primary key,
post_code varchar(7),
prefecture varchar(20),
city varchar(20),
town varchar(50)
);

--送付先テーブル--
create table shipping(
id serial primary key,
result_code integer references result(result_code),
post_code varchar(7),
address varchar(200),
name varchar(30),
phone varchar(11),
mail varchar(200)
);

