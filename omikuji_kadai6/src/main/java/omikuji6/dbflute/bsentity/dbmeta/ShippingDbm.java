package omikuji6.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import omikuji6.dbflute.allcommon.*;
import omikuji6.dbflute.exentity.*;

/**
 * The DB meta of shipping. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ShippingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ShippingDbm _instance = new ShippingDbm();
    private ShippingDbm() {}
    public static ShippingDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((Shipping)et).getId(), (et, vl) -> ((Shipping)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((Shipping)et).getResultCode(), (et, vl) -> ((Shipping)et).setResultCode(cti(vl)), "resultCode");
        setupEpg(_epgMap, et -> ((Shipping)et).getPostCode(), (et, vl) -> ((Shipping)et).setPostCode((String)vl), "postCode");
        setupEpg(_epgMap, et -> ((Shipping)et).getAddress(), (et, vl) -> ((Shipping)et).setAddress((String)vl), "address");
        setupEpg(_epgMap, et -> ((Shipping)et).getName(), (et, vl) -> ((Shipping)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((Shipping)et).getPhone(), (et, vl) -> ((Shipping)et).setPhone((String)vl), "phone");
        setupEpg(_epgMap, et -> ((Shipping)et).getMail(), (et, vl) -> ((Shipping)et).setMail((String)vl), "mail");
        setupEpg(_epgMap, et -> ((Shipping)et).getUpdatedDate(), (et, vl) -> ((Shipping)et).setUpdatedDate(ctld(vl)), "updatedDate");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((Shipping)et).getResult(), (et, vl) -> ((Shipping)et).setResult((OptionalEntity<Result>)vl), "result");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "shipping";
    protected final String _tableDispName = "shipping";
    protected final String _tablePropertyName = "shipping";
    protected final TableSqlName _tableSqlName = new TableSqlName("shipping", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, Integer.class, "id", null, true, true, true, "serial", 10, 0, null, "nextval('shipping_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnResultCode = cci("result_code", "result_code", null, null, Integer.class, "resultCode", null, false, false, false, "int4", 10, 0, null, null, false, null, null, "result", null, null, false);
    protected final ColumnInfo _columnPostCode = cci("post_code", "post_code", null, null, String.class, "postCode", null, false, false, false, "varchar", 7, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAddress = cci("address", "address", null, null, String.class, "address", null, false, false, false, "varchar", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnName = cci("name", "name", null, null, String.class, "name", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPhone = cci("phone", "phone", null, null, String.class, "phone", null, false, false, false, "varchar", 11, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMail = cci("mail", "mail", null, null, String.class, "mail", null, false, false, false, "varchar", 200, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdatedDate = cci("updated_date", "updated_date", null, null, java.time.LocalDate.class, "updatedDate", null, false, false, false, "date", 13, 0, null, null, false, null, null, null, null, null, false);

    /**
     * id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * result_code: {int4(10), FK to result}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnResultCode() { return _columnResultCode; }
    /**
     * post_code: {varchar(7)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPostCode() { return _columnPostCode; }
    /**
     * address: {varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAddress() { return _columnAddress; }
    /**
     * name: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnName() { return _columnName; }
    /**
     * phone: {varchar(11)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPhone() { return _columnPhone; }
    /**
     * mail: {varchar(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMail() { return _columnMail; }
    /**
     * updated_date: {date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdatedDate() { return _columnUpdatedDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnResultCode());
        ls.add(columnPostCode());
        ls.add(columnAddress());
        ls.add(columnName());
        ls.add(columnPhone());
        ls.add(columnMail());
        ls.add(columnUpdatedDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * result by my result_code, named 'result'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignResult() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnResultCode(), ResultDbm.getInstance().columnResultCode());
        return cfi("fk_result_shipping", "result", this, ResultDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "shippingList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "SEQ_ID"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "omikuji6.dbflute.exentity.Shipping"; }
    public String getConditionBeanTypeName() { return "omikuji6.dbflute.cbean.ShippingCB"; }
    public String getBehaviorTypeName() { return "omikuji6.dbflute.exbhv.ShippingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Shipping> getEntityType() { return Shipping.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Shipping newEntity() { return new Shipping(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Shipping)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Shipping)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
