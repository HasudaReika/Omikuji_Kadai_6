package omikuji6.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import omikuji6.dbflute.exentity.customize.*;

/**
 * The entity of ByAddress.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsByAddress extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** post_code: {varchar(7), refers to post_code_data.post_code} */
    protected String _postCode;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return omikuji6.dbflute.bsentity.customize.dbmeta.ByAddressDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "ByAddress";
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
        if (obj instanceof BsByAddress) {
            BsByAddress other = (BsByAddress)obj;
            if (!xSV(_postCode, other._postCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _postCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_postCode));
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
    public ByAddress clone() {
        return (ByAddress)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] post_code: {varchar(7), refers to post_code_data.post_code} <br>
     * @return The value of the column 'post_code'. (NullAllowed even if selected: for no constraint)
     */
    public String getPostCode() {
        checkSpecifiedProperty("postCode");
        return _postCode;
    }

    /**
     * [set] post_code: {varchar(7), refers to post_code_data.post_code} <br>
     * @param postCode The value of the column 'post_code'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPostCode(String postCode) {
        registerModifiedProperty("postCode");
        _postCode = postCode;
    }
}
