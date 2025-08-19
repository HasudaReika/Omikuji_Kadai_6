package omikuji6.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import omikuji6.dbflute.exentity.customize.*;

/**
 * The entity of ResultPastSixMonths.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsResultPastSixMonths extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** fortune_telling_date: {date(13), refers to result.fortune_telling_date} */
    protected java.time.LocalDate _fortuneTellingDate;

    /** fortune_name: {varchar(10), refers to fortune_master.fortune_name} */
    protected String _fortuneName;

    /** negaigoto: {varchar(30), refers to omikuji.negaigoto} */
    protected String _negaigoto;

    /** akinai: {varchar(30), refers to omikuji.akinai} */
    protected String _akinai;

    /** gakumon: {varchar(30), refers to omikuji.gakumon} */
    protected String _gakumon;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return omikuji6.dbflute.bsentity.customize.dbmeta.ResultPastSixMonthsDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "ResultPastSixMonths";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsResultPastSixMonths) {
            BsResultPastSixMonths other = (BsResultPastSixMonths)obj;
            if (!xSV(_fortuneTellingDate, other._fortuneTellingDate)) { return false; }
            if (!xSV(_fortuneName, other._fortuneName)) { return false; }
            if (!xSV(_negaigoto, other._negaigoto)) { return false; }
            if (!xSV(_akinai, other._akinai)) { return false; }
            if (!xSV(_gakumon, other._gakumon)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _fortuneTellingDate);
        hs = xCH(hs, _fortuneName);
        hs = xCH(hs, _negaigoto);
        hs = xCH(hs, _akinai);
        hs = xCH(hs, _gakumon);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_fortuneTellingDate));
        sb.append(dm).append(xfND(_fortuneName));
        sb.append(dm).append(xfND(_negaigoto));
        sb.append(dm).append(xfND(_akinai));
        sb.append(dm).append(xfND(_gakumon));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public ResultPastSixMonths clone() {
        return (ResultPastSixMonths)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] fortune_telling_date: {date(13), refers to result.fortune_telling_date} <br>
     * @return The value of the column 'fortune_telling_date'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDate getFortuneTellingDate() {
        checkSpecifiedProperty("fortuneTellingDate");
        return _fortuneTellingDate;
    }

    /**
     * [set] fortune_telling_date: {date(13), refers to result.fortune_telling_date} <br>
     * @param fortuneTellingDate The value of the column 'fortune_telling_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFortuneTellingDate(java.time.LocalDate fortuneTellingDate) {
        registerModifiedProperty("fortuneTellingDate");
        _fortuneTellingDate = fortuneTellingDate;
    }

    /**
     * [get] fortune_name: {varchar(10), refers to fortune_master.fortune_name} <br>
     * @return The value of the column 'fortune_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getFortuneName() {
        checkSpecifiedProperty("fortuneName");
        return _fortuneName;
    }

    /**
     * [set] fortune_name: {varchar(10), refers to fortune_master.fortune_name} <br>
     * @param fortuneName The value of the column 'fortune_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFortuneName(String fortuneName) {
        registerModifiedProperty("fortuneName");
        _fortuneName = fortuneName;
    }

    /**
     * [get] negaigoto: {varchar(30), refers to omikuji.negaigoto} <br>
     * @return The value of the column 'negaigoto'. (NullAllowed even if selected: for no constraint)
     */
    public String getNegaigoto() {
        checkSpecifiedProperty("negaigoto");
        return _negaigoto;
    }

    /**
     * [set] negaigoto: {varchar(30), refers to omikuji.negaigoto} <br>
     * @param negaigoto The value of the column 'negaigoto'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNegaigoto(String negaigoto) {
        registerModifiedProperty("negaigoto");
        _negaigoto = negaigoto;
    }

    /**
     * [get] akinai: {varchar(30), refers to omikuji.akinai} <br>
     * @return The value of the column 'akinai'. (NullAllowed even if selected: for no constraint)
     */
    public String getAkinai() {
        checkSpecifiedProperty("akinai");
        return _akinai;
    }

    /**
     * [set] akinai: {varchar(30), refers to omikuji.akinai} <br>
     * @param akinai The value of the column 'akinai'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAkinai(String akinai) {
        registerModifiedProperty("akinai");
        _akinai = akinai;
    }

    /**
     * [get] gakumon: {varchar(30), refers to omikuji.gakumon} <br>
     * @return The value of the column 'gakumon'. (NullAllowed even if selected: for no constraint)
     */
    public String getGakumon() {
        checkSpecifiedProperty("gakumon");
        return _gakumon;
    }

    /**
     * [set] gakumon: {varchar(30), refers to omikuji.gakumon} <br>
     * @param gakumon The value of the column 'gakumon'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGakumon(String gakumon) {
        registerModifiedProperty("gakumon");
        _gakumon = gakumon;
    }
}
