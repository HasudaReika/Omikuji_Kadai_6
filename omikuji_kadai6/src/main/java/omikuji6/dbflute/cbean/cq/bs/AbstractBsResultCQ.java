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
 * The abstract condition-query of result.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsResultCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsResultCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "result";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_telling_date: {date(13)}
     * @param fortuneTellingDate The value of fortuneTellingDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFortuneTellingDate_Equal(java.time.LocalDate fortuneTellingDate) {
        regFortuneTellingDate(CK_EQ,  fortuneTellingDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_telling_date: {date(13)}
     * @param fortuneTellingDate The value of fortuneTellingDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFortuneTellingDate_GreaterThan(java.time.LocalDate fortuneTellingDate) {
        regFortuneTellingDate(CK_GT,  fortuneTellingDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_telling_date: {date(13)}
     * @param fortuneTellingDate The value of fortuneTellingDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFortuneTellingDate_LessThan(java.time.LocalDate fortuneTellingDate) {
        regFortuneTellingDate(CK_LT,  fortuneTellingDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_telling_date: {date(13)}
     * @param fortuneTellingDate The value of fortuneTellingDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFortuneTellingDate_GreaterEqual(java.time.LocalDate fortuneTellingDate) {
        regFortuneTellingDate(CK_GE,  fortuneTellingDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_telling_date: {date(13)}
     * @param fortuneTellingDate The value of fortuneTellingDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFortuneTellingDate_LessEqual(java.time.LocalDate fortuneTellingDate) {
        regFortuneTellingDate(CK_LE, fortuneTellingDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_telling_date: {date(13)}
     * <pre>e.g. setFortuneTellingDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of fortuneTellingDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of fortuneTellingDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setFortuneTellingDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setFortuneTellingDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * fortune_telling_date: {date(13)}
     * <pre>e.g. setFortuneTellingDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of fortuneTellingDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of fortuneTellingDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setFortuneTellingDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "fortune_telling_date"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueFortuneTellingDate(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * fortune_telling_date: {date(13)}
     */
    public void setFortuneTellingDate_IsNull() { regFortuneTellingDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * fortune_telling_date: {date(13)}
     */
    public void setFortuneTellingDate_IsNotNull() { regFortuneTellingDate(CK_ISNN, DOBJ); }

    protected void regFortuneTellingDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFortuneTellingDate(), "fortune_telling_date"); }
    protected abstract ConditionValue xgetCValueFortuneTellingDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * birthday: {date(13)}
     * @param birthday The value of birthday as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthday_Equal(java.time.LocalDate birthday) {
        regBirthday(CK_EQ,  birthday);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * birthday: {date(13)}
     * @param birthday The value of birthday as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthday_GreaterThan(java.time.LocalDate birthday) {
        regBirthday(CK_GT,  birthday);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * birthday: {date(13)}
     * @param birthday The value of birthday as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthday_LessThan(java.time.LocalDate birthday) {
        regBirthday(CK_LT,  birthday);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * birthday: {date(13)}
     * @param birthday The value of birthday as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthday_GreaterEqual(java.time.LocalDate birthday) {
        regBirthday(CK_GE,  birthday);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * birthday: {date(13)}
     * @param birthday The value of birthday as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBirthday_LessEqual(java.time.LocalDate birthday) {
        regBirthday(CK_LE, birthday);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * birthday: {date(13)}
     * <pre>e.g. setBirthday_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthday. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthday. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setBirthday_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setBirthday_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * birthday: {date(13)}
     * <pre>e.g. setBirthday_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthday. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthday. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setBirthday_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "birthday"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueBirthday(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * birthday: {date(13)}
     */
    public void setBirthday_IsNull() { regBirthday(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * birthday: {date(13)}
     */
    public void setBirthday_IsNotNull() { regBirthday(CK_ISNN, DOBJ); }

    protected void regBirthday(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBirthday(), "birthday"); }
    protected abstract ConditionValue xgetCValueBirthday();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * omikuji_code: {int4(10), FK to omikuji}
     * @param omikujiCode The value of omikujiCode as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOmikujiCode_Equal(Integer omikujiCode) {
        doSetOmikujiCode_Equal(omikujiCode);
    }

    protected void doSetOmikujiCode_Equal(Integer omikujiCode) {
        regOmikujiCode(CK_EQ, omikujiCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * omikuji_code: {int4(10), FK to omikuji}
     * @param omikujiCode The value of omikujiCode as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOmikujiCode_NotEqual(Integer omikujiCode) {
        doSetOmikujiCode_NotEqual(omikujiCode);
    }

    protected void doSetOmikujiCode_NotEqual(Integer omikujiCode) {
        regOmikujiCode(CK_NES, omikujiCode);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * omikuji_code: {int4(10), FK to omikuji}
     * @param omikujiCode The value of omikujiCode as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOmikujiCode_GreaterThan(Integer omikujiCode) {
        regOmikujiCode(CK_GT, omikujiCode);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * omikuji_code: {int4(10), FK to omikuji}
     * @param omikujiCode The value of omikujiCode as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOmikujiCode_LessThan(Integer omikujiCode) {
        regOmikujiCode(CK_LT, omikujiCode);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * omikuji_code: {int4(10), FK to omikuji}
     * @param omikujiCode The value of omikujiCode as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOmikujiCode_GreaterEqual(Integer omikujiCode) {
        regOmikujiCode(CK_GE, omikujiCode);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * omikuji_code: {int4(10), FK to omikuji}
     * @param omikujiCode The value of omikujiCode as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOmikujiCode_LessEqual(Integer omikujiCode) {
        regOmikujiCode(CK_LE, omikujiCode);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * omikuji_code: {int4(10), FK to omikuji}
     * @param minNumber The min number of omikujiCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of omikujiCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setOmikujiCode_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setOmikujiCode_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * omikuji_code: {int4(10), FK to omikuji}
     * @param minNumber The min number of omikujiCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of omikujiCode. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setOmikujiCode_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOmikujiCode(), "omikuji_code", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * omikuji_code: {int4(10), FK to omikuji}
     * @param omikujiCodeList The collection of omikujiCode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOmikujiCode_InScope(Collection<Integer> omikujiCodeList) {
        doSetOmikujiCode_InScope(omikujiCodeList);
    }

    protected void doSetOmikujiCode_InScope(Collection<Integer> omikujiCodeList) {
        regINS(CK_INS, cTL(omikujiCodeList), xgetCValueOmikujiCode(), "omikuji_code");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * omikuji_code: {int4(10), FK to omikuji}
     * @param omikujiCodeList The collection of omikujiCode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOmikujiCode_NotInScope(Collection<Integer> omikujiCodeList) {
        doSetOmikujiCode_NotInScope(omikujiCodeList);
    }

    protected void doSetOmikujiCode_NotInScope(Collection<Integer> omikujiCodeList) {
        regINS(CK_NINS, cTL(omikujiCodeList), xgetCValueOmikujiCode(), "omikuji_code");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * omikuji_code: {int4(10), FK to omikuji}
     */
    public void setOmikujiCode_IsNull() { regOmikujiCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * omikuji_code: {int4(10), FK to omikuji}
     */
    public void setOmikujiCode_IsNotNull() { regOmikujiCode(CK_ISNN, DOBJ); }

    protected void regOmikujiCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOmikujiCode(), "omikuji_code"); }
    protected abstract ConditionValue xgetCValueOmikujiCode();

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
    public HpSLCFunction<ResultCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ResultCB.class);
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
    public HpSLCFunction<ResultCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ResultCB.class);
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
    public HpSLCFunction<ResultCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ResultCB.class);
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
    public HpSLCFunction<ResultCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ResultCB.class);
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
    public HpSLCFunction<ResultCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ResultCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ResultCB&gt;() {
     *     public void query(ResultCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ResultCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ResultCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ResultCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ResultCQ sq);

    protected ResultCB xcreateScalarConditionCB() {
        ResultCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ResultCB xcreateScalarConditionPartitionByCB() {
        ResultCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

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
    protected ResultCB newMyCB() {
        return new ResultCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ResultCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
