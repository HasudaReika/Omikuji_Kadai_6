package omikuji6.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import omikuji6.dbflute.cbean.cq.ciq.*;
import omikuji6.dbflute.cbean.*;
import omikuji6.dbflute.cbean.cq.*;

/**
 * The base condition-query of omikuji_csv.
 * @author DBFlute(AutoGenerator)
 */
public class BsOmikujiCsvCQ extends AbstractBsOmikujiCsvCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected OmikujiCsvCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsOmikujiCsvCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from omikuji_csv) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public OmikujiCsvCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected OmikujiCsvCIQ xcreateCIQ() {
        OmikujiCsvCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected OmikujiCsvCIQ xnewCIQ() {
        return new OmikujiCsvCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join omikuji_csv on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public OmikujiCsvCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        OmikujiCsvCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _number;
    public ConditionValue xdfgetNumber()
    { if (_number == null) { _number = nCV(); }
      return _number; }
    protected ConditionValue xgetCValueNumber() { return xdfgetNumber(); }

    /**
     * Add order-by as ascend. <br>
     * number: {NotNull, serial(10), default=[nextval('omikuji_csv_number_seq'::regclass)]}
     * @return this. (NotNull)
     */
    public BsOmikujiCsvCQ addOrderBy_Number_Asc() { regOBA("number"); return this; }

    /**
     * Add order-by as descend. <br>
     * number: {NotNull, serial(10), default=[nextval('omikuji_csv_number_seq'::regclass)]}
     * @return this. (NotNull)
     */
    public BsOmikujiCsvCQ addOrderBy_Number_Desc() { regOBD("number"); return this; }

    protected ConditionValue _unsei;
    public ConditionValue xdfgetUnsei()
    { if (_unsei == null) { _unsei = nCV(); }
      return _unsei; }
    protected ConditionValue xgetCValueUnsei() { return xdfgetUnsei(); }

    /**
     * Add order-by as ascend. <br>
     * unsei: {varchar(10)}
     * @return this. (NotNull)
     */
    public BsOmikujiCsvCQ addOrderBy_Unsei_Asc() { regOBA("unsei"); return this; }

    /**
     * Add order-by as descend. <br>
     * unsei: {varchar(10)}
     * @return this. (NotNull)
     */
    public BsOmikujiCsvCQ addOrderBy_Unsei_Desc() { regOBD("unsei"); return this; }

    protected ConditionValue _negaigoto;
    public ConditionValue xdfgetNegaigoto()
    { if (_negaigoto == null) { _negaigoto = nCV(); }
      return _negaigoto; }
    protected ConditionValue xgetCValueNegaigoto() { return xdfgetNegaigoto(); }

    /**
     * Add order-by as ascend. <br>
     * negaigoto: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsOmikujiCsvCQ addOrderBy_Negaigoto_Asc() { regOBA("negaigoto"); return this; }

    /**
     * Add order-by as descend. <br>
     * negaigoto: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsOmikujiCsvCQ addOrderBy_Negaigoto_Desc() { regOBD("negaigoto"); return this; }

    protected ConditionValue _akinai;
    public ConditionValue xdfgetAkinai()
    { if (_akinai == null) { _akinai = nCV(); }
      return _akinai; }
    protected ConditionValue xgetCValueAkinai() { return xdfgetAkinai(); }

    /**
     * Add order-by as ascend. <br>
     * akinai: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsOmikujiCsvCQ addOrderBy_Akinai_Asc() { regOBA("akinai"); return this; }

    /**
     * Add order-by as descend. <br>
     * akinai: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsOmikujiCsvCQ addOrderBy_Akinai_Desc() { regOBD("akinai"); return this; }

    protected ConditionValue _gakumon;
    public ConditionValue xdfgetGakumon()
    { if (_gakumon == null) { _gakumon = nCV(); }
      return _gakumon; }
    protected ConditionValue xgetCValueGakumon() { return xdfgetGakumon(); }

    /**
     * Add order-by as ascend. <br>
     * gakumon: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsOmikujiCsvCQ addOrderBy_Gakumon_Asc() { regOBA("gakumon"); return this; }

    /**
     * Add order-by as descend. <br>
     * gakumon: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsOmikujiCsvCQ addOrderBy_Gakumon_Desc() { regOBD("gakumon"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsOmikujiCsvCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsOmikujiCsvCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, OmikujiCsvCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(OmikujiCsvCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return OmikujiCsvCB.class.getName(); }
    protected String xCQ() { return OmikujiCsvCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
