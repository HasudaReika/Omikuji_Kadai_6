--過去半年のおみくじの結果を抽出
-- !df:pmb!
-- #df:entity#
select fortune_name , count(*) from result r inner join omikuji o
on r.omikuji_code = o.omikuji_code
inner join fortune_master f
on o.fortune_code = f.fortune_code
where r.fortune_telling_date >= /*pmb.sixMonthsAgo*/ now() - interval '6 month'
group by f.fortune_code
order by f.fortune_code;