package omikuji6.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import omikuji6.dbflute.allcommon.DBMetaInstanceHandler;
import omikuji6.dbflute.exentity.*;

/**
 * The entity of post_code_data as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPostCodeData extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** id: {PK, ID, NotNull, serial(10)} */
    protected Integer _id;

    /** post_code: {varchar(7)} */
    protected String _postCode;

    /** prefecture: {varchar(20)} */
    protected String _prefecture;

    /** city: {varchar(20)} */
    protected String _city;

    /** town: {varchar(50)} */
    protected String _town;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "post_code_data";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
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
        if (obj instanceof BsPostCodeData) {
            BsPostCodeData other = (BsPostCodeData)obj;
            if (!xSV(_id, other._id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_postCode));
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
    public PostCodeData clone() {
        return (PostCodeData)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] id: {PK, ID, NotNull, serial(10)} <br>
     * @param id The value of the column 'id'. (basically NotNull if update: for the constraint)
     */
    public void setId(Integer id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] post_code: {varchar(7)} <br>
     * @return The value of the column 'post_code'. (NullAllowed even if selected: for no constraint)
     */
    public String getPostCode() {
        checkSpecifiedProperty("postCode");
        return _postCode;
    }

    /**
     * [set] post_code: {varchar(7)} <br>
     * @param postCode The value of the column 'post_code'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPostCode(String postCode) {
        registerModifiedProperty("postCode");
        _postCode = postCode;
    }

    /**
     * [get] prefecture: {varchar(20)} <br>
     * @return The value of the column 'prefecture'. (NullAllowed even if selected: for no constraint)
     */
    public String getPrefecture() {
        checkSpecifiedProperty("prefecture");
        return _prefecture;
    }

    /**
     * [set] prefecture: {varchar(20)} <br>
     * @param prefecture The value of the column 'prefecture'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrefecture(String prefecture) {
        registerModifiedProperty("prefecture");
        _prefecture = prefecture;
    }

    /**
     * [get] city: {varchar(20)} <br>
     * @return The value of the column 'city'. (NullAllowed even if selected: for no constraint)
     */
    public String getCity() {
        checkSpecifiedProperty("city");
        return _city;
    }

    /**
     * [set] city: {varchar(20)} <br>
     * @param city The value of the column 'city'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCity(String city) {
        registerModifiedProperty("city");
        _city = city;
    }

    /**
     * [get] town: {varchar(50)} <br>
     * @return The value of the column 'town'. (NullAllowed even if selected: for no constraint)
     */
    public String getTown() {
        checkSpecifiedProperty("town");
        return _town;
    }

    /**
     * [set] town: {varchar(50)} <br>
     * @param town The value of the column 'town'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTown(String town) {
        registerModifiedProperty("town");
        _town = town;
    }
}
