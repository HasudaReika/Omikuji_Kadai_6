--住所による郵便番号検索
-- !df:pmb!
-- #df:entity#

select post_code from test.post_code_data
where /*pmb.address*/ 
like '%' || prefecture || city || town || '%'
or /*pmb.katakanaAddress*/ 
like '%' || prefecture_katakana || city_katakana || town_katakana || '%'
order by length(town) desc;
