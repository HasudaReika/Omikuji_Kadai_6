package omikuji6.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.twowaysql.pmbean.ParameterBean;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import omikuji6.dbflute.allcommon.*;

/**
 * The base class for parameter-bean of ResultPastSixMonths.
 * @author DBFlute(AutoGenerator)
 */
public class BsResultPastSixMonthsPmb implements ParameterBean, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of sixMonthsAgo. */
    protected String _sixMonthsAgo;

    /** The parameter of birthday. */
    protected String _birthday;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the parameter-bean of ResultPastSixMonths.
     */
    public BsResultPastSixMonthsPmb() {
    }

    // ===================================================================================
    //                                                                       Safety Result
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void checkSafetyResult(int safetyMaxResultSize) {
        _safetyMaxResultSize = safetyMaxResultSize;
    }

    /**
     * {@inheritDoc}
     */
    public int getSafetyMaxResultSize() {
        return _safetyMaxResultSize;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    // -----------------------------------------------------
    //                                                String
    //                                                ------
    protected String filterStringParameter(String value) { return isEmptyStringParameterAllowed() ? value : convertEmptyToNull(value); }
    protected boolean isEmptyStringParameterAllowed() { return DBFluteConfig.getInstance().isEmptyStringParameterAllowed(); }
    protected String convertEmptyToNull(String value) { return PmbCustodial.convertEmptyToNull(value); }

    // -----------------------------------------------------
    //                                                  Date
    //                                                  ----
    protected Date toUtilDate(Object date) { return PmbCustodial.toUtilDate(date, _timeZone); }
    protected <DATE> DATE toLocalDate(Date date, Class<DATE> localType) { return PmbCustodial.toLocalDate(date, localType, chooseRealTimeZone()); }
    protected TimeZone chooseRealTimeZone() { return PmbCustodial.chooseRealTimeZone(_timeZone); }

    /**
     * Set time-zone, basically for LocalDate conversion. <br>
     * Normally you don't need to set this, you can adjust other ways. <br>
     * (DBFlute system's time-zone is used as default)
     * @param timeZone The time-zone for filtering. (NullAllowed: if null, default zone)
     */
    public void zone(TimeZone timeZone) { _timeZone = timeZone; }

    // -----------------------------------------------------
    //                                    by Option Handling
    //                                    ------------------
    // might be called by option handling
    protected <NUMBER extends Number> NUMBER toNumber(Object obj, Class<NUMBER> type) { return PmbCustodial.toNumber(obj, type); }
    protected Boolean toBoolean(Object obj) { return PmbCustodial.toBoolean(obj); }
    @SuppressWarnings("unchecked")
    protected <ELEMENT> ArrayList<ELEMENT> newArrayList(ELEMENT... elements) { return PmbCustodial.newArrayList(elements); }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * @return The display string of all parameters. (NotNull)
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(DfTypeUtil.toClassTitle(this)).append(":");
        sb.append(xbuildColumnString());
        return sb.toString();
    }
    protected String xbuildColumnString() {
        final String dm = ", ";
        final StringBuilder sb = new StringBuilder();
        sb.append(dm).append(_sixMonthsAgo);
        sb.append(dm).append(_birthday);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] sixMonthsAgo <br>
     * @return The value of sixMonthsAgo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getSixMonthsAgo() {
        return filterStringParameter(_sixMonthsAgo);
    }

    /**
     * [set] sixMonthsAgo <br>
     * @param sixMonthsAgo The value of sixMonthsAgo. (NullAllowed)
     */
    public void setSixMonthsAgo(String sixMonthsAgo) {
        _sixMonthsAgo = sixMonthsAgo;
    }

    /**
     * [get] birthday <br>
     * @return The value of birthday. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public String getBirthday() {
        return filterStringParameter(_birthday);
    }

    /**
     * [set] birthday <br>
     * @param birthday The value of birthday. (NullAllowed)
     */
    public void setBirthday(String birthday) {
        _birthday = birthday;
    }
}
