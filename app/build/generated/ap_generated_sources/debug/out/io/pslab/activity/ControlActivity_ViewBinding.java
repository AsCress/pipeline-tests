// Generated code from Butter Knife. Do not modify!
package io.pslab.activity;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import io.pslab.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ControlActivity_ViewBinding implements Unbinder {
  private ControlActivity target;

  @UiThread
  public ControlActivity_ViewBinding(ControlActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ControlActivity_ViewBinding(ControlActivity target, View source) {
    this.target = target;

    target.bottomNavigationView = Utils.findRequiredViewAsType(source, R.id.navigation, "field 'bottomNavigationView'", BottomNavigationView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ControlActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.bottomNavigationView = null;
  }
}
