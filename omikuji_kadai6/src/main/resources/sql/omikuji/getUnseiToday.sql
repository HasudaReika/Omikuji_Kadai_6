--本日の運勢の割合を抽出
-- !df:pmb!
-- !!AutoDetect!!
-- #df:entity#
select f.fortune_name, coalesce(count(r.omikuji_code),0) as count
from fortune_master f
left join omikuji o 
on f.fortune_code = o.fortune_code
left join result r 
on o.omikuji_code = r.omikuji_code 
and r.fortune_telling_date = current_date
group by f.fortune_code　
order by f.fortune_code;