package omikuji6.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import omikuji6.dbflute.allcommon.*;
import omikuji6.dbflute.exentity.customize.*;

/**
 * The DB meta of ResultPastSixMonths. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class ResultPastSixMonthsDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final ResultPastSixMonthsDbm _instance = new ResultPastSixMonthsDbm();
    private ResultPastSixMonthsDbm() {}
    public static ResultPastSixMonthsDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((ResultPastSixMonths)et).getFortuneTellingDate(), (et, vl) -> ((ResultPastSixMonths)et).setFortuneTellingDate(ctld(vl)), "fortuneTellingDate");
        setupEpg(_epgMap, et -> ((ResultPastSixMonths)et).getFortuneName(), (et, vl) -> ((ResultPastSixMonths)et).setFortuneName((String)vl), "fortuneName");
        setupEpg(_epgMap, et -> ((ResultPastSixMonths)et).getNegaigoto(), (et, vl) -> ((ResultPastSixMonths)et).setNegaigoto((String)vl), "negaigoto");
        setupEpg(_epgMap, et -> ((ResultPastSixMonths)et).getAkinai(), (et, vl) -> ((ResultPastSixMonths)et).setAkinai((String)vl), "akinai");
        setupEpg(_epgMap, et -> ((ResultPastSixMonths)et).getGakumon(), (et, vl) -> ((ResultPastSixMonths)et).setGakumon((String)vl), "gakumon");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "ResultPastSixMonths";
    protected final String _tableDispName = "ResultPastSixMonths";
    protected final String _tablePropertyName = "resultPastSixMonths";
    protected final TableSqlName _tableSqlName = new TableSqlName("ResultPastSixMonths", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnFortuneTellingDate = cci("fortune_telling_date", "fortune_telling_date", null, null, java.time.LocalDate.class, "fortuneTellingDate", null, false, false, false, "date", 13, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFortuneName = cci("fortune_name", "fortune_name", null, null, String.class, "fortuneName", null, false, false, false, "varchar", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNegaigoto = cci("negaigoto", "negaigoto", null, null, String.class, "negaigoto", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAkinai = cci("akinai", "akinai", null, null, String.class, "akinai", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGakumon = cci("gakumon", "gakumon", null, null, String.class, "gakumon", null, false, false, false, "varchar", 30, 0, null, null, false, null, null, null, null, null, false);

    /**
     * fortune_telling_date: {date(13), refers to result.fortune_telling_date}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFortuneTellingDate() { return _columnFortuneTellingDate; }
    /**
     * fortune_name: {varchar(10), refers to fortune_master.fortune_name}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFortuneName() { return _columnFortuneName; }
    /**
     * negaigoto: {varchar(30), refers to omikuji.negaigoto}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNegaigoto() { return _columnNegaigoto; }
    /**
     * akinai: {varchar(30), refers to omikuji.akinai}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAkinai() { return _columnAkinai; }
    /**
     * gakumon: {varchar(30), refers to omikuji.gakumon}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGakumon() { return _columnGakumon; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnFortuneTellingDate());
        ls.add(columnFortuneName());
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
    public String getEntityTypeName() { return "omikuji6.dbflute.exentity.customize.ResultPastSixMonths"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<ResultPastSixMonths> getEntityType() { return ResultPastSixMonths.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public ResultPastSixMonths newEntity() { return new ResultPastSixMonths(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((ResultPastSixMonths)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((ResultPastSixMonths)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
