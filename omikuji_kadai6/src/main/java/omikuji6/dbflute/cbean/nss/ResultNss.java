package omikuji6.dbflute.cbean.nss;

import omikuji6.dbflute.cbean.cq.ResultCQ;

/**
 * The nest select set-upper of result.
 * @author DBFlute(AutoGenerator)
 */
public class ResultNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final ResultCQ _query;
    public ResultNss(ResultCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * omikuji by my omikuji_code, named 'omikuji'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public OmikujiNss withOmikuji() {
        _query.xdoNss(() -> _query.queryOmikuji());
        return new OmikujiNss(_query.queryOmikuji());
    }
}
