package omikuji6.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import omikuji6.dbflute.allcommon.*;
import omikuji6.dbflute.cbean.*;
import omikuji6.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of fortune_master.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsFortuneMasterCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsFortuneMasterCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "fortune_master";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_code: {PK, NotNull, int4(10)}
     * @param fortuneCode The value of fortuneCode as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFortuneCode_Equal(Integer fortuneCode) {
        doSetFortuneCode_Equal(fortuneCode);
    }

    protected void doSetFortuneCode_Equal(Integer fortuneCode) {
        regFortuneCode(CK_EQ, fortuneCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_code: {PK, NotNull, int4(10)}
     * @param fortuneCode The value of fortuneCode as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFortuneCode_NotEqual(Integer fortuneCode) {
        doSetFortuneCode_NotEqual(fortuneCode);
    }

    protected void doSetFortuneCode_NotEqual(Integer fortuneCode) {
        regFortuneCode(CK_NES, fortuneCode);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_code: {PK, NotNull, int4(10)}
     * @param fortuneCode The value of fortuneCode as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFortuneCode_GreaterThan(Integer fortuneCode) {
        regFortuneCode(CK_GT, fortuneCode);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_code: {PK, NotNull, int4(10)}
     * @param fortuneCode The value of fortuneCode as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFortuneCode_LessThan(Integer fortuneCode) {
        regFortuneCode(CK_LT, fortuneCode);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_code: {PK, NotNull, int4(10)}
     * @param fortuneCode The value of fortuneCode as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFortuneCode_GreaterEqual(Integer fortuneCode) {
        regFortuneCode(CK_GE, fortuneCode);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_code: {PK, NotNull, int4(10)}
     * @param fortuneCode The value of fortuneCode as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFortuneCode_LessEqual(Integer fortuneCode) {
        regFortuneCode(CK_LE, fortuneCode);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_code: {PK, NotNull, int4(10)}
     * @param minNumber The min number of fortuneCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fortuneCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setFortuneCode_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setFortuneCode_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_code: {PK, NotNull, int4(10)}
     * @param minNumber The min number of fortuneCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fortuneCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setFortuneCode_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFortuneCode(), "fortune_code", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * fortune_code: {PK, NotNull, int4(10)}
     * @param fortuneCodeList The collection of fortuneCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFortuneCode_InScope(Collection<Integer> fortuneCodeList) {
        doSetFortuneCode_InScope(fortuneCodeList);
    }

    protected void doSetFortuneCode_InScope(Collection<Integer> fortuneCodeList) {
        regINS(CK_INS, cTL(fortuneCodeList), xgetCValueFortuneCode(), "fortune_code");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * fortune_code: {PK, NotNull, int4(10)}
     * @param fortuneCodeList The collection of fortuneCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFortuneCode_NotInScope(Collection<Integer> fortuneCodeList) {
        doSetFortuneCode_NotInScope(fortuneCodeList);
    }

    protected void doSetFortuneCode_NotInScope(Collection<Integer> fortuneCodeList) {
        regINS(CK_NINS, cTL(fortuneCodeList), xgetCValueFortuneCode(), "fortune_code");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select fortune_code from omikuji where ...)} <br>
     * omikuji by fortune_code, named 'omikujiAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsOmikuji</span>(omikujiCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     omikujiCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of OmikujiList for 'exists'. (NotNull)
     */
    public void existsOmikuji(SubQuery<OmikujiCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        OmikujiCB cb = new OmikujiCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepFortuneCode_ExistsReferrer_OmikujiList(cb.query());
        registerExistsReferrer(cb.query(), "fortune_code", "fortune_code", pp, "omikujiList");
    }
    public abstract String keepFortuneCode_ExistsReferrer_OmikujiList(OmikujiCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select fortune_code from omikuji where ...)} <br>
     * omikuji by fortune_code, named 'omikujiAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsOmikuji</span>(omikujiCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     omikujiCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of FortuneCode_NotExistsReferrer_OmikujiList for 'not exists'. (NotNull)
     */
    public void notExistsOmikuji(SubQuery<OmikujiCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        OmikujiCB cb = new OmikujiCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepFortuneCode_NotExistsReferrer_OmikujiList(cb.query());
        registerNotExistsReferrer(cb.query(), "fortune_code", "fortune_code", pp, "omikujiList");
    }
    public abstract String keepFortuneCode_NotExistsReferrer_OmikujiList(OmikujiCQ sq);

    public void xsderiveOmikujiList(String fn, SubQuery<OmikujiCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        OmikujiCB cb = new OmikujiCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepFortuneCode_SpecifyDerivedReferrer_OmikujiList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "fortune_code", "fortune_code", pp, "omikujiList", al, op);
    }
    public abstract String keepFortuneCode_SpecifyDerivedReferrer_OmikujiList(OmikujiCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from omikuji where ...)} <br>
     * omikuji by fortune_code, named 'omikujiAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedOmikuji()</span>.<span style="color: #CC4747">max</span>(omikujiCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     omikujiCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     omikujiCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<OmikujiCB> derivedOmikuji() {
        return xcreateQDRFunctionOmikujiList();
    }
    protected HpQDRFunction<OmikujiCB> xcreateQDRFunctionOmikujiList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveOmikujiList(fn, sq, rd, vl, op));
    }
    public void xqderiveOmikujiList(String fn, SubQuery<OmikujiCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        OmikujiCB cb = new OmikujiCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepFortuneCode_QueryDerivedReferrer_OmikujiList(cb.query()); String prpp = keepFortuneCode_QueryDerivedReferrer_OmikujiListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "fortune_code", "fortune_code", sqpp, "omikujiList", rd, vl, prpp, op);
    }
    public abstract String keepFortuneCode_QueryDerivedReferrer_OmikujiList(OmikujiCQ sq);
    public abstract String keepFortuneCode_QueryDerivedReferrer_OmikujiListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * fortune_code: {PK, NotNull, int4(10)}
     */
    public void setFortuneCode_IsNull() { regFortuneCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * fortune_code: {PK, NotNull, int4(10)}
     */
    public void setFortuneCode_IsNotNull() { regFortuneCode(CK_ISNN, DOBJ); }

    protected void regFortuneCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFortuneCode(), "fortune_code"); }
    protected abstract ConditionValue xgetCValueFortuneCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fortune_name: {NotNull, varchar(10)}
     * @param fortuneName The value of fortuneName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFortuneName_Equal(String fortuneName) {
        doSetFortuneName_Equal(fRES(fortuneName));
    }

    protected void doSetFortuneName_Equal(String fortuneName) {
        regFortuneName(CK_EQ, fortuneName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fortune_name: {NotNull, varchar(10)}
     * @param fortuneName The value of fortuneName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFortuneName_NotEqual(String fortuneName) {
        doSetFortuneName_NotEqual(fRES(fortuneName));
    }

    protected void doSetFortuneName_NotEqual(String fortuneName) {
        regFortuneName(CK_NES, fortuneName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fortune_name: {NotNull, varchar(10)}
     * @param fortuneName The value of fortuneName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFortuneName_GreaterThan(String fortuneName) {
        regFortuneName(CK_GT, fRES(fortuneName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fortune_name: {NotNull, varchar(10)}
     * @param fortuneName The value of fortuneName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFortuneName_LessThan(String fortuneName) {
        regFortuneName(CK_LT, fRES(fortuneName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fortune_name: {NotNull, varchar(10)}
     * @param fortuneName The value of fortuneName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFortuneName_GreaterEqual(String fortuneName) {
        regFortuneName(CK_GE, fRES(fortuneName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * fortune_name: {NotNull, varchar(10)}
     * @param fortuneName The value of fortuneName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFortuneName_LessEqual(String fortuneName) {
        regFortuneName(CK_LE, fRES(fortuneName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * fortune_name: {NotNull, varchar(10)}
     * @param fortuneNameList The collection of fortuneName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFortuneName_InScope(Collection<String> fortuneNameList) {
        doSetFortuneName_InScope(fortuneNameList);
    }

    protected void doSetFortuneName_InScope(Collection<String> fortuneNameList) {
        regINS(CK_INS, cTL(fortuneNameList), xgetCValueFortuneName(), "fortune_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * fortune_name: {NotNull, varchar(10)}
     * @param fortuneNameList The collection of fortuneName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFortuneName_NotInScope(Collection<String> fortuneNameList) {
        doSetFortuneName_NotInScope(fortuneNameList);
    }

    protected void doSetFortuneName_NotInScope(Collection<String> fortuneNameList) {
        regINS(CK_NINS, cTL(fortuneNameList), xgetCValueFortuneName(), "fortune_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * fortune_name: {NotNull, varchar(10)} <br>
     * <pre>e.g. setFortuneName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param fortuneName The value of fortuneName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFortuneName_LikeSearch(String fortuneName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFortuneName_LikeSearch(fortuneName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * fortune_name: {NotNull, varchar(10)} <br>
     * <pre>e.g. setFortuneName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fortuneName The value of fortuneName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setFortuneName_LikeSearch(String fortuneName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fortuneName), xgetCValueFortuneName(), "fortune_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * fortune_name: {NotNull, varchar(10)}
     * @param fortuneName The value of fortuneName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFortuneName_NotLikeSearch(String fortuneName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFortuneName_NotLikeSearch(fortuneName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * fortune_name: {NotNull, varchar(10)}
     * @param fortuneName The value of fortuneName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setFortuneName_NotLikeSearch(String fortuneName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fortuneName), xgetCValueFortuneName(), "fortune_name", likeSearchOption);
    }

    protected void regFortuneName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFortuneName(), "fortune_name"); }
    protected abstract ConditionValue xgetCValueFortuneName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * updated_by: {NotNull, varchar(20)}
     * @param updatedBy The value of updatedBy as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_Equal(String updatedBy) {
        doSetUpdatedBy_Equal(fRES(updatedBy));
    }

    protected void doSetUpdatedBy_Equal(String updatedBy) {
        regUpdatedBy(CK_EQ, updatedBy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * updated_by: {NotNull, varchar(20)}
     * @param updatedBy The value of updatedBy as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_NotEqual(String updatedBy) {
        doSetUpdatedBy_NotEqual(fRES(updatedBy));
    }

    protected void doSetUpdatedBy_NotEqual(String updatedBy) {
        regUpdatedBy(CK_NES, updatedBy);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * updated_by: {NotNull, varchar(20)}
     * @param updatedBy The value of updatedBy as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_GreaterThan(String updatedBy) {
        regUpdatedBy(CK_GT, fRES(updatedBy));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * updated_by: {NotNull, varchar(20)}
     * @param updatedBy The value of updatedBy as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_LessThan(String updatedBy) {
        regUpdatedBy(CK_LT, fRES(updatedBy));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * updated_by: {NotNull, varchar(20)}
     * @param updatedBy The value of updatedBy as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_GreaterEqual(String updatedBy) {
        regUpdatedBy(CK_GE, fRES(updatedBy));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * updated_by: {NotNull, varchar(20)}
     * @param updatedBy The value of updatedBy as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_LessEqual(String updatedBy) {
        regUpdatedBy(CK_LE, fRES(updatedBy));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * updated_by: {NotNull, varchar(20)}
     * @param updatedByList The collection of updatedBy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_InScope(Collection<String> updatedByList) {
        doSetUpdatedBy_InScope(updatedByList);
    }

    protected void doSetUpdatedBy_InScope(Collection<String> updatedByList) {
        regINS(CK_INS, cTL(updatedByList), xgetCValueUpdatedBy(), "updated_by");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * updated_by: {NotNull, varchar(20)}
     * @param updatedByList The collection of updatedBy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdatedBy_NotInScope(Collection<String> updatedByList) {
        doSetUpdatedBy_NotInScope(updatedByList);
    }

    protected void doSetUpdatedBy_NotInScope(Collection<String> updatedByList) {
        regINS(CK_NINS, cTL(updatedByList), xgetCValueUpdatedBy(), "updated_by");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * updated_by: {NotNull, varchar(20)} <br>
     * <pre>e.g. setUpdatedBy_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updatedBy The value of updatedBy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdatedBy_LikeSearch(String updatedBy, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdatedBy_LikeSearch(updatedBy, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * updated_by: {NotNull, varchar(20)} <br>
     * <pre>e.g. setUpdatedBy_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updatedBy The value of updatedBy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdatedBy_LikeSearch(String updatedBy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updatedBy), xgetCValueUpdatedBy(), "updated_by", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * updated_by: {NotNull, varchar(20)}
     * @param updatedBy The value of updatedBy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdatedBy_NotLikeSearch(String updatedBy, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdatedBy_NotLikeSearch(updatedBy, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * updated_by: {NotNull, varchar(20)}
     * @param updatedBy The value of updatedBy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdatedBy_NotLikeSearch(String updatedBy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updatedBy), xgetCValueUpdatedBy(), "updated_by", likeSearchOption);
    }

    protected void regUpdatedBy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdatedBy(), "updated_by"); }
    protected abstract ConditionValue xgetCValueUpdatedBy();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_date: {date(13)}
     * @param updatedDate The value of updatedDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedDate_Equal(java.time.LocalDate updatedDate) {
        regUpdatedDate(CK_EQ,  updatedDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_date: {date(13)}
     * @param updatedDate The value of updatedDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedDate_GreaterThan(java.time.LocalDate updatedDate) {
        regUpdatedDate(CK_GT,  updatedDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_date: {date(13)}
     * @param updatedDate The value of updatedDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedDate_LessThan(java.time.LocalDate updatedDate) {
        regUpdatedDate(CK_LT,  updatedDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_date: {date(13)}
     * @param updatedDate The value of updatedDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedDate_GreaterEqual(java.time.LocalDate updatedDate) {
        regUpdatedDate(CK_GE,  updatedDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * updated_date: {date(13)}
     * @param updatedDate The value of updatedDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdatedDate_LessEqual(java.time.LocalDate updatedDate) {
        regUpdatedDate(CK_LE, updatedDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * updated_date: {date(13)}
     * <pre>e.g. setUpdatedDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdatedDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdatedDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * updated_date: {date(13)}
     * <pre>e.g. setUpdatedDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updatedDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdatedDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "updated_date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdatedDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * updated_date: {date(13)}
     */
    public void setUpdatedDate_IsNull() { regUpdatedDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * updated_date: {date(13)}
     */
    public void setUpdatedDate_IsNotNull() { regUpdatedDate(CK_ISNN, DOBJ); }

    protected void regUpdatedDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdatedDate(), "updated_date"); }
    protected abstract ConditionValue xgetCValueUpdatedDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * created_by: {NotNull, varchar(20)}
     * @param createdBy The value of createdBy as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_Equal(String createdBy) {
        doSetCreatedBy_Equal(fRES(createdBy));
    }

    protected void doSetCreatedBy_Equal(String createdBy) {
        regCreatedBy(CK_EQ, createdBy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * created_by: {NotNull, varchar(20)}
     * @param createdBy The value of createdBy as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_NotEqual(String createdBy) {
        doSetCreatedBy_NotEqual(fRES(createdBy));
    }

    protected void doSetCreatedBy_NotEqual(String createdBy) {
        regCreatedBy(CK_NES, createdBy);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * created_by: {NotNull, varchar(20)}
     * @param createdBy The value of createdBy as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_GreaterThan(String createdBy) {
        regCreatedBy(CK_GT, fRES(createdBy));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * created_by: {NotNull, varchar(20)}
     * @param createdBy The value of createdBy as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_LessThan(String createdBy) {
        regCreatedBy(CK_LT, fRES(createdBy));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * created_by: {NotNull, varchar(20)}
     * @param createdBy The value of createdBy as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_GreaterEqual(String createdBy) {
        regCreatedBy(CK_GE, fRES(createdBy));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * created_by: {NotNull, varchar(20)}
     * @param createdBy The value of createdBy as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_LessEqual(String createdBy) {
        regCreatedBy(CK_LE, fRES(createdBy));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * created_by: {NotNull, varchar(20)}
     * @param createdByList The collection of createdBy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_InScope(Collection<String> createdByList) {
        doSetCreatedBy_InScope(createdByList);
    }

    protected void doSetCreatedBy_InScope(Collection<String> createdByList) {
        regINS(CK_INS, cTL(createdByList), xgetCValueCreatedBy(), "created_by");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * created_by: {NotNull, varchar(20)}
     * @param createdByList The collection of createdBy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreatedBy_NotInScope(Collection<String> createdByList) {
        doSetCreatedBy_NotInScope(createdByList);
    }

    protected void doSetCreatedBy_NotInScope(Collection<String> createdByList) {
        regINS(CK_NINS, cTL(createdByList), xgetCValueCreatedBy(), "created_by");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * created_by: {NotNull, varchar(20)} <br>
     * <pre>e.g. setCreatedBy_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param createdBy The value of createdBy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCreatedBy_LikeSearch(String createdBy, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCreatedBy_LikeSearch(createdBy, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * created_by: {NotNull, varchar(20)} <br>
     * <pre>e.g. setCreatedBy_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param createdBy The value of createdBy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCreatedBy_LikeSearch(String createdBy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(createdBy), xgetCValueCreatedBy(), "created_by", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * created_by: {NotNull, varchar(20)}
     * @param createdBy The value of createdBy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCreatedBy_NotLikeSearch(String createdBy, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCreatedBy_NotLikeSearch(createdBy, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * created_by: {NotNull, varchar(20)}
     * @param createdBy The value of createdBy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCreatedBy_NotLikeSearch(String createdBy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(createdBy), xgetCValueCreatedBy(), "created_by", likeSearchOption);
    }

    protected void regCreatedBy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreatedBy(), "created_by"); }
    protected abstract ConditionValue xgetCValueCreatedBy();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * created_date: {date(13)}
     * @param createdDate The value of createdDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedDate_Equal(java.time.LocalDate createdDate) {
        regCreatedDate(CK_EQ,  createdDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * created_date: {date(13)}
     * @param createdDate The value of createdDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedDate_GreaterThan(java.time.LocalDate createdDate) {
        regCreatedDate(CK_GT,  createdDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * created_date: {date(13)}
     * @param createdDate The value of createdDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedDate_LessThan(java.time.LocalDate createdDate) {
        regCreatedDate(CK_LT,  createdDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * created_date: {date(13)}
     * @param createdDate The value of createdDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedDate_GreaterEqual(java.time.LocalDate createdDate) {
        regCreatedDate(CK_GE,  createdDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * created_date: {date(13)}
     * @param createdDate The value of createdDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCreatedDate_LessEqual(java.time.LocalDate createdDate) {
        regCreatedDate(CK_LE, createdDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * created_date: {date(13)}
     * <pre>e.g. setCreatedDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setCreatedDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setCreatedDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * created_date: {date(13)}
     * <pre>e.g. setCreatedDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of createdDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setCreatedDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "created_date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueCreatedDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * created_date: {date(13)}
     */
    public void setCreatedDate_IsNull() { regCreatedDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * created_date: {date(13)}
     */
    public void setCreatedDate_IsNotNull() { regCreatedDate(CK_ISNN, DOBJ); }

    protected void regCreatedDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreatedDate(), "created_date"); }
    protected abstract ConditionValue xgetCValueCreatedDate();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<FortuneMasterCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, FortuneMasterCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<FortuneMasterCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, FortuneMasterCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<FortuneMasterCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, FortuneMasterCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<FortuneMasterCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, FortuneMasterCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<FortuneMasterCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, FortuneMasterCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;FortuneMasterCB&gt;() {
     *     public void query(FortuneMasterCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<FortuneMasterCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, FortuneMasterCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        FortuneMasterCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(FortuneMasterCQ sq);

    protected FortuneMasterCB xcreateScalarConditionCB() {
        FortuneMasterCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected FortuneMasterCB xcreateScalarConditionPartitionByCB() {
        FortuneMasterCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<FortuneMasterCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FortuneMasterCB cb = new FortuneMasterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "fortune_code";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(FortuneMasterCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<FortuneMasterCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(FortuneMasterCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        FortuneMasterCB cb = new FortuneMasterCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "fortune_code";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(FortuneMasterCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<FortuneMasterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        FortuneMasterCB cb = new FortuneMasterCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(FortuneMasterCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected FortuneMasterCB newMyCB() {
        return new FortuneMasterCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return FortuneMasterCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
