--郵便番号による住所検索
-- !df:pmb!
-- #df:entity#

select distinct prefecture, city, town 
from post_code_data
where post_code = /*pmb.postCode*/