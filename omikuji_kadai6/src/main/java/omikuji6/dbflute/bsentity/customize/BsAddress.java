package omikuji6.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import omikuji6.dbflute.exentity.customize.*;

/**
 * The entity of Address.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsAddress extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** prefecture: {varchar(20), refers to post_code_data.prefecture} */
    protected String _prefecture;

    /** city: {varchar(20), refers to post_code_data.city} */
    protected String _city;

    /** town: {varchar(50), refers to post_code_data.town} */
    protected String _town;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return omikuji6.dbflute.bsentity.customize.dbmeta.AddressDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "Address";
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
        if (obj instanceof BsAddress) {
            BsAddress other = (BsAddress)obj;
            if (!xSV(_prefecture, other._prefecture)) { return false; }
            if (!xSV(_city, other._city)) { return false; }
            if (!xSV(_town, other._town)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _prefecture);
        hs = xCH(hs, _city);
        hs = xCH(hs, _town);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_prefecture));
        sb.append(dm).append(xfND(_city));
        sb.append(dm).append(xfND(_town));
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
    public Address clone() {
        return (Address)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] prefecture: {varchar(20), refers to post_code_data.prefecture} <br>
     * @return The value of the column 'prefecture'. (NullAllowed even if selected: for no constraint)
     */
    public String getPrefecture() {
        checkSpecifiedProperty("prefecture");
        return _prefecture;
    }

    /**
     * [set] prefecture: {varchar(20), refers to post_code_data.prefecture} <br>
     * @param prefecture The value of the column 'prefecture'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrefecture(String prefecture) {
        registerModifiedProperty("prefecture");
        _prefecture = prefecture;
    }

    /**
     * [get] city: {varchar(20), refers to post_code_data.city} <br>
     * @return The value of the column 'city'. (NullAllowed even if selected: for no constraint)
     */
    public String getCity() {
        checkSpecifiedProperty("city");
        return _city;
    }

    /**
     * [set] city: {varchar(20), refers to post_code_data.city} <br>
     * @param city The value of the column 'city'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCity(String city) {
        registerModifiedProperty("city");
        _city = city;
    }

    /**
     * [get] town: {varchar(50), refers to post_code_data.town} <br>
     * @return The value of the column 'town'. (NullAllowed even if selected: for no constraint)
     */
    public String getTown() {
        checkSpecifiedProperty("town");
        return _town;
    }

    /**
     * [set] town: {varchar(50), refers to post_code_data.town} <br>
     * @param town The value of the column 'town'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTown(String town) {
        registerModifiedProperty("town");
        _town = town;
    }
}
