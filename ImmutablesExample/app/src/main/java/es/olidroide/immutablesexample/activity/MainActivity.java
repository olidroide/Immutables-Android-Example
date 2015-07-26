package es.olidroide.immutablesexample.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import es.olidroide.immutablesexample.R;
import es.olidroide.immutablesexample.model.ImmutableUser;
import es.olidroide.immutablesexample.model.User;
import es.olidroide.immutablesexample.model.mapper.JsonFromUser;
import es.olidroide.immutablesexample.model.mapper.UserFromJson;

public class MainActivity extends AppCompatActivity {

    private String jsonUser;
    private TextView userTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userTextView = (TextView) findViewById(R.id.activity_main_user_text_view);

        User user = ImmutableUser.builder().id(1).username("olidroide").build();
        jsonUser = new JsonFromUser().map(user);
    }

    @Override
    protected void onResume() {
        super.onResume();

        User user = new UserFromJson().map(jsonUser);

        userTextView.setText(user.toString());
    }
}
