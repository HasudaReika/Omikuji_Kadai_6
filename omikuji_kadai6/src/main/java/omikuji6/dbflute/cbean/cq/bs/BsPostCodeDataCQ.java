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
 * The base condition-query of post_code_data.
 * @author DBFlute(AutoGenerator)
 */
public class BsPostCodeDataCQ extends AbstractBsPostCodeDataCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PostCodeDataCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPostCodeDataCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from post_code_data) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PostCodeDataCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PostCodeDataCIQ xcreateCIQ() {
        PostCodeDataCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PostCodeDataCIQ xnewCIQ() {
        return new PostCodeDataCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join post_code_data on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PostCodeDataCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PostCodeDataCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _id;
    public ConditionValue xdfgetId()
    { if (_id == null) { _id = nCV(); }
      return _id; }
    protected ConditionValue xgetCValueId() { return xdfgetId(); }

    /**
     * Add order-by as ascend. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsPostCodeDataCQ addOrderBy_Id_Asc() { regOBA("id"); return this; }

    /**
     * Add order-by as descend. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsPostCodeDataCQ addOrderBy_Id_Desc() { regOBD("id"); return this; }

    protected ConditionValue _postCode;
    public ConditionValue xdfgetPostCode()
    { if (_postCode == null) { _postCode = nCV(); }
      return _postCode; }
    protected ConditionValue xgetCValuePostCode() { return xdfgetPostCode(); }

    /**
     * Add order-by as ascend. <br>
     * post_code: {NotNull, varchar(7)}
     * @return this. (NotNull)
     */
    public BsPostCodeDataCQ addOrderBy_PostCode_Asc() { regOBA("post_code"); return this; }

    /**
     * Add order-by as descend. <br>
     * post_code: {NotNull, varchar(7)}
     * @return this. (NotNull)
     */
    public BsPostCodeDataCQ addOrderBy_PostCode_Desc() { regOBD("post_code"); return this; }

    protected ConditionValue _prefectureKatakana;
    public ConditionValue xdfgetPrefectureKatakana()
    { if (_prefectureKatakana == null) { _prefectureKatakana = nCV(); }
      return _prefectureKatakana; }
    protected ConditionValue xgetCValuePrefectureKatakana() { return xdfgetPrefectureKatakana(); }

    /**
     * Add order-by as ascend. <br>
     * prefecture_katakana: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsPostCodeDataCQ addOrderBy_PrefectureKatakana_Asc() { regOBA("prefecture_katakana"); return this; }

    /**
     * Add order-by as descend. <br>
     * prefecture_katakana: {NotNull, varchar(30)}
     * @return this. (NotNull)
     */
    public BsPostCodeDataCQ addOrderBy_PrefectureKatakana_Desc() { regOBD("prefecture_katakana"); return this; }

    protected ConditionValue _cityKatakana;
    public ConditionValue xdfgetCityKatakana()
    { if (_cityKatakana == null) { _cityKatakana = nCV(); }
      return _cityKatakana; }
    protected ConditionValue xgetCValueCityKatakana() { return xdfgetCityKatakana(); }

    /**
     * Add order-by as ascend. <br>
     * city_katakana: {NotNull, varchar(40)}
     * @return this. (NotNull)
     */
    public BsPostCodeDataCQ addOrderBy_CityKatakana_Asc() { regOBA("city_katakana"); return this; }

    /**
     * Add order-by as descend. <br>
     * city_katakana: {NotNull, varchar(40)}
     * @return this. (NotNull)
     */
    public BsPostCodeDataCQ addOrderBy_CityKatakana_Desc() { regOBD("city_katakana"); return this; }

    protected ConditionValue _townKatakana;
    public ConditionValue xdfgetTownKatakana()
    { if (_townKatakana == null) { _townKatakana = nCV(); }
      return _townKatakana; }
    protected ConditionValue xgetCValueTownKatakana() { return xdfgetTownKatakana(); }

    /**
     * Add order-by as ascend. <br>
     * town_katakana: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsPostCodeDataCQ addOrderBy_TownKatakana_Asc() { regOBA("town_katakana"); return this; }

    /**
     * Add order-by as descend. <br>
     * town_katakana: {NotNull, varchar(60)}
     * @return this. (NotNull)
     */
    public BsPostCodeDataCQ addOrderBy_TownKatakana_Desc() { regOBD("town_katakana"); return this; }

    protected ConditionValue _prefecture;
    public ConditionValue xdfgetPrefecture()
    { if (_prefecture == null) { _prefecture = nCV(); }
      return _prefecture; }
    protected ConditionValue xgetCValuePrefecture() { return xdfgetPrefecture(); }

    /**
     * Add order-by as ascend. <br>
     * prefecture: {NotNull, varchar(20)}
     * @return this. (NotNull)
     */
    public BsPostCodeDataCQ addOrderBy_Prefecture_Asc() { regOBA("prefecture"); return this; }

    /**
     * Add order-by as descend. <br>
     * prefecture: {NotNull, varchar(20)}
     * @return this. (NotNull)
     */
    public BsPostCodeDataCQ addOrderBy_Prefecture_Desc() { regOBD("prefecture"); return this; }

    protected ConditionValue _city;
    public ConditionValue xdfgetCity()
    { if (_city == null) { _city = nCV(); }
      return _city; }
    protected ConditionValue xgetCValueCity() { return xdfgetCity(); }

    /**
     * Add order-by as ascend. <br>
     * city: {NotNull, varchar(20)}
     * @return this. (NotNull)
     */
    public BsPostCodeDataCQ addOrderBy_City_Asc() { regOBA("city"); return this; }

    /**
     * Add order-by as descend. <br>
     * city: {NotNull, varchar(20)}
     * @return this. (NotNull)
     */
    public BsPostCodeDataCQ addOrderBy_City_Desc() { regOBD("city"); return this; }

    protected ConditionValue _town;
    public ConditionValue xdfgetTown()
    { if (_town == null) { _town = nCV(); }
      return _town; }
    protected ConditionValue xgetCValueTown() { return xdfgetTown(); }

    /**
     * Add order-by as ascend. <br>
     * town: {NotNull, varchar(50)}
     * @return this. (NotNull)
     */
    public BsPostCodeDataCQ addOrderBy_Town_Asc() { regOBA("town"); return this; }

    /**
     * Add order-by as descend. <br>
     * town: {NotNull, varchar(50)}
     * @return this. (NotNull)
     */
    public BsPostCodeDataCQ addOrderBy_Town_Desc() { regOBD("town"); return this; }

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
    public BsPostCodeDataCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsPostCodeDataCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, PostCodeDataCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PostCodeDataCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PostCodeDataCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PostCodeDataCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PostCodeDataCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PostCodeDataCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PostCodeDataCQ> _myselfExistsMap;
    public Map<String, PostCodeDataCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PostCodeDataCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PostCodeDataCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PostCodeDataCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PostCodeDataCB.class.getName(); }
    protected String xCQ() { return PostCodeDataCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
