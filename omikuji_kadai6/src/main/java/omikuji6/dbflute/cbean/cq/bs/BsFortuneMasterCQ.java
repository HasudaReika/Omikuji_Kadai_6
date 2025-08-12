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
 * The base condition-query of fortune_master.
 * @author DBFlute(AutoGenerator)
 */
public class BsFortuneMasterCQ extends AbstractBsFortuneMasterCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected FortuneMasterCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsFortuneMasterCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from fortune_master) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public FortuneMasterCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected FortuneMasterCIQ xcreateCIQ() {
        FortuneMasterCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected FortuneMasterCIQ xnewCIQ() {
        return new FortuneMasterCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join fortune_master on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public FortuneMasterCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        FortuneMasterCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _fortuneCode;
    public ConditionValue xdfgetFortuneCode()
    { if (_fortuneCode == null) { _fortuneCode = nCV(); }
      return _fortuneCode; }
    protected ConditionValue xgetCValueFortuneCode() { return xdfgetFortuneCode(); }

    public Map<String, OmikujiCQ> xdfgetFortuneCode_ExistsReferrer_OmikujiList() { return xgetSQueMap("fortuneCode_ExistsReferrer_OmikujiList"); }
    public String keepFortuneCode_ExistsReferrer_OmikujiList(OmikujiCQ sq) { return xkeepSQue("fortuneCode_ExistsReferrer_OmikujiList", sq); }

    public Map<String, OmikujiCQ> xdfgetFortuneCode_NotExistsReferrer_OmikujiList() { return xgetSQueMap("fortuneCode_NotExistsReferrer_OmikujiList"); }
    public String keepFortuneCode_NotExistsReferrer_OmikujiList(OmikujiCQ sq) { return xkeepSQue("fortuneCode_NotExistsReferrer_OmikujiList", sq); }

    public Map<String, OmikujiCQ> xdfgetFortuneCode_SpecifyDerivedReferrer_OmikujiList() { return xgetSQueMap("fortuneCode_SpecifyDerivedReferrer_OmikujiList"); }
    public String keepFortuneCode_SpecifyDerivedReferrer_OmikujiList(OmikujiCQ sq) { return xkeepSQue("fortuneCode_SpecifyDerivedReferrer_OmikujiList", sq); }

    public Map<String, OmikujiCQ> xdfgetFortuneCode_QueryDerivedReferrer_OmikujiList() { return xgetSQueMap("fortuneCode_QueryDerivedReferrer_OmikujiList"); }
    public String keepFortuneCode_QueryDerivedReferrer_OmikujiList(OmikujiCQ sq) { return xkeepSQue("fortuneCode_QueryDerivedReferrer_OmikujiList", sq); }
    public Map<String, Object> xdfgetFortuneCode_QueryDerivedReferrer_OmikujiListParameter() { return xgetSQuePmMap("fortuneCode_QueryDerivedReferrer_OmikujiList"); }
    public String keepFortuneCode_QueryDerivedReferrer_OmikujiListParameter(Object pm) { return xkeepSQuePm("fortuneCode_QueryDerivedReferrer_OmikujiList", pm); }

    /**
     * Add order-by as ascend. <br>
     * fortune_code: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsFortuneMasterCQ addOrderBy_FortuneCode_Asc() { regOBA("fortune_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * fortune_code: {PK, NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsFortuneMasterCQ addOrderBy_FortuneCode_Desc() { regOBD("fortune_code"); return this; }

    protected ConditionValue _fortuneName;
    public ConditionValue xdfgetFortuneName()
    { if (_fortuneName == null) { _fortuneName = nCV(); }
      return _fortuneName; }
    protected ConditionValue xgetCValueFortuneName() { return xdfgetFortuneName(); }

    /**
     * Add order-by as ascend. <br>
     * fortune_name: {NotNull, varchar(10)}
     * @return this. (NotNull)
     */
    public BsFortuneMasterCQ addOrderBy_FortuneName_Asc() { regOBA("fortune_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * fortune_name: {NotNull, varchar(10)}
     * @return this. (NotNull)
     */
    public BsFortuneMasterCQ addOrderBy_FortuneName_Desc() { regOBD("fortune_name"); return this; }

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
    public BsFortuneMasterCQ addOrderBy_UpdatedBy_Asc() { regOBA("updated_by"); return this; }

    /**
     * Add order-by as descend. <br>
     * updated_by: {NotNull, varchar(20)}
     * @return this. (NotNull)
     */
    public BsFortuneMasterCQ addOrderBy_UpdatedBy_Desc() { regOBD("updated_by"); return this; }

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
    public BsFortuneMasterCQ addOrderBy_UpdatedDate_Asc() { regOBA("updated_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * updated_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsFortuneMasterCQ addOrderBy_UpdatedDate_Desc() { regOBD("updated_date"); return this; }

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
    public BsFortuneMasterCQ addOrderBy_CreatedBy_Asc() { regOBA("created_by"); return this; }

    /**
     * Add order-by as descend. <br>
     * created_by: {NotNull, varchar(20)}
     * @return this. (NotNull)
     */
    public BsFortuneMasterCQ addOrderBy_CreatedBy_Desc() { regOBD("created_by"); return this; }

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
    public BsFortuneMasterCQ addOrderBy_CreatedDate_Asc() { regOBA("created_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * created_date: {date(13)}
     * @return this. (NotNull)
     */
    public BsFortuneMasterCQ addOrderBy_CreatedDate_Desc() { regOBD("created_date"); return this; }

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
    public BsFortuneMasterCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsFortuneMasterCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, FortuneMasterCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(FortuneMasterCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, FortuneMasterCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(FortuneMasterCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, FortuneMasterCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(FortuneMasterCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, FortuneMasterCQ> _myselfExistsMap;
    public Map<String, FortuneMasterCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(FortuneMasterCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, FortuneMasterCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(FortuneMasterCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return FortuneMasterCB.class.getName(); }
    protected String xCQ() { return FortuneMasterCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
