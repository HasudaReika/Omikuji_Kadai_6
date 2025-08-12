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
 * The base condition-query of omikuji.
 * @author DBFlute(AutoGenerator)
 */
public class BsOmikujiCQ extends AbstractBsOmikujiCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected OmikujiCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsOmikujiCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from omikuji) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public OmikujiCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected OmikujiCIQ xcreateCIQ() {
        OmikujiCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected OmikujiCIQ xnewCIQ() {
        return new OmikujiCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join omikuji on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public OmikujiCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        OmikujiCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _omikujiCode;
    public ConditionValue xdfgetOmikujiCode()
    { if (_omikujiCode == null) { _omikujiCode = nCV(); }
      return _omikujiCode; }
    protected ConditionValue xgetCValueOmikujiCode() { return xdfgetOmikujiCode(); }

    public Map<String, ResultCQ> xdfgetOmikujiCode_ExistsReferrer_ResultList() { return xgetSQueMap("omikujiCode_ExistsReferrer_ResultList"); }
    public String keepOmikujiCode_ExistsReferrer_ResultList(ResultCQ sq) { return xkeepSQue("omikujiCode_ExistsReferrer_ResultList", sq); }

    public Map<String, ResultCQ> xdfgetOmikujiCode_NotExistsReferrer_ResultList() { return xgetSQueMap("omikujiCode_NotExistsReferrer_ResultList"); }
    public String keepOmikujiCode_NotExistsReferrer_ResultList(ResultCQ sq) { return xkeepSQue("omikujiCode_NotExistsReferrer_ResultList", sq); }

    public Map<String, ResultCQ> xdfgetOmikujiCode_SpecifyDerivedReferrer_ResultList() { return xgetSQueMap("omikujiCode_SpecifyDerivedReferrer_ResultList"); }
    public String keepOmikujiCode_SpecifyDerivedReferrer_ResultList(ResultCQ sq) { return xkeepSQue("omikujiCode_SpecifyDerivedReferrer_ResultList", sq); }

    public Map<String, ResultCQ> xdfgetOmikujiCode_QueryDerivedReferrer_ResultList() { return xgetSQueMap("omikujiCode_QueryDerivedReferrer_ResultList"); }
    public String keepOmikujiCode_QueryDerivedReferrer_ResultList(ResultCQ sq) { return xkeepSQue("omikujiCode_QueryDerivedReferrer_ResultList", sq); }
    public Map<String, Object> xdfgetOmikujiCode_QueryDerivedReferrer_ResultListParameter() { return xgetSQuePmMap("omikujiCode_QueryDerivedReferrer_ResultList"); }
    public String keepOmikujiCode_QueryDerivedReferrer_ResultListParameter(Object pm) { return xkeepSQuePm("omikujiCode_QueryDerivedReferrer_ResultList", pm); }

    /**
     * Add order-by as ascend. <br>
     * omikuji_code: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsOmikujiCQ addOrderBy_OmikujiCode_Asc() { regOBA("omikuji_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * omikuji_code: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsOmikujiCQ addOrderBy_OmikujiCode_Desc() { regOBD("omikuji_code"); return this; }

    protected ConditionValue _fortuneCode;
    public ConditionValue xdfgetFortuneCode()
    { if (_fortuneCode == null) { _fortuneCode = nCV(); }
      return _fortuneCode; }
    protected ConditionValue xgetCValueFortuneCode() { return xdfgetFortuneCode(); }

    /**
     * Add order-by as ascend. <br>
     * fortune_code: {int4(10), FK to fortune_master}
     * @return this. (NotNull)
     */
    public BsOmikujiCQ addOrderBy_FortuneCode_Asc() { regOBA("fortune_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * fortune_code: {int4(10), FK to fortune_master}
     * @return this. (NotNull)
     */
    public BsOmikujiCQ addOrderBy_FortuneCode_Desc() { regOBD("fortune_code"); return this; }

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
    public BsOmikujiCQ addOrderBy_Negaigoto_Asc() { regOBA("negaigoto"); return this; }

    /**
     * Add order-by as descend. <br>
     * negaigoto: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsOmikujiCQ addOrderBy_Negaigoto_Desc() { regOBD("negaigoto"); return this; }

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
    public BsOmikujiCQ addOrderBy_Akinai_Asc() { regOBA("akinai"); return this; }

    /**
     * Add order-by as descend. <br>
     * akinai: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsOmikujiCQ addOrderBy_Akinai_Desc() { regOBD("akinai"); return this; }

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
    public BsOmikujiCQ addOrderBy_Gakumon_Asc() { regOBA("gakumon"); return this; }

    /**
     * Add order-by as descend. <br>
     * gakumon: {varchar(30)}
     * @return this. (NotNull)
     */
    public BsOmikujiCQ addOrderBy_Gakumon_Desc() { regOBD("gakumon"); return this; }

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
    public BsOmikujiCQ addOrderBy_UpdatedBy_Asc() { regOBA("updated_by"); return this; }

    /**
     * Add order-by as descend. <br>
     * updated_by: {NotNull, varchar(20)}
     * @return this. (NotNull)
     */
    public BsOmikujiCQ addOrderBy_UpdatedBy_Desc() { regOBD("updated_by"); return this; }

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
    public BsOmikujiCQ addOrderBy_UpdatedDate_Asc() { regOBA("updated_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * updated_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsOmikujiCQ addOrderBy_UpdatedDate_Desc() { regOBD("updated_date"); return this; }

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
    public BsOmikujiCQ addOrderBy_CreatedBy_Asc() { regOBA("created_by"); return this; }

    /**
     * Add order-by as descend. <br>
     * created_by: {NotNull, varchar(20)}
     * @return this. (NotNull)
     */
    public BsOmikujiCQ addOrderBy_CreatedBy_Desc() { regOBD("created_by"); return this; }

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
    public BsOmikujiCQ addOrderBy_CreatedDate_Asc() { regOBA("created_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * created_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsOmikujiCQ addOrderBy_CreatedDate_Desc() { regOBD("created_date"); return this; }

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
    public BsOmikujiCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsOmikujiCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        OmikujiCQ bq = (OmikujiCQ)bqs;
        OmikujiCQ uq = (OmikujiCQ)uqs;
        if (bq.hasConditionQueryFortuneMaster()) {
            uq.queryFortuneMaster().reflectRelationOnUnionQuery(bq.queryFortuneMaster(), uq.queryFortuneMaster());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * fortune_master by my fortune_code, named 'fortuneMaster'.
     * @return The instance of condition-query. (NotNull)
     */
    public FortuneMasterCQ queryFortuneMaster() {
        return xdfgetConditionQueryFortuneMaster();
    }
    public FortuneMasterCQ xdfgetConditionQueryFortuneMaster() {
        String prop = "fortuneMaster";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryFortuneMaster()); xsetupOuterJoinFortuneMaster(); }
        return xgetQueRlMap(prop);
    }
    protected FortuneMasterCQ xcreateQueryFortuneMaster() {
        String nrp = xresolveNRP("omikuji", "fortuneMaster"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new FortuneMasterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "fortuneMaster", nrp);
    }
    protected void xsetupOuterJoinFortuneMaster() { xregOutJo("fortuneMaster"); }
    public boolean hasConditionQueryFortuneMaster() { return xhasQueRlMap("fortuneMaster"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, OmikujiCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(OmikujiCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, OmikujiCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(OmikujiCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, OmikujiCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(OmikujiCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, OmikujiCQ> _myselfExistsMap;
    public Map<String, OmikujiCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(OmikujiCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, OmikujiCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(OmikujiCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return OmikujiCB.class.getName(); }
    protected String xCQ() { return OmikujiCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
