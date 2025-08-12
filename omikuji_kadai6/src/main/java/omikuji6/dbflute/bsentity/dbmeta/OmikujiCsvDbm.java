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
 * The DB meta of omikuji_csv. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class OmikujiCsvDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final OmikujiCsvDbm _instance = new OmikujiCsvDbm();
    private OmikujiCsvDbm() {}
    public static OmikujiCsvDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((OmikujiCsv)et).getNumber(), (et, vl) -> ((OmikujiCsv)et).setNumber(cti(vl)), "number");
        setupEpg(_epgMap, et -> ((OmikujiCsv)et).getUnsei(), (et, vl) -> ((OmikujiCsv)et).setUnsei((String)vl), "unsei");
        setupEpg(_epgMap, et -> ((OmikujiCsv)et).getNegaigoto(), (et, vl) -> ((OmikujiCsv)et).setNegaigoto((String)vl), "negaigoto");
        setupEpg(_epgMap, et -> ((OmikujiCsv)et).getAkinai(), (et, vl) -> ((OmikujiCsv)et).setAkinai((String)vl), "akinai");
        setupEpg(_epgMap, et -> ((OmikujiCsv)et).getGakumon(), (et, vl) -> ((OmikujiCsv)et).setGakumon((String)vl), "gakumon");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "omikuji_csv";
    protected final String _tableDispName = "omikuji_csv";
    protected final String _tablePropertyName = "omikujiCsv";
    protected final TableSqlName _tableSqlName = new TableSqlName("omikuji_csv", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnNumber = cci("number", "number", null, null, Integer.class, "number", null, false, false, true, "serial", 10, 0, null, "nextval('omikuji_csv_number_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUnsei = cci("unsei", "unsei", null, null, String.class, "unsei", null, false, false, false, "varchar", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNegaigoto = cci("negaigoto", "negaigoto", null, null, String.class, "negaigoto", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAkinai = cci("akinai", "akinai", null, null, String.class, "akinai", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGakumon = cci("gakumon", "gakumon", null, null, String.class, "gakumon", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);

    /**
     * number: {NotNull, serial(10), default=[nextval('omikuji_csv_number_seq'::regclass)]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNumber() { return _columnNumber; }
    /**
     * unsei: {varchar(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUnsei() { return _columnUnsei; }
    /**
     * negaigoto: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNegaigoto() { return _columnNegaigoto; }
    /**
     * akinai: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAkinai() { return _columnAkinai; }
    /**
     * gakumon: {varchar(30)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGakumon() { return _columnGakumon; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnNumber());
        ls.add(columnUnsei());
        ls.add(columnNegaigoto());
        ls.add(columnAkinai());
        ls.add(columnGakumon());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "omikuji6.dbflute.exentity.OmikujiCsv"; }
    public String getConditionBeanTypeName() { return "omikuji6.dbflute.cbean.OmikujiCsvCB"; }
    public String getBehaviorTypeName() { return "omikuji6.dbflute.exbhv.OmikujiCsvBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<OmikujiCsv> getEntityType() { return OmikujiCsv.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public OmikujiCsv newEntity() { return new OmikujiCsv(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((OmikujiCsv)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((OmikujiCsv)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
