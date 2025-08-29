package omikuji6.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import omikuji6.dbflute.allcommon.*;
import omikuji6.dbflute.exentity.*;

/**
 * The DB meta of post_code_data. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PostCodeDataDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PostCodeDataDbm _instance = new PostCodeDataDbm();
    private PostCodeDataDbm() {}
    public static PostCodeDataDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((PostCodeData)et).getId(), (et, vl) -> ((PostCodeData)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((PostCodeData)et).getPostCode(), (et, vl) -> ((PostCodeData)et).setPostCode((String)vl), "postCode");
        setupEpg(_epgMap, et -> ((PostCodeData)et).getPrefecture(), (et, vl) -> ((PostCodeData)et).setPrefecture((String)vl), "prefecture");
        setupEpg(_epgMap, et -> ((PostCodeData)et).getCity(), (et, vl) -> ((PostCodeData)et).setCity((String)vl), "city");
        setupEpg(_epgMap, et -> ((PostCodeData)et).getTown(), (et, vl) -> ((PostCodeData)et).setTown((String)vl), "town");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "post_code_data";
    protected final String _tableDispName = "post_code_data";
    protected final String _tablePropertyName = "postCodeData";
    protected final TableSqlName _tableSqlName = new TableSqlName("post_code_data", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, Integer.class, "id", null, true, true, true, "serial", 10, 0, null, "nextval('post_code_data_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPostCode = cci("post_code", "post_code", null, null, String.class, "postCode", null, false, false, false, "varchar", 7, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPrefecture = cci("prefecture", "prefecture", null, null, String.class, "prefecture", null, false, false, false, "varchar", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCity = cci("city", "city", null, null, String.class, "city", null, false, false, false, "varchar", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTown = cci("town", "town", null, null, String.class, "town", null, false, false, false, "varchar", 50, 0, null, null, false, null, null, null, null, null, false);

    /**
     * id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * post_code: {varchar(7)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPostCode() { return _columnPostCode; }
    /**
     * prefecture: {varchar(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrefecture() { return _columnPrefecture; }
    /**
     * city: {varchar(20)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCity() { return _columnCity; }
    /**
     * town: {varchar(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTown() { return _columnTown; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnPostCode());
        ls.add(columnPrefecture());
        ls.add(columnCity());
        ls.add(columnTown());
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

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "post_code_data_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "omikuji6.dbflute.exentity.PostCodeData"; }
    public String getConditionBeanTypeName() { return "omikuji6.dbflute.cbean.PostCodeDataCB"; }
    public String getBehaviorTypeName() { return "omikuji6.dbflute.exbhv.PostCodeDataBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PostCodeData> getEntityType() { return PostCodeData.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PostCodeData newEntity() { return new PostCodeData(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PostCodeData)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PostCodeData)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
