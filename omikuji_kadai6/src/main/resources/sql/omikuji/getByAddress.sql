--住所による郵便番号検索
-- !df:pmb!
-- #df:entity#

select post_code from test.post_code_data
where /*pmb.address*/ 
like '%' || prefecture || city || town || '%'
order by length(town) desc
limit 1;