package omikuji6.dbflute.cbean.nss;

import omikuji6.dbflute.cbean.cq.OmikujiCQ;

/**
 * The nest select set-upper of omikuji.
 * @author DBFlute(AutoGenerator)
 */
public class OmikujiNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final OmikujiCQ _query;
    public OmikujiNss(OmikujiCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * fortune_master by my fortune_code, named 'fortuneMaster'.
     */
    public void withFortuneMaster() {
        _query.xdoNss(() -> _query.queryFortuneMaster());
    }
}
