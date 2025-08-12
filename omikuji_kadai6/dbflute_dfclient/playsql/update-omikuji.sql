--願い事、商い、学問を追加--
update omikuji as t1
set negaigoto = t2.negaigoto,
    akinai = t2.akinai,
    gakumon = t2.gakumon
from omikuji_csv as t2
where t1.omikuji_code = t2.number;