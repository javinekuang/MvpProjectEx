package k.javine.mvpprojectex;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import k.javine.mvpprojectex.common.IView;

/**
 * Created by KuangYu on 2016/10/11 0011.
 */
@Module
public class MyModule {

    private IView mainView;

    public MyModule(IView mainView){
        this.mainView = mainView;
    }

    @Provides
    public MyPresenter provideMyPresenter(){
        return new MyPresenter(mainView);
    }
}
