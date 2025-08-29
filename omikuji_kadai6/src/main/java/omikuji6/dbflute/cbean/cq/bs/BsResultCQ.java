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
 * The base condition-query of result.
 * @author DBFlute(AutoGenerator)
 */
public class BsResultCQ extends AbstractBsResultCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ResultCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsResultCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from result) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ResultCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ResultCIQ xcreateCIQ() {
        ResultCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ResultCIQ xnewCIQ() {
        return new ResultCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join result on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ResultCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ResultCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _fortuneTellingDate;
    public ConditionValue xdfgetFortuneTellingDate()
    { if (_fortuneTellingDate == null) { _fortuneTellingDate = nCV(); }
      return _fortuneTellingDate; }
    protected ConditionValue xgetCValueFortuneTellingDate() { return xdfgetFortuneTellingDate(); }

    /**
     * Add order-by as ascend. <br>
     * fortune_telling_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsResultCQ addOrderBy_FortuneTellingDate_Asc() { regOBA("fortune_telling_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * fortune_telling_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsResultCQ addOrderBy_FortuneTellingDate_Desc() { regOBD("fortune_telling_date"); return this; }

    protected ConditionValue _birthday;
    public ConditionValue xdfgetBirthday()
    { if (_birthday == null) { _birthday = nCV(); }
      return _birthday; }
    protected ConditionValue xgetCValueBirthday() { return xdfgetBirthday(); }

    /**
     * Add order-by as ascend. <br>
     * birthday: {date(13)}
     * @return this. (NotNull)
     */
    public BsResultCQ addOrderBy_Birthday_Asc() { regOBA("birthday"); return this; }

    /**
     * Add order-by as descend. <br>
     * birthday: {date(13)}
     * @return this. (NotNull)
     */
    public BsResultCQ addOrderBy_Birthday_Desc() { regOBD("birthday"); return this; }

    protected ConditionValue _omikujiCode;
    public ConditionValue xdfgetOmikujiCode()
    { if (_omikujiCode == null) { _omikujiCode = nCV(); }
      return _omikujiCode; }
    protected ConditionValue xgetCValueOmikujiCode() { return xdfgetOmikujiCode(); }

    /**
     * Add order-by as ascend. <br>
     * omikuji_code: {int4(10), FK to omikuji}
     * @return this. (NotNull)
     */
    public BsResultCQ addOrderBy_OmikujiCode_Asc() { regOBA("omikuji_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * omikuji_code: {int4(10), FK to omikuji}
     * @return this. (NotNull)
     */
    public BsResultCQ addOrderBy_OmikujiCode_Desc() { regOBD("omikuji_code"); return this; }

    protected ConditionValue _updatedBy;
    public ConditionValue xdfgetUpdatedBy()
    { if (_updatedBy == null) { _updatedBy = nCV(); }
      return _updatedBy; }
    protected ConditionValue xgetCValueUpdatedBy() { return xdfgetUpdatedBy(); }

    /**
     * Add order-by as ascend. <br>
     * updated_by: {NotNull, varchar(20)}
     * @return this. (NotNull)
     */
    public BsResultCQ addOrderBy_UpdatedBy_Asc() { regOBA("updated_by"); return this; }

    /**
     * Add order-by as descend. <br>
     * updated_by: {NotNull, varchar(20)}
     * @return this. (NotNull)
     */
    public BsResultCQ addOrderBy_UpdatedBy_Desc() { regOBD("updated_by"); return this; }

    protected ConditionValue _updatedDate;
    public ConditionValue xdfgetUpdatedDate()
    { if (_updatedDate == null) { _updatedDate = nCV(); }
      return _updatedDate; }
    protected ConditionValue xgetCValueUpdatedDate() { return xdfgetUpdatedDate(); }

    /**
     * Add order-by as ascend. <br>
     * updated_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsResultCQ addOrderBy_UpdatedDate_Asc() { regOBA("updated_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * updated_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsResultCQ addOrderBy_UpdatedDate_Desc() { regOBD("updated_date"); return this; }

    protected ConditionValue _createdBy;
    public ConditionValue xdfgetCreatedBy()
    { if (_createdBy == null) { _createdBy = nCV(); }
      return _createdBy; }
    protected ConditionValue xgetCValueCreatedBy() { return xdfgetCreatedBy(); }

    /**
     * Add order-by as ascend. <br>
     * created_by: {NotNull, varchar(20)}
     * @return this. (NotNull)
     */
    public BsResultCQ addOrderBy_CreatedBy_Asc() { regOBA("created_by"); return this; }

    /**
     * Add order-by as descend. <br>
     * created_by: {NotNull, varchar(20)}
     * @return this. (NotNull)
     */
    public BsResultCQ addOrderBy_CreatedBy_Desc() { regOBD("created_by"); return this; }

    protected ConditionValue _createdDate;
    public ConditionValue xdfgetCreatedDate()
    { if (_createdDate == null) { _createdDate = nCV(); }
      return _createdDate; }
    protected ConditionValue xgetCValueCreatedDate() { return xdfgetCreatedDate(); }

    /**
     * Add order-by as ascend. <br>
     * created_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsResultCQ addOrderBy_CreatedDate_Asc() { regOBA("created_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * created_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsResultCQ addOrderBy_CreatedDate_Desc() { regOBD("created_date"); return this; }

    protected ConditionValue _resultCode;
    public ConditionValue xdfgetResultCode()
    { if (_resultCode == null) { _resultCode = nCV(); }
      return _resultCode; }
    protected ConditionValue xgetCValueResultCode() { return xdfgetResultCode(); }

    public Map<String, ShippingCQ> xdfgetResultCode_ExistsReferrer_ShippingList() { return xgetSQueMap("resultCode_ExistsReferrer_ShippingList"); }
    public String keepResultCode_ExistsReferrer_ShippingList(ShippingCQ sq) { return xkeepSQue("resultCode_ExistsReferrer_ShippingList", sq); }

    public Map<String, ShippingCQ> xdfgetResultCode_NotExistsReferrer_ShippingList() { return xgetSQueMap("resultCode_NotExistsReferrer_ShippingList"); }
    public String keepResultCode_NotExistsReferrer_ShippingList(ShippingCQ sq) { return xkeepSQue("resultCode_NotExistsReferrer_ShippingList", sq); }

    public Map<String, ShippingCQ> xdfgetResultCode_SpecifyDerivedReferrer_ShippingList() { return xgetSQueMap("resultCode_SpecifyDerivedReferrer_ShippingList"); }
    public String keepResultCode_SpecifyDerivedReferrer_ShippingList(ShippingCQ sq) { return xkeepSQue("resultCode_SpecifyDerivedReferrer_ShippingList", sq); }

    public Map<String, ShippingCQ> xdfgetResultCode_QueryDerivedReferrer_ShippingList() { return xgetSQueMap("resultCode_QueryDerivedReferrer_ShippingList"); }
    public String keepResultCode_QueryDerivedReferrer_ShippingList(ShippingCQ sq) { return xkeepSQue("resultCode_QueryDerivedReferrer_ShippingList", sq); }
    public Map<String, Object> xdfgetResultCode_QueryDerivedReferrer_ShippingListParameter() { return xgetSQuePmMap("resultCode_QueryDerivedReferrer_ShippingList"); }
    public String keepResultCode_QueryDerivedReferrer_ShippingListParameter(Object pm) { return xkeepSQuePm("resultCode_QueryDerivedReferrer_ShippingList", pm); }

    /**
     * Add order-by as ascend. <br>
     * result_code: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsResultCQ addOrderBy_ResultCode_Asc() { regOBA("result_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * result_code: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsResultCQ addOrderBy_ResultCode_Desc() { regOBD("result_code"); return this; }

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
    public BsResultCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsResultCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        ResultCQ bq = (ResultCQ)bqs;
        ResultCQ uq = (ResultCQ)uqs;
        if (bq.hasConditionQueryOmikuji()) {
            uq.queryOmikuji().reflectRelationOnUnionQuery(bq.queryOmikuji(), uq.queryOmikuji());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * omikuji by my omikuji_code, named 'omikuji'.
     * @return The instance of condition-query. (NotNull)
     */
    public OmikujiCQ queryOmikuji() {
        return xdfgetConditionQueryOmikuji();
    }
    public OmikujiCQ xdfgetConditionQueryOmikuji() {
        String prop = "omikuji";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryOmikuji()); xsetupOuterJoinOmikuji(); }
        return xgetQueRlMap(prop);
    }
    protected OmikujiCQ xcreateQueryOmikuji() {
        String nrp = xresolveNRP("result", "omikuji"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new OmikujiCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "omikuji", nrp);
    }
    protected void xsetupOuterJoinOmikuji() { xregOutJo("omikuji"); }
    public boolean hasConditionQueryOmikuji() { return xhasQueRlMap("omikuji"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, ResultCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(ResultCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, ResultCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(ResultCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, ResultCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(ResultCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, ResultCQ> _myselfExistsMap;
    public Map<String, ResultCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(ResultCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, ResultCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(ResultCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ResultCB.class.getName(); }
    protected String xCQ() { return ResultCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
