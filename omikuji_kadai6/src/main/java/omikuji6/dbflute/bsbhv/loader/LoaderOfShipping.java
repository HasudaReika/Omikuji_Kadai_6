package omikuji6.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import omikuji6.dbflute.exbhv.*;
import omikuji6.dbflute.exentity.*;

/**
 * The referrer loader of shipping as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfShipping {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Shipping> _selectedList;
    protected BehaviorSelector _selector;
    protected ShippingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfShipping ready(List<Shipping> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ShippingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ShippingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfResult _foreignResultLoader;
    public LoaderOfResult pulloutResult() {
        if (_foreignResultLoader == null)
        { _foreignResultLoader = new LoaderOfResult().ready(myBhv().pulloutResult(_selectedList), _selector); }
        return _foreignResultLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Shipping> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
