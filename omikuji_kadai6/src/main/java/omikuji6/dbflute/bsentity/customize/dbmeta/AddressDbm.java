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
 * The DB meta of Address. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class AddressDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final AddressDbm _instance = new AddressDbm();
    private AddressDbm() {}
    public static AddressDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((Address)et).getPrefecture(), (et, vl) -> ((Address)et).setPrefecture((String)vl), "prefecture");
        setupEpg(_epgMap, et -> ((Address)et).getCity(), (et, vl) -> ((Address)et).setCity((String)vl), "city");
        setupEpg(_epgMap, et -> ((Address)et).getTown(), (et, vl) -> ((Address)et).setTown((String)vl), "town");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "Address";
    protected final String _tableDispName = "Address";
    protected final String _tablePropertyName = "address";
    protected final TableSqlName _tableSqlName = new TableSqlName("Address", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPrefecture = cci("prefecture", "prefecture", null, null, String.class, "prefecture", null, false, false, false, "varchar", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCity = cci("city", "city", null, null, String.class, "city", null, false, false, false, "varchar", 20, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTown = cci("town", "town", null, null, String.class, "town", null, false, false, false, "varchar", 50, 0, null, null, false, null, null, null, null, null, false);

    /**
     * prefecture: {varchar(20), refers to post_code_data.prefecture}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPrefecture() { return _columnPrefecture; }
    /**
     * city: {varchar(20), refers to post_code_data.city}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCity() { return _columnCity; }
    /**
     * town: {varchar(50), refers to post_code_data.town}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTown() { return _columnTown; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
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
    public String getEntityTypeName() { return "omikuji6.dbflute.exentity.customize.Address"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Address> getEntityType() { return Address.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Address newEntity() { return new Address(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((Address)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((Address)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
