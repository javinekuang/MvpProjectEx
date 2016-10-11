package k.javine.mvpprojectex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import k.javine.mvpprojectex.common.IView;

public class MainActivity extends AppCompatActivity implements IView, View.OnClickListener {

    @Bind(R.id.result)
    TextView tv_result;
    @Bind(R.id.btn_update)
    Button btn_update;

    @Inject
    MyPresenter myPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        btn_update.setOnClickListener(this);
        DaggerAppComponent.builder()
                .myModule(new MyModule(this))
                .build()
                .inject(this);
    }

    @Override
    public void updateUi(String data) {
        tv_result.setText(data);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_update:
                myPresenter.loadData();
                break;
        }
    }
}
