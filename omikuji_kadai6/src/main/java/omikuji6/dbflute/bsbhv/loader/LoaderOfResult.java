package omikuji6.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import omikuji6.dbflute.exbhv.*;
import omikuji6.dbflute.exentity.*;

/**
 * The referrer loader of result as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfResult {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Result> _selectedList;
    protected BehaviorSelector _selector;
    protected ResultBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfResult ready(List<Result> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ResultBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ResultBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfOmikuji _foreignOmikujiLoader;
    public LoaderOfOmikuji pulloutOmikuji() {
        if (_foreignOmikujiLoader == null)
        { _foreignOmikujiLoader = new LoaderOfOmikuji().ready(myBhv().pulloutOmikuji(_selectedList), _selector); }
        return _foreignOmikujiLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Result> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
