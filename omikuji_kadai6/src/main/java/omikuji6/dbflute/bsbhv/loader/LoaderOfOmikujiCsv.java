package omikuji6.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import omikuji6.dbflute.exbhv.*;
import omikuji6.dbflute.exentity.*;

/**
 * The referrer loader of omikuji_csv as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfOmikujiCsv {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<OmikujiCsv> _selectedList;
    protected BehaviorSelector _selector;
    protected OmikujiCsvBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfOmikujiCsv ready(List<OmikujiCsv> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected OmikujiCsvBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(OmikujiCsvBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<OmikujiCsv> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
