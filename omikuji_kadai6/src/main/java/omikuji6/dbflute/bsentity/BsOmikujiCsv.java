package omikuji6.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import omikuji6.dbflute.allcommon.DBMetaInstanceHandler;
import omikuji6.dbflute.exentity.*;

/**
 * The entity of omikuji_csv as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsOmikujiCsv extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** number: {NotNull, serial(10), default=[nextval('omikuji_csv_number_seq'::regclass)]} */
    protected Integer _number;

    /** unsei: {varchar(10)} */
    protected String _unsei;

    /** negaigoto: {varchar(30)} */
    protected String _negaigoto;

    /** akinai: {varchar(30)} */
    protected String _akinai;

    /** gakumon: {varchar(30)} */
    protected String _gakumon;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "omikuji_csv";
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
        if (obj instanceof BsOmikujiCsv) {
            BsOmikujiCsv other = (BsOmikujiCsv)obj;
            if (!xSV(_number, other._number)) { return false; }
            if (!xSV(_unsei, other._unsei)) { return false; }
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
        hs = xCH(hs, _number);
        hs = xCH(hs, _unsei);
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
        sb.append(dm).append(xfND(_number));
        sb.append(dm).append(xfND(_unsei));
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
    public OmikujiCsv clone() {
        return (OmikujiCsv)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] number: {NotNull, serial(10), default=[nextval('omikuji_csv_number_seq'::regclass)]} <br>
     * @return The value of the column 'number'. (basically NotNull if selected: for the constraint)
     */
    public Integer getNumber() {
        checkSpecifiedProperty("number");
        return _number;
    }

    /**
     * [set] number: {NotNull, serial(10), default=[nextval('omikuji_csv_number_seq'::regclass)]} <br>
     * @param number The value of the column 'number'. (basically NotNull if update: for the constraint)
     */
    public void setNumber(Integer number) {
        registerModifiedProperty("number");
        _number = number;
    }

    /**
     * [get] unsei: {varchar(10)} <br>
     * @return The value of the column 'unsei'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnsei() {
        checkSpecifiedProperty("unsei");
        return _unsei;
    }

    /**
     * [set] unsei: {varchar(10)} <br>
     * @param unsei The value of the column 'unsei'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnsei(String unsei) {
        registerModifiedProperty("unsei");
        _unsei = unsei;
    }

    /**
     * [get] negaigoto: {varchar(30)} <br>
     * @return The value of the column 'negaigoto'. (NullAllowed even if selected: for no constraint)
     */
    public String getNegaigoto() {
        checkSpecifiedProperty("negaigoto");
        return _negaigoto;
    }

    /**
     * [set] negaigoto: {varchar(30)} <br>
     * @param negaigoto The value of the column 'negaigoto'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNegaigoto(String negaigoto) {
        registerModifiedProperty("negaigoto");
        _negaigoto = negaigoto;
    }

    /**
     * [get] akinai: {varchar(30)} <br>
     * @return The value of the column 'akinai'. (NullAllowed even if selected: for no constraint)
     */
    public String getAkinai() {
        checkSpecifiedProperty("akinai");
        return _akinai;
    }

    /**
     * [set] akinai: {varchar(30)} <br>
     * @param akinai The value of the column 'akinai'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAkinai(String akinai) {
        registerModifiedProperty("akinai");
        _akinai = akinai;
    }

    /**
     * [get] gakumon: {varchar(30)} <br>
     * @return The value of the column 'gakumon'. (NullAllowed even if selected: for no constraint)
     */
    public String getGakumon() {
        checkSpecifiedProperty("gakumon");
        return _gakumon;
    }

    /**
     * [set] gakumon: {varchar(30)} <br>
     * @param gakumon The value of the column 'gakumon'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGakumon(String gakumon) {
        registerModifiedProperty("gakumon");
        _gakumon = gakumon;
    }
}
