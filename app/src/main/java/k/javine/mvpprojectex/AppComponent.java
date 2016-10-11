package k.javine.mvpprojectex;

import dagger.Component;

/**
 * Created by KuangYu on 2016/10/11 0011.
 */
@Component(modules = MyModule.class)
public interface AppComponent {
    void inject(MainActivity activity);
}
