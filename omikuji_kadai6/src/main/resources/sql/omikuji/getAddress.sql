--入力途中の住所文字列による住所検索
-- !df:pmb!
-- #df:entity#

select distinct prefecture, city, town
from test.post_code_data
where not town = ''
and prefecture || city || town like /*pmb.address*/ || '%' 
order by prefecture, city, town;
