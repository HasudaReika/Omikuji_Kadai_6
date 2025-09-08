--住所による郵便番号検索
-- !df:pmb!
-- #df:entity#

select post_code 
from test.post_code_data
where translate(/*pmb.address*/, 'がガヶケ', 'ガガガガ') 
like '%' || translate(prefecture || city || town, 'がガヶケ', 'ガガガガ') || '%'
or translate(/*pmb.address*/, 'のノ乃之', 'ノノノノ') 
like '%' || translate(prefecture || city || town, 'のノ乃之', 'ノノノノ') || '%'
order by length(town) desc
limit 1;