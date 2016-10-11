package k.javine.mvpprojectex;

import javax.inject.Inject;

import k.javine.mvpprojectex.common.IPresenter;
import k.javine.mvpprojectex.common.IView;

/**
 * Created by KuangYu on 2016/10/11 0011.
 */
public class MyPresenter implements IPresenter{
    private IView mainView;

    public MyPresenter(IView view){
        mainView = view;
    }


    @Override
    public void loadData() {
        mainView.updateUi("Mvp Update UI "+System.currentTimeMillis());
    }
}
