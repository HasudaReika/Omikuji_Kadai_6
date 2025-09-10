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
 * The abstract condition-query of post_code_data.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPostCodeDataCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPostCodeDataCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "post_code_data";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_Equal(Integer id) {
        doSetId_Equal(id);
    }

    protected void doSetId_Equal(Integer id) {
        regId(CK_EQ, id);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_NotEqual(Integer id) {
        doSetId_NotEqual(id);
    }

    protected void doSetId_NotEqual(Integer id) {
        regId(CK_NES, id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_GreaterThan(Integer id) {
        regId(CK_GT, id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_LessThan(Integer id) {
        regId(CK_LT, id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_GreaterEqual(Integer id) {
        regId(CK_GE, id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param id The value of id as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setId_LessEqual(Integer id) {
        regId(CK_LE, id);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of id. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueId(), "id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param idList The collection of id as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_InScope(Collection<Integer> idList) {
        doSetId_InScope(idList);
    }

    protected void doSetId_InScope(Collection<Integer> idList) {
        regINS(CK_INS, cTL(idList), xgetCValueId(), "id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     * @param idList The collection of id as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setId_NotInScope(Collection<Integer> idList) {
        doSetId_NotInScope(idList);
    }

    protected void doSetId_NotInScope(Collection<Integer> idList) {
        regINS(CK_NINS, cTL(idList), xgetCValueId(), "id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     */
    public void setId_IsNull() { regId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * id: {PK, ID, NotNull, serial(10)}
     */
    public void setId_IsNotNull() { regId(CK_ISNN, DOBJ); }

    protected void regId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueId(), "id"); }
    protected abstract ConditionValue xgetCValueId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * post_code: {NotNull, varchar(7)}
     * @param postCode The value of postCode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_Equal(String postCode) {
        doSetPostCode_Equal(fRES(postCode));
    }

    protected void doSetPostCode_Equal(String postCode) {
        regPostCode(CK_EQ, postCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * post_code: {NotNull, varchar(7)}
     * @param postCode The value of postCode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_NotEqual(String postCode) {
        doSetPostCode_NotEqual(fRES(postCode));
    }

    protected void doSetPostCode_NotEqual(String postCode) {
        regPostCode(CK_NES, postCode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * post_code: {NotNull, varchar(7)}
     * @param postCode The value of postCode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_GreaterThan(String postCode) {
        regPostCode(CK_GT, fRES(postCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * post_code: {NotNull, varchar(7)}
     * @param postCode The value of postCode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_LessThan(String postCode) {
        regPostCode(CK_LT, fRES(postCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * post_code: {NotNull, varchar(7)}
     * @param postCode The value of postCode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_GreaterEqual(String postCode) {
        regPostCode(CK_GE, fRES(postCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * post_code: {NotNull, varchar(7)}
     * @param postCode The value of postCode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_LessEqual(String postCode) {
        regPostCode(CK_LE, fRES(postCode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * post_code: {NotNull, varchar(7)}
     * @param postCodeList The collection of postCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_InScope(Collection<String> postCodeList) {
        doSetPostCode_InScope(postCodeList);
    }

    protected void doSetPostCode_InScope(Collection<String> postCodeList) {
        regINS(CK_INS, cTL(postCodeList), xgetCValuePostCode(), "post_code");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * post_code: {NotNull, varchar(7)}
     * @param postCodeList The collection of postCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostCode_NotInScope(Collection<String> postCodeList) {
        doSetPostCode_NotInScope(postCodeList);
    }

    protected void doSetPostCode_NotInScope(Collection<String> postCodeList) {
        regINS(CK_NINS, cTL(postCodeList), xgetCValuePostCode(), "post_code");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * post_code: {NotNull, varchar(7)} <br>
     * <pre>e.g. setPostCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param postCode The value of postCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPostCode_LikeSearch(String postCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPostCode_LikeSearch(postCode, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * post_code: {NotNull, varchar(7)} <br>
     * <pre>e.g. setPostCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param postCode The value of postCode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPostCode_LikeSearch(String postCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(postCode), xgetCValuePostCode(), "post_code", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * post_code: {NotNull, varchar(7)}
     * @param postCode The value of postCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPostCode_NotLikeSearch(String postCode, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPostCode_NotLikeSearch(postCode, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * post_code: {NotNull, varchar(7)}
     * @param postCode The value of postCode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPostCode_NotLikeSearch(String postCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(postCode), xgetCValuePostCode(), "post_code", likeSearchOption);
    }

    protected void regPostCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePostCode(), "post_code"); }
    protected abstract ConditionValue xgetCValuePostCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prefecture_katakana: {NotNull, varchar(30)}
     * @param prefectureKatakana The value of prefectureKatakana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefectureKatakana_Equal(String prefectureKatakana) {
        doSetPrefectureKatakana_Equal(fRES(prefectureKatakana));
    }

    protected void doSetPrefectureKatakana_Equal(String prefectureKatakana) {
        regPrefectureKatakana(CK_EQ, prefectureKatakana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prefecture_katakana: {NotNull, varchar(30)}
     * @param prefectureKatakana The value of prefectureKatakana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefectureKatakana_NotEqual(String prefectureKatakana) {
        doSetPrefectureKatakana_NotEqual(fRES(prefectureKatakana));
    }

    protected void doSetPrefectureKatakana_NotEqual(String prefectureKatakana) {
        regPrefectureKatakana(CK_NES, prefectureKatakana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prefecture_katakana: {NotNull, varchar(30)}
     * @param prefectureKatakana The value of prefectureKatakana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefectureKatakana_GreaterThan(String prefectureKatakana) {
        regPrefectureKatakana(CK_GT, fRES(prefectureKatakana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prefecture_katakana: {NotNull, varchar(30)}
     * @param prefectureKatakana The value of prefectureKatakana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefectureKatakana_LessThan(String prefectureKatakana) {
        regPrefectureKatakana(CK_LT, fRES(prefectureKatakana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prefecture_katakana: {NotNull, varchar(30)}
     * @param prefectureKatakana The value of prefectureKatakana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefectureKatakana_GreaterEqual(String prefectureKatakana) {
        regPrefectureKatakana(CK_GE, fRES(prefectureKatakana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prefecture_katakana: {NotNull, varchar(30)}
     * @param prefectureKatakana The value of prefectureKatakana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefectureKatakana_LessEqual(String prefectureKatakana) {
        regPrefectureKatakana(CK_LE, fRES(prefectureKatakana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * prefecture_katakana: {NotNull, varchar(30)}
     * @param prefectureKatakanaList The collection of prefectureKatakana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefectureKatakana_InScope(Collection<String> prefectureKatakanaList) {
        doSetPrefectureKatakana_InScope(prefectureKatakanaList);
    }

    protected void doSetPrefectureKatakana_InScope(Collection<String> prefectureKatakanaList) {
        regINS(CK_INS, cTL(prefectureKatakanaList), xgetCValuePrefectureKatakana(), "prefecture_katakana");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * prefecture_katakana: {NotNull, varchar(30)}
     * @param prefectureKatakanaList The collection of prefectureKatakana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefectureKatakana_NotInScope(Collection<String> prefectureKatakanaList) {
        doSetPrefectureKatakana_NotInScope(prefectureKatakanaList);
    }

    protected void doSetPrefectureKatakana_NotInScope(Collection<String> prefectureKatakanaList) {
        regINS(CK_NINS, cTL(prefectureKatakanaList), xgetCValuePrefectureKatakana(), "prefecture_katakana");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * prefecture_katakana: {NotNull, varchar(30)} <br>
     * <pre>e.g. setPrefectureKatakana_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param prefectureKatakana The value of prefectureKatakana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPrefectureKatakana_LikeSearch(String prefectureKatakana, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPrefectureKatakana_LikeSearch(prefectureKatakana, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * prefecture_katakana: {NotNull, varchar(30)} <br>
     * <pre>e.g. setPrefectureKatakana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param prefectureKatakana The value of prefectureKatakana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPrefectureKatakana_LikeSearch(String prefectureKatakana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(prefectureKatakana), xgetCValuePrefectureKatakana(), "prefecture_katakana", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * prefecture_katakana: {NotNull, varchar(30)}
     * @param prefectureKatakana The value of prefectureKatakana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPrefectureKatakana_NotLikeSearch(String prefectureKatakana, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPrefectureKatakana_NotLikeSearch(prefectureKatakana, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * prefecture_katakana: {NotNull, varchar(30)}
     * @param prefectureKatakana The value of prefectureKatakana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPrefectureKatakana_NotLikeSearch(String prefectureKatakana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(prefectureKatakana), xgetCValuePrefectureKatakana(), "prefecture_katakana", likeSearchOption);
    }

    protected void regPrefectureKatakana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrefectureKatakana(), "prefecture_katakana"); }
    protected abstract ConditionValue xgetCValuePrefectureKatakana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_katakana: {NotNull, varchar(40)}
     * @param cityKatakana The value of cityKatakana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityKatakana_Equal(String cityKatakana) {
        doSetCityKatakana_Equal(fRES(cityKatakana));
    }

    protected void doSetCityKatakana_Equal(String cityKatakana) {
        regCityKatakana(CK_EQ, cityKatakana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_katakana: {NotNull, varchar(40)}
     * @param cityKatakana The value of cityKatakana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityKatakana_NotEqual(String cityKatakana) {
        doSetCityKatakana_NotEqual(fRES(cityKatakana));
    }

    protected void doSetCityKatakana_NotEqual(String cityKatakana) {
        regCityKatakana(CK_NES, cityKatakana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_katakana: {NotNull, varchar(40)}
     * @param cityKatakana The value of cityKatakana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityKatakana_GreaterThan(String cityKatakana) {
        regCityKatakana(CK_GT, fRES(cityKatakana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_katakana: {NotNull, varchar(40)}
     * @param cityKatakana The value of cityKatakana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityKatakana_LessThan(String cityKatakana) {
        regCityKatakana(CK_LT, fRES(cityKatakana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_katakana: {NotNull, varchar(40)}
     * @param cityKatakana The value of cityKatakana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityKatakana_GreaterEqual(String cityKatakana) {
        regCityKatakana(CK_GE, fRES(cityKatakana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city_katakana: {NotNull, varchar(40)}
     * @param cityKatakana The value of cityKatakana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityKatakana_LessEqual(String cityKatakana) {
        regCityKatakana(CK_LE, fRES(cityKatakana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * city_katakana: {NotNull, varchar(40)}
     * @param cityKatakanaList The collection of cityKatakana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityKatakana_InScope(Collection<String> cityKatakanaList) {
        doSetCityKatakana_InScope(cityKatakanaList);
    }

    protected void doSetCityKatakana_InScope(Collection<String> cityKatakanaList) {
        regINS(CK_INS, cTL(cityKatakanaList), xgetCValueCityKatakana(), "city_katakana");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * city_katakana: {NotNull, varchar(40)}
     * @param cityKatakanaList The collection of cityKatakana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCityKatakana_NotInScope(Collection<String> cityKatakanaList) {
        doSetCityKatakana_NotInScope(cityKatakanaList);
    }

    protected void doSetCityKatakana_NotInScope(Collection<String> cityKatakanaList) {
        regINS(CK_NINS, cTL(cityKatakanaList), xgetCValueCityKatakana(), "city_katakana");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city_katakana: {NotNull, varchar(40)} <br>
     * <pre>e.g. setCityKatakana_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param cityKatakana The value of cityKatakana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCityKatakana_LikeSearch(String cityKatakana, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCityKatakana_LikeSearch(cityKatakana, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city_katakana: {NotNull, varchar(40)} <br>
     * <pre>e.g. setCityKatakana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cityKatakana The value of cityKatakana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCityKatakana_LikeSearch(String cityKatakana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cityKatakana), xgetCValueCityKatakana(), "city_katakana", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city_katakana: {NotNull, varchar(40)}
     * @param cityKatakana The value of cityKatakana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCityKatakana_NotLikeSearch(String cityKatakana, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCityKatakana_NotLikeSearch(cityKatakana, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city_katakana: {NotNull, varchar(40)}
     * @param cityKatakana The value of cityKatakana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCityKatakana_NotLikeSearch(String cityKatakana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cityKatakana), xgetCValueCityKatakana(), "city_katakana", likeSearchOption);
    }

    protected void regCityKatakana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCityKatakana(), "city_katakana"); }
    protected abstract ConditionValue xgetCValueCityKatakana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * town_katakana: {NotNull, varchar(60)}
     * @param townKatakana The value of townKatakana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTownKatakana_Equal(String townKatakana) {
        doSetTownKatakana_Equal(fRES(townKatakana));
    }

    protected void doSetTownKatakana_Equal(String townKatakana) {
        regTownKatakana(CK_EQ, townKatakana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * town_katakana: {NotNull, varchar(60)}
     * @param townKatakana The value of townKatakana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTownKatakana_NotEqual(String townKatakana) {
        doSetTownKatakana_NotEqual(fRES(townKatakana));
    }

    protected void doSetTownKatakana_NotEqual(String townKatakana) {
        regTownKatakana(CK_NES, townKatakana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * town_katakana: {NotNull, varchar(60)}
     * @param townKatakana The value of townKatakana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTownKatakana_GreaterThan(String townKatakana) {
        regTownKatakana(CK_GT, fRES(townKatakana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * town_katakana: {NotNull, varchar(60)}
     * @param townKatakana The value of townKatakana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTownKatakana_LessThan(String townKatakana) {
        regTownKatakana(CK_LT, fRES(townKatakana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * town_katakana: {NotNull, varchar(60)}
     * @param townKatakana The value of townKatakana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTownKatakana_GreaterEqual(String townKatakana) {
        regTownKatakana(CK_GE, fRES(townKatakana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * town_katakana: {NotNull, varchar(60)}
     * @param townKatakana The value of townKatakana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTownKatakana_LessEqual(String townKatakana) {
        regTownKatakana(CK_LE, fRES(townKatakana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * town_katakana: {NotNull, varchar(60)}
     * @param townKatakanaList The collection of townKatakana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTownKatakana_InScope(Collection<String> townKatakanaList) {
        doSetTownKatakana_InScope(townKatakanaList);
    }

    protected void doSetTownKatakana_InScope(Collection<String> townKatakanaList) {
        regINS(CK_INS, cTL(townKatakanaList), xgetCValueTownKatakana(), "town_katakana");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * town_katakana: {NotNull, varchar(60)}
     * @param townKatakanaList The collection of townKatakana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTownKatakana_NotInScope(Collection<String> townKatakanaList) {
        doSetTownKatakana_NotInScope(townKatakanaList);
    }

    protected void doSetTownKatakana_NotInScope(Collection<String> townKatakanaList) {
        regINS(CK_NINS, cTL(townKatakanaList), xgetCValueTownKatakana(), "town_katakana");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * town_katakana: {NotNull, varchar(60)} <br>
     * <pre>e.g. setTownKatakana_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param townKatakana The value of townKatakana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTownKatakana_LikeSearch(String townKatakana, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTownKatakana_LikeSearch(townKatakana, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * town_katakana: {NotNull, varchar(60)} <br>
     * <pre>e.g. setTownKatakana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param townKatakana The value of townKatakana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTownKatakana_LikeSearch(String townKatakana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(townKatakana), xgetCValueTownKatakana(), "town_katakana", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * town_katakana: {NotNull, varchar(60)}
     * @param townKatakana The value of townKatakana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTownKatakana_NotLikeSearch(String townKatakana, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTownKatakana_NotLikeSearch(townKatakana, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * town_katakana: {NotNull, varchar(60)}
     * @param townKatakana The value of townKatakana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTownKatakana_NotLikeSearch(String townKatakana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(townKatakana), xgetCValueTownKatakana(), "town_katakana", likeSearchOption);
    }

    protected void regTownKatakana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTownKatakana(), "town_katakana"); }
    protected abstract ConditionValue xgetCValueTownKatakana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prefecture: {NotNull, varchar(20)}
     * @param prefecture The value of prefecture as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefecture_Equal(String prefecture) {
        doSetPrefecture_Equal(fRES(prefecture));
    }

    protected void doSetPrefecture_Equal(String prefecture) {
        regPrefecture(CK_EQ, prefecture);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prefecture: {NotNull, varchar(20)}
     * @param prefecture The value of prefecture as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefecture_NotEqual(String prefecture) {
        doSetPrefecture_NotEqual(fRES(prefecture));
    }

    protected void doSetPrefecture_NotEqual(String prefecture) {
        regPrefecture(CK_NES, prefecture);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prefecture: {NotNull, varchar(20)}
     * @param prefecture The value of prefecture as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefecture_GreaterThan(String prefecture) {
        regPrefecture(CK_GT, fRES(prefecture));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prefecture: {NotNull, varchar(20)}
     * @param prefecture The value of prefecture as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefecture_LessThan(String prefecture) {
        regPrefecture(CK_LT, fRES(prefecture));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prefecture: {NotNull, varchar(20)}
     * @param prefecture The value of prefecture as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefecture_GreaterEqual(String prefecture) {
        regPrefecture(CK_GE, fRES(prefecture));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * prefecture: {NotNull, varchar(20)}
     * @param prefecture The value of prefecture as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefecture_LessEqual(String prefecture) {
        regPrefecture(CK_LE, fRES(prefecture));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * prefecture: {NotNull, varchar(20)}
     * @param prefectureList The collection of prefecture as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefecture_InScope(Collection<String> prefectureList) {
        doSetPrefecture_InScope(prefectureList);
    }

    protected void doSetPrefecture_InScope(Collection<String> prefectureList) {
        regINS(CK_INS, cTL(prefectureList), xgetCValuePrefecture(), "prefecture");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * prefecture: {NotNull, varchar(20)}
     * @param prefectureList The collection of prefecture as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrefecture_NotInScope(Collection<String> prefectureList) {
        doSetPrefecture_NotInScope(prefectureList);
    }

    protected void doSetPrefecture_NotInScope(Collection<String> prefectureList) {
        regINS(CK_NINS, cTL(prefectureList), xgetCValuePrefecture(), "prefecture");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * prefecture: {NotNull, varchar(20)} <br>
     * <pre>e.g. setPrefecture_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param prefecture The value of prefecture as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPrefecture_LikeSearch(String prefecture, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPrefecture_LikeSearch(prefecture, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * prefecture: {NotNull, varchar(20)} <br>
     * <pre>e.g. setPrefecture_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param prefecture The value of prefecture as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPrefecture_LikeSearch(String prefecture, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(prefecture), xgetCValuePrefecture(), "prefecture", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * prefecture: {NotNull, varchar(20)}
     * @param prefecture The value of prefecture as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPrefecture_NotLikeSearch(String prefecture, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPrefecture_NotLikeSearch(prefecture, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * prefecture: {NotNull, varchar(20)}
     * @param prefecture The value of prefecture as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPrefecture_NotLikeSearch(String prefecture, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(prefecture), xgetCValuePrefecture(), "prefecture", likeSearchOption);
    }

    protected void regPrefecture(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrefecture(), "prefecture"); }
    protected abstract ConditionValue xgetCValuePrefecture();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city: {NotNull, varchar(20)}
     * @param city The value of city as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_Equal(String city) {
        doSetCity_Equal(fRES(city));
    }

    protected void doSetCity_Equal(String city) {
        regCity(CK_EQ, city);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city: {NotNull, varchar(20)}
     * @param city The value of city as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_NotEqual(String city) {
        doSetCity_NotEqual(fRES(city));
    }

    protected void doSetCity_NotEqual(String city) {
        regCity(CK_NES, city);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city: {NotNull, varchar(20)}
     * @param city The value of city as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_GreaterThan(String city) {
        regCity(CK_GT, fRES(city));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city: {NotNull, varchar(20)}
     * @param city The value of city as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_LessThan(String city) {
        regCity(CK_LT, fRES(city));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city: {NotNull, varchar(20)}
     * @param city The value of city as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_GreaterEqual(String city) {
        regCity(CK_GE, fRES(city));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * city: {NotNull, varchar(20)}
     * @param city The value of city as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_LessEqual(String city) {
        regCity(CK_LE, fRES(city));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * city: {NotNull, varchar(20)}
     * @param cityList The collection of city as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_InScope(Collection<String> cityList) {
        doSetCity_InScope(cityList);
    }

    protected void doSetCity_InScope(Collection<String> cityList) {
        regINS(CK_INS, cTL(cityList), xgetCValueCity(), "city");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * city: {NotNull, varchar(20)}
     * @param cityList The collection of city as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCity_NotInScope(Collection<String> cityList) {
        doSetCity_NotInScope(cityList);
    }

    protected void doSetCity_NotInScope(Collection<String> cityList) {
        regINS(CK_NINS, cTL(cityList), xgetCValueCity(), "city");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city: {NotNull, varchar(20)} <br>
     * <pre>e.g. setCity_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param city The value of city as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCity_LikeSearch(String city, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCity_LikeSearch(city, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city: {NotNull, varchar(20)} <br>
     * <pre>e.g. setCity_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param city The value of city as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCity_LikeSearch(String city, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(city), xgetCValueCity(), "city", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city: {NotNull, varchar(20)}
     * @param city The value of city as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCity_NotLikeSearch(String city, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCity_NotLikeSearch(city, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * city: {NotNull, varchar(20)}
     * @param city The value of city as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCity_NotLikeSearch(String city, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(city), xgetCValueCity(), "city", likeSearchOption);
    }

    protected void regCity(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCity(), "city"); }
    protected abstract ConditionValue xgetCValueCity();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * town: {NotNull, varchar(50)}
     * @param town The value of town as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTown_Equal(String town) {
        doSetTown_Equal(fRES(town));
    }

    protected void doSetTown_Equal(String town) {
        regTown(CK_EQ, town);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * town: {NotNull, varchar(50)}
     * @param town The value of town as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTown_NotEqual(String town) {
        doSetTown_NotEqual(fRES(town));
    }

    protected void doSetTown_NotEqual(String town) {
        regTown(CK_NES, town);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * town: {NotNull, varchar(50)}
     * @param town The value of town as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTown_GreaterThan(String town) {
        regTown(CK_GT, fRES(town));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * town: {NotNull, varchar(50)}
     * @param town The value of town as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTown_LessThan(String town) {
        regTown(CK_LT, fRES(town));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * town: {NotNull, varchar(50)}
     * @param town The value of town as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTown_GreaterEqual(String town) {
        regTown(CK_GE, fRES(town));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * town: {NotNull, varchar(50)}
     * @param town The value of town as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTown_LessEqual(String town) {
        regTown(CK_LE, fRES(town));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * town: {NotNull, varchar(50)}
     * @param townList The collection of town as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTown_InScope(Collection<String> townList) {
        doSetTown_InScope(townList);
    }

    protected void doSetTown_InScope(Collection<String> townList) {
        regINS(CK_INS, cTL(townList), xgetCValueTown(), "town");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * town: {NotNull, varchar(50)}
     * @param townList The collection of town as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTown_NotInScope(Collection<String> townList) {
        doSetTown_NotInScope(townList);
    }

    protected void doSetTown_NotInScope(Collection<String> townList) {
        regINS(CK_NINS, cTL(townList), xgetCValueTown(), "town");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * town: {NotNull, varchar(50)} <br>
     * <pre>e.g. setTown_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param town The value of town as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTown_LikeSearch(String town, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTown_LikeSearch(town, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * town: {NotNull, varchar(50)} <br>
     * <pre>e.g. setTown_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param town The value of town as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTown_LikeSearch(String town, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(town), xgetCValueTown(), "town", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * town: {NotNull, varchar(50)}
     * @param town The value of town as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTown_NotLikeSearch(String town, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTown_NotLikeSearch(town, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * town: {NotNull, varchar(50)}
     * @param town The value of town as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTown_NotLikeSearch(String town, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(town), xgetCValueTown(), "town", likeSearchOption);
    }

    protected void regTown(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTown(), "town"); }
    protected abstract ConditionValue xgetCValueTown();

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
    public HpSLCFunction<PostCodeDataCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, PostCodeDataCB.class);
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
    public HpSLCFunction<PostCodeDataCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, PostCodeDataCB.class);
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
    public HpSLCFunction<PostCodeDataCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, PostCodeDataCB.class);
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
    public HpSLCFunction<PostCodeDataCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, PostCodeDataCB.class);
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
    public HpSLCFunction<PostCodeDataCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, PostCodeDataCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PostCodeDataCB&gt;() {
     *     public void query(PostCodeDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PostCodeDataCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, PostCodeDataCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        PostCodeDataCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(PostCodeDataCQ sq);

    protected PostCodeDataCB xcreateScalarConditionCB() {
        PostCodeDataCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PostCodeDataCB xcreateScalarConditionPartitionByCB() {
        PostCodeDataCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PostCodeDataCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PostCodeDataCB cb = new PostCodeDataCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PostCodeDataCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PostCodeDataCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PostCodeDataCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PostCodeDataCB cb = new PostCodeDataCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PostCodeDataCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PostCodeDataCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PostCodeDataCB cb = new PostCodeDataCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PostCodeDataCQ sq);

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
    protected PostCodeDataCB newMyCB() {
        return new PostCodeDataCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PostCodeDataCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
