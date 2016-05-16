package com.helpshift.impactanalysis;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    findViews();
  }

  @SuppressWarnings("ConstantConditions")
  private void findViews() {
    (findViewById(R.id.showFAQs)).setOnClickListener(this);
    (findViewById(R.id.showFAQSection)).setOnClickListener(this);
    (findViewById(R.id.showSingleFAQ)).setOnClickListener(this);
    (findViewById(R.id.showConversation)).setOnClickListener(this);
    (findViewById(R.id.showInbox)).setOnClickListener(this);
    (findViewById(R.id.showMessage)).setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    //TODO: Call appropriate APIs
    switch (v.getId()) {
      case R.id.showFAQs:
        break;
      case R.id.showFAQSection:
        break;
      case R.id.showSingleFAQ:
        break;
      case R.id.showConversation:
        break;
      case R.id.showInbox:
        break;
      case R.id.showMessage:
        break;
    }
  }
}
