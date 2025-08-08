package omikuji6.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import omikuji6.dbflute.exbhv.*;
import omikuji6.dbflute.exentity.*;

/**
 * The referrer loader of test as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTest {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Test> _selectedList;
    protected BehaviorSelector _selector;
    protected TestBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTest ready(List<Test> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TestBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TestBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Test> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
