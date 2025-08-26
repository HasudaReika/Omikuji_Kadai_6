--過去半年のおみくじの結果を抽出
-- !df:pmb!
-- !!AutoDetect!!
-- !!LocalDate birthday!!
-- !!LocalDate sixMonthsAgo!!
-- #df:entity#
select fortune_telling_date, fortune_name, negaigoto, akinai, gakumon
from result r inner join omikuji o
on r.omikuji_code = o.omikuji_code
inner join fortune_master f
on o.fortune_code = f.fortune_code
where r.fortune_telling_date >= /*pmb.sixMonthsAgo*/ 
and birthday = /*pmb.birthday*/;