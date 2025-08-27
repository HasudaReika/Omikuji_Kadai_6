--過去半年のおみくじの結果を抽出
-- !df:pmb!
-- #df:entity#
-- !!LocalDate sixMonthsAgo!!
select f.fortune_name, count(r.omikuji_code) as count
from fortune_master f
left join omikuji o 
on f.fortune_code = o.fortune_code
left join result r 
on o.omikuji_code = r.omikuji_code 
and r.fortune_telling_date >= /*pmb.sixMonthsAgo*/ 
group by f.fortune_code 
order by f.fortune_code;