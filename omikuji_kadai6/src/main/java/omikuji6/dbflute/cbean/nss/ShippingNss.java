package omikuji6.dbflute.cbean.nss;

import omikuji6.dbflute.cbean.cq.ShippingCQ;

/**
 * The nest select set-upper of shipping.
 * @author DBFlute(AutoGenerator)
 */
public class ShippingNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final ShippingCQ _query;
    public ShippingNss(ShippingCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * result by my result_code, named 'result'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public ResultNss withResult() {
        _query.xdoNss(() -> _query.queryResult());
        return new ResultNss(_query.queryResult());
    }
}
