--本日の運勢の割合を抽出
-- !df:pmb!
-- !!AutoDetect!!
-- #df:entity#
select fortune_name, count(*)  from result r inner join omikuji o
on r.omikuji_code = o.omikuji_code
inner join fortune_master f
on o.fortune_code = f.fortune_code
where r.fortune_telling_date = current_date
group by f.fortune_code
order by f.fortune_code;